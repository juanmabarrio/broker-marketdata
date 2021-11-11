package org.broker.marketdata.storage.db.migration;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import org.broker.marketdata.configuration.DatabaseConfiguration;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlywayMigration {

  private static final Logger LOG = LoggerFactory.getLogger(FlywayMigration.class);

  private FlywayMigration() {}

  public static Future<Void> migrate(final Vertx vertx, final DatabaseConfiguration config) {
    LOG.debug("DB Config: {}", config);
    return vertx.<Void>executeBlocking(promise -> {
      // Flyway migration is blocking => uses JDBC
      executeMigration(config);
      promise.complete();
    }).onFailure(err -> LOG.error("Failed to migrate db schema with error: ", err));
  }

  private static void executeMigration(final DatabaseConfiguration config) {
    final String jdbcUrl = getConnectionString(config);

    final Flyway flyway = Flyway.configure()
      .dataSource(jdbcUrl, config.getUser(), config.getPassword())
      .schemas("broker")
      .defaultSchema("broker")
      .load();

    var current = Optional.ofNullable(flyway.info().current());
    current.ifPresent(info -> LOG.info("db schema is at version: {}", info.getVersion()));

    var pendingMigrations = flyway.info().pending();
    LOG.debug("Pending migrations are: {}", printMigrations(pendingMigrations));

    flyway.migrate();
  }

  private static String getConnectionString(DatabaseConfiguration config) {
    var database = "postgresql";
    //var database = "mysql";
    final String jdbcUrl = String.format("jdbc:%s://%s:%d/%s",
      database,
      config.getHost(),
      config.getPort(),
      config.getDatabase()
    );
    LOG.debug("Migrating DB schema using jdbc url: {}", jdbcUrl);
    return jdbcUrl;
  }

  private static String printMigrations(final MigrationInfo[] pending) {
    if (Objects.isNull(pending)) {
      return "[]";
    }
    return Arrays.stream(pending)
      .map(each -> each.getVersion() + " - " + each.getDescription())
      .collect(Collectors.joining(",", "[", "]"));
  }

}
