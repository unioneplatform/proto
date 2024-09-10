// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

// Protobuf Java Version: 4.26.1
package com.google.api;

public interface AuthenticationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Authentication)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of authentication rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.AuthenticationRule rules = 3 [json_name = "rules"];</code>
   */
  java.util.List<com.google.api.AuthenticationRule> 
      getRulesList();
  /**
   * <pre>
   * A list of authentication rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.AuthenticationRule rules = 3 [json_name = "rules"];</code>
   */
  com.google.api.AuthenticationRule getRules(int index);
  /**
   * <pre>
   * A list of authentication rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.AuthenticationRule rules = 3 [json_name = "rules"];</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * A list of authentication rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.AuthenticationRule rules = 3 [json_name = "rules"];</code>
   */
  java.util.List<? extends com.google.api.AuthenticationRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * A list of authentication rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.AuthenticationRule rules = 3 [json_name = "rules"];</code>
   */
  com.google.api.AuthenticationRuleOrBuilder getRulesOrBuilder(
      int index);

  /**
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   *
   * <code>repeated .google.api.AuthProvider providers = 4 [json_name = "providers"];</code>
   */
  java.util.List<com.google.api.AuthProvider> 
      getProvidersList();
  /**
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   *
   * <code>repeated .google.api.AuthProvider providers = 4 [json_name = "providers"];</code>
   */
  com.google.api.AuthProvider getProviders(int index);
  /**
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   *
   * <code>repeated .google.api.AuthProvider providers = 4 [json_name = "providers"];</code>
   */
  int getProvidersCount();
  /**
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   *
   * <code>repeated .google.api.AuthProvider providers = 4 [json_name = "providers"];</code>
   */
  java.util.List<? extends com.google.api.AuthProviderOrBuilder> 
      getProvidersOrBuilderList();
  /**
   * <pre>
   * Defines a set of authentication providers that a service supports.
   * </pre>
   *
   * <code>repeated .google.api.AuthProvider providers = 4 [json_name = "providers"];</code>
   */
  com.google.api.AuthProviderOrBuilder getProvidersOrBuilder(
      int index);
}
