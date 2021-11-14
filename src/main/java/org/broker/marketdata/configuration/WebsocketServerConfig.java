package org.broker.marketdata.configuration;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "ws.server")
@ToString
public class WebsocketServerConfig {

  @NonNull
  String host;
  @NonNull
  Integer port;
  @NonNull
  String path;

}
