// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto

// Protobuf Java Version: 4.26.1
package com.google.api;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20 [json_name = "configVersion"];</code>
   * @return Whether the configVersion field is set.
   */
  boolean hasConfigVersion();
  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20 [json_name = "configVersion"];</code>
   * @return The configVersion.
   */
  com.google.protobuf.UInt32Value getConfigVersion();
  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20 [json_name = "configVersion"];</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConfigVersionOrBuilder();

  /**
   * <pre>
   * The DNS address at which this service is available,
   * e.g. `calendar.googleapis.com`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The DNS address at which this service is available,
   * e.g. `calendar.googleapis.com`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 33 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 33 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22 [json_name = "producerProjectId"];</code>
   * @return The producerProjectId.
   */
  java.lang.String getProducerProjectId();
  /**
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22 [json_name = "producerProjectId"];</code>
   * @return The bytes for producerProjectId.
   */
  com.google.protobuf.ByteString
      getProducerProjectIdBytes();

  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3 [json_name = "apis"];</code>
   */
  java.util.List<com.google.protobuf.Api> 
      getApisList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3 [json_name = "apis"];</code>
   */
  com.google.protobuf.Api getApis(int index);
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3 [json_name = "apis"];</code>
   */
  int getApisCount();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3 [json_name = "apis"];</code>
   */
  java.util.List<? extends com.google.protobuf.ApiOrBuilder> 
      getApisOrBuilderList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3 [json_name = "apis"];</code>
   */
  com.google.protobuf.ApiOrBuilder getApisOrBuilder(
      int index);

  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *
   * types:
   * - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4 [json_name = "types"];</code>
   */
  java.util.List<com.google.protobuf.Type> 
      getTypesList();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *
   * types:
   * - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4 [json_name = "types"];</code>
   */
  com.google.protobuf.Type getTypes(int index);
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *
   * types:
   * - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4 [json_name = "types"];</code>
   */
  int getTypesCount();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *
   * types:
   * - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4 [json_name = "types"];</code>
   */
  java.util.List<? extends com.google.protobuf.TypeOrBuilder> 
      getTypesOrBuilderList();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *
   * types:
   * - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4 [json_name = "types"];</code>
   */
  com.google.protobuf.TypeOrBuilder getTypesOrBuilder(
      int index);

  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   * enums:
   * - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5 [json_name = "enums"];</code>
   */
  java.util.List<com.google.protobuf.Enum> 
      getEnumsList();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   * enums:
   * - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5 [json_name = "enums"];</code>
   */
  com.google.protobuf.Enum getEnums(int index);
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   * enums:
   * - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5 [json_name = "enums"];</code>
   */
  int getEnumsCount();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   * enums:
   * - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5 [json_name = "enums"];</code>
   */
  java.util.List<? extends com.google.protobuf.EnumOrBuilder> 
      getEnumsOrBuilderList();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   * enums:
   * - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5 [json_name = "enums"];</code>
   */
  com.google.protobuf.EnumOrBuilder getEnumsOrBuilder(
      int index);

  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6 [json_name = "documentation"];</code>
   * @return Whether the documentation field is set.
   */
  boolean hasDocumentation();
  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6 [json_name = "documentation"];</code>
   * @return The documentation.
   */
  com.google.api.Documentation getDocumentation();
  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6 [json_name = "documentation"];</code>
   */
  com.google.api.DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8 [json_name = "backend"];</code>
   * @return Whether the backend field is set.
   */
  boolean hasBackend();
  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8 [json_name = "backend"];</code>
   * @return The backend.
   */
  com.google.api.Backend getBackend();
  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8 [json_name = "backend"];</code>
   */
  com.google.api.BackendOrBuilder getBackendOrBuilder();

  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9 [json_name = "http"];</code>
   * @return Whether the http field is set.
   */
  boolean hasHttp();
  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9 [json_name = "http"];</code>
   * @return The http.
   */
  com.google.api.Http getHttp();
  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9 [json_name = "http"];</code>
   */
  com.google.api.HttpOrBuilder getHttpOrBuilder();

  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10 [json_name = "quota"];</code>
   * @return Whether the quota field is set.
   */
  boolean hasQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10 [json_name = "quota"];</code>
   * @return The quota.
   */
  com.google.api.Quota getQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10 [json_name = "quota"];</code>
   */
  com.google.api.QuotaOrBuilder getQuotaOrBuilder();

  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11 [json_name = "authentication"];</code>
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11 [json_name = "authentication"];</code>
   * @return The authentication.
   */
  com.google.api.Authentication getAuthentication();
  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11 [json_name = "authentication"];</code>
   */
  com.google.api.AuthenticationOrBuilder getAuthenticationOrBuilder();

  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12 [json_name = "context"];</code>
   * @return The context.
   */
  com.google.api.Context getContext();
  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12 [json_name = "context"];</code>
   */
  com.google.api.ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15 [json_name = "usage"];</code>
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15 [json_name = "usage"];</code>
   * @return The usage.
   */
  com.google.api.Usage getUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15 [json_name = "usage"];</code>
   */
  com.google.api.UsageOrBuilder getUsageOrBuilder();

  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18 [json_name = "endpoints"];</code>
   */
  java.util.List<com.google.api.Endpoint> 
      getEndpointsList();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18 [json_name = "endpoints"];</code>
   */
  com.google.api.Endpoint getEndpoints(int index);
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18 [json_name = "endpoints"];</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18 [json_name = "endpoints"];</code>
   */
  java.util.List<? extends com.google.api.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18 [json_name = "endpoints"];</code>
   */
  com.google.api.EndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21 [json_name = "control"];</code>
   * @return Whether the control field is set.
   */
  boolean hasControl();
  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21 [json_name = "control"];</code>
   * @return The control.
   */
  com.google.api.Control getControl();
  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21 [json_name = "control"];</code>
   */
  com.google.api.ControlOrBuilder getControlOrBuilder();

  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23 [json_name = "logs"];</code>
   */
  java.util.List<com.google.api.LogDescriptor> 
      getLogsList();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23 [json_name = "logs"];</code>
   */
  com.google.api.LogDescriptor getLogs(int index);
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23 [json_name = "logs"];</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23 [json_name = "logs"];</code>
   */
  java.util.List<? extends com.google.api.LogDescriptorOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23 [json_name = "logs"];</code>
   */
  com.google.api.LogDescriptorOrBuilder getLogsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24 [json_name = "metrics"];</code>
   */
  java.util.List<com.google.api.MetricDescriptor> 
      getMetricsList();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24 [json_name = "metrics"];</code>
   */
  com.google.api.MetricDescriptor getMetrics(int index);
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24 [json_name = "metrics"];</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24 [json_name = "metrics"];</code>
   */
  java.util.List<? extends com.google.api.MetricDescriptorOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24 [json_name = "metrics"];</code>
   */
  com.google.api.MetricDescriptorOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25 [json_name = "monitoredResources"];</code>
   */
  java.util.List<com.google.api.MonitoredResourceDescriptor> 
      getMonitoredResourcesList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25 [json_name = "monitoredResources"];</code>
   */
  com.google.api.MonitoredResourceDescriptor getMonitoredResources(int index);
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25 [json_name = "monitoredResources"];</code>
   */
  int getMonitoredResourcesCount();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25 [json_name = "monitoredResources"];</code>
   */
  java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder> 
      getMonitoredResourcesOrBuilderList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25 [json_name = "monitoredResources"];</code>
   */
  com.google.api.MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26 [json_name = "billing"];</code>
   * @return Whether the billing field is set.
   */
  boolean hasBilling();
  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26 [json_name = "billing"];</code>
   * @return The billing.
   */
  com.google.api.Billing getBilling();
  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26 [json_name = "billing"];</code>
   */
  com.google.api.BillingOrBuilder getBillingOrBuilder();

  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27 [json_name = "logging"];</code>
   * @return Whether the logging field is set.
   */
  boolean hasLogging();
  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27 [json_name = "logging"];</code>
   * @return The logging.
   */
  com.google.api.Logging getLogging();
  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27 [json_name = "logging"];</code>
   */
  com.google.api.LoggingOrBuilder getLoggingOrBuilder();

  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28 [json_name = "monitoring"];</code>
   * @return Whether the monitoring field is set.
   */
  boolean hasMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28 [json_name = "monitoring"];</code>
   * @return The monitoring.
   */
  com.google.api.Monitoring getMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28 [json_name = "monitoring"];</code>
   */
  com.google.api.MonitoringOrBuilder getMonitoringOrBuilder();

  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29 [json_name = "systemParameters"];</code>
   * @return Whether the systemParameters field is set.
   */
  boolean hasSystemParameters();
  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29 [json_name = "systemParameters"];</code>
   * @return The systemParameters.
   */
  com.google.api.SystemParameters getSystemParameters();
  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29 [json_name = "systemParameters"];</code>
   */
  com.google.api.SystemParametersOrBuilder getSystemParametersOrBuilder();

  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37 [json_name = "sourceInfo"];</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37 [json_name = "sourceInfo"];</code>
   * @return The sourceInfo.
   */
  com.google.api.SourceInfo getSourceInfo();
  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37 [json_name = "sourceInfo"];</code>
   */
  com.google.api.SourceInfoOrBuilder getSourceInfoOrBuilder();
}
