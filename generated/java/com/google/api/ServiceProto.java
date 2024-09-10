// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto
// Protobuf Java Version: 4.26.1

package com.google.api;

public final class ServiceProto {
  private ServiceProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ServiceProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Service_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/service.proto\022\ngoogle.api\032\034" +
      "google/api/annotations.proto\032\025google/api" +
      "/auth.proto\032\030google/api/backend.proto\032\030g" +
      "oogle/api/billing.proto\032\030google/api/cont" +
      "ext.proto\032\030google/api/control.proto\032\036goo" +
      "gle/api/documentation.proto\032\031google/api/" +
      "endpoint.proto\032\025google/api/http.proto\032\024g" +
      "oogle/api/log.proto\032\030google/api/logging." +
      "proto\032\027google/api/metric.proto\032#google/a" +
      "pi/monitored_resource.proto\032\033google/api/" +
      "monitoring.proto\032\026google/api/quota.proto" +
      "\032\034google/api/source_info.proto\032!google/a" +
      "pi/system_parameter.proto\032\026google/api/us" +
      "age.proto\032\031google/protobuf/api.proto\032\032go" +
      "ogle/protobuf/type.proto\032\036google/protobu" +
      "f/wrappers.proto\"\333\t\n\007Service\022C\n\016config_v" +
      "ersion\030\024 \001(\0132\034.google.protobuf.UInt32Val" +
      "ueR\rconfigVersion\022\022\n\004name\030\001 \001(\tR\004name\022\016\n" +
      "\002id\030! \001(\tR\002id\022\024\n\005title\030\002 \001(\tR\005title\022.\n\023p" +
      "roducer_project_id\030\026 \001(\tR\021producerProjec" +
      "tId\022(\n\004apis\030\003 \003(\0132\024.google.protobuf.ApiR" +
      "\004apis\022+\n\005types\030\004 \003(\0132\025.google.protobuf.T" +
      "ypeR\005types\022+\n\005enums\030\005 \003(\0132\025.google.proto" +
      "buf.EnumR\005enums\022?\n\rdocumentation\030\006 \001(\0132\031" +
      ".google.api.DocumentationR\rdocumentation" +
      "\022-\n\007backend\030\010 \001(\0132\023.google.api.BackendR\007" +
      "backend\022$\n\004http\030\t \001(\0132\020.google.api.HttpR" +
      "\004http\022\'\n\005quota\030\n \001(\0132\021.google.api.QuotaR" +
      "\005quota\022B\n\016authentication\030\013 \001(\0132\032.google." +
      "api.AuthenticationR\016authentication\022-\n\007co" +
      "ntext\030\014 \001(\0132\023.google.api.ContextR\007contex" +
      "t\022\'\n\005usage\030\017 \001(\0132\021.google.api.UsageR\005usa" +
      "ge\0222\n\tendpoints\030\022 \003(\0132\024.google.api.Endpo" +
      "intR\tendpoints\022-\n\007control\030\025 \001(\0132\023.google" +
      ".api.ControlR\007control\022-\n\004logs\030\027 \003(\0132\031.go" +
      "ogle.api.LogDescriptorR\004logs\0226\n\007metrics\030" +
      "\030 \003(\0132\034.google.api.MetricDescriptorR\007met" +
      "rics\022X\n\023monitored_resources\030\031 \003(\0132\'.goog" +
      "le.api.MonitoredResourceDescriptorR\022moni" +
      "toredResources\022-\n\007billing\030\032 \001(\0132\023.google" +
      ".api.BillingR\007billing\022-\n\007logging\030\033 \001(\0132\023" +
      ".google.api.LoggingR\007logging\0226\n\nmonitori" +
      "ng\030\034 \001(\0132\026.google.api.MonitoringR\nmonito" +
      "ring\022I\n\021system_parameters\030\035 \001(\0132\034.google" +
      ".api.SystemParametersR\020systemParameters\022" +
      "7\n\013source_info\030% \001(\0132\026.google.api.Source" +
      "InfoR\nsourceInfoJ\004\010e\020fBn\n\016com.google.api" +
      "B\014ServiceProtoP\001ZEgoogle.golang.org/genp" +
      "roto/googleapis/api/serviceconfig;servic" +
      "econfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.AuthProto.getDescriptor(),
          com.google.api.BackendProto.getDescriptor(),
          com.google.api.BillingProto.getDescriptor(),
          com.google.api.ContextProto.getDescriptor(),
          com.google.api.ControlProto.getDescriptor(),
          com.google.api.DocumentationProto.getDescriptor(),
          com.google.api.EndpointProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          com.google.api.LogProto.getDescriptor(),
          com.google.api.LoggingProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.api.MonitoringProto.getDescriptor(),
          com.google.api.QuotaProto.getDescriptor(),
          com.google.api.SourceInfoProto.getDescriptor(),
          com.google.api.SystemParameterProto.getDescriptor(),
          com.google.api.UsageProto.getDescriptor(),
          com.google.protobuf.ApiProto.getDescriptor(),
          com.google.protobuf.TypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_api_Service_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Service_descriptor,
        new java.lang.String[] { "ConfigVersion", "Name", "Id", "Title", "ProducerProjectId", "Apis", "Types", "Enums", "Documentation", "Backend", "Http", "Quota", "Authentication", "Context", "Usage", "Endpoints", "Control", "Logs", "Metrics", "MonitoredResources", "Billing", "Logging", "Monitoring", "SystemParameters", "SourceInfo", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.AuthProto.getDescriptor();
    com.google.api.BackendProto.getDescriptor();
    com.google.api.BillingProto.getDescriptor();
    com.google.api.ContextProto.getDescriptor();
    com.google.api.ControlProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.EndpointProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    com.google.api.LogProto.getDescriptor();
    com.google.api.LoggingProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.QuotaProto.getDescriptor();
    com.google.api.SourceInfoProto.getDescriptor();
    com.google.api.SystemParameterProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
    com.google.protobuf.TypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
