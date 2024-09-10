// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

// Protobuf Java Version: 4.26.1
package com.google.api;

public interface SystemParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SystemParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2 [json_name = "httpHeader"];</code>
   * @return The httpHeader.
   */
  java.lang.String getHttpHeader();
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2 [json_name = "httpHeader"];</code>
   * @return The bytes for httpHeader.
   */
  com.google.protobuf.ByteString
      getHttpHeaderBytes();

  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3 [json_name = "urlQueryParameter"];</code>
   * @return The urlQueryParameter.
   */
  java.lang.String getUrlQueryParameter();
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3 [json_name = "urlQueryParameter"];</code>
   * @return The bytes for urlQueryParameter.
   */
  com.google.protobuf.ByteString
      getUrlQueryParameterBytes();
}
