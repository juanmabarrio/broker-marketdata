// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InternalQuote.proto

package org.broker.marketdata.protos;

public interface QuoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:marketdata.Quote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string source = 1;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>required string source = 1;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>required string source = 1;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>required string topic = 2;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>required string topic = 2;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>required string topic = 2;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>required string symbol = 3;</code>
   * @return Whether the symbol field is set.
   */
  boolean hasSymbol();
  /**
   * <code>required string symbol = 3;</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>required string symbol = 3;</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>required string action = 4;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <code>required string action = 4;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <code>required string action = 4;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <code>optional double markPrice = 5;</code>
   * @return Whether the markPrice field is set.
   */
  boolean hasMarkPrice();
  /**
   * <code>optional double markPrice = 5;</code>
   * @return The markPrice.
   */
  double getMarkPrice();

  /**
   * <code>optional double bidPrice = 6;</code>
   * @return Whether the bidPrice field is set.
   */
  boolean hasBidPrice();
  /**
   * <code>optional double bidPrice = 6;</code>
   * @return The bidPrice.
   */
  double getBidPrice();

  /**
   * <code>optional double midPrice = 7;</code>
   * @return Whether the midPrice field is set.
   */
  boolean hasMidPrice();
  /**
   * <code>optional double midPrice = 7;</code>
   * @return The midPrice.
   */
  double getMidPrice();

  /**
   * <code>optional double askPrice = 8;</code>
   * @return Whether the askPrice field is set.
   */
  boolean hasAskPrice();
  /**
   * <code>optional double askPrice = 8;</code>
   * @return The askPrice.
   */
  double getAskPrice();

  /**
   * <code>optional double volume = 9;</code>
   * @return Whether the volume field is set.
   */
  boolean hasVolume();
  /**
   * <code>optional double volume = 9;</code>
   * @return The volume.
   */
  double getVolume();

  /**
   * <code>optional int64 sourceTimestamp = 10;</code>
   * @return Whether the sourceTimestamp field is set.
   */
  boolean hasSourceTimestamp();
  /**
   * <code>optional int64 sourceTimestamp = 10;</code>
   * @return The sourceTimestamp.
   */
  long getSourceTimestamp();

  /**
   * <code>optional int64 arrivalTimestamp = 11;</code>
   * @return Whether the arrivalTimestamp field is set.
   */
  boolean hasArrivalTimestamp();
  /**
   * <code>optional int64 arrivalTimestamp = 11;</code>
   * @return The arrivalTimestamp.
   */
  long getArrivalTimestamp();

  /**
   * <code>optional int64 publishTimestamp = 12;</code>
   * @return Whether the publishTimestamp field is set.
   */
  boolean hasPublishTimestamp();
  /**
   * <code>optional int64 publishTimestamp = 12;</code>
   * @return The publishTimestamp.
   */
  long getPublishTimestamp();
}