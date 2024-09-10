// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto
// Protobuf Java Version: 4.26.1

package com.google.api;

public final class QuotaProto {
  private QuotaProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      QuotaProto.class.getName());
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
    internal_static_google_api_Quota_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Quota_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MetricRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricRule_MetricCostsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MetricRule_MetricCostsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_QuotaLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_QuotaLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_QuotaLimit_ValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_QuotaLimit_ValuesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/api/quota.proto\022\ngoogle.api\032\034go" +
      "ogle/api/annotations.proto\"r\n\005Quota\022.\n\006l" +
      "imits\030\003 \003(\0132\026.google.api.QuotaLimitR\006lim" +
      "its\0229\n\014metric_rules\030\004 \003(\0132\026.google.api.M" +
      "etricRuleR\013metricRules\"\264\001\n\nMetricRule\022\032\n" +
      "\010selector\030\001 \001(\tR\010selector\022J\n\014metric_cost" +
      "s\030\002 \003(\0132\'.google.api.MetricRule.MetricCo" +
      "stsEntryR\013metricCosts\032>\n\020MetricCostsEntr" +
      "y\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\003R\005valu" +
      "e:\0028\001\"\203\003\n\nQuotaLimit\022\022\n\004name\030\006 \001(\tR\004name" +
      "\022 \n\013description\030\002 \001(\tR\013description\022#\n\rde" +
      "fault_limit\030\003 \001(\003R\014defaultLimit\022\033\n\tmax_l" +
      "imit\030\004 \001(\003R\010maxLimit\022\033\n\tfree_tier\030\007 \001(\003R" +
      "\010freeTier\022\032\n\010duration\030\005 \001(\tR\010duration\022\026\n" +
      "\006metric\030\010 \001(\tR\006metric\022\022\n\004unit\030\t \001(\tR\004uni" +
      "t\022:\n\006values\030\n \003(\0132\".google.api.QuotaLimi" +
      "t.ValuesEntryR\006values\022!\n\014display_name\030\014 " +
      "\001(\tR\013displayName\0329\n\013ValuesEntry\022\020\n\003key\030\001" +
      " \001(\tR\003key\022\024\n\005value\030\002 \001(\003R\005value:\0028\001Bl\n\016c" +
      "om.google.apiB\nQuotaProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/api/serviceco" +
      "nfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_api_Quota_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Quota_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Quota_descriptor,
        new java.lang.String[] { "Limits", "MetricRules", });
    internal_static_google_api_MetricRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MetricRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MetricRule_descriptor,
        new java.lang.String[] { "Selector", "MetricCosts", });
    internal_static_google_api_MetricRule_MetricCostsEntry_descriptor =
      internal_static_google_api_MetricRule_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MetricRule_MetricCostsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MetricRule_MetricCostsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_QuotaLimit_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_QuotaLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_QuotaLimit_descriptor,
        new java.lang.String[] { "Name", "Description", "DefaultLimit", "MaxLimit", "FreeTier", "Duration", "Metric", "Unit", "Values", "DisplayName", });
    internal_static_google_api_QuotaLimit_ValuesEntry_descriptor =
      internal_static_google_api_QuotaLimit_descriptor.getNestedTypes().get(0);
    internal_static_google_api_QuotaLimit_ValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_QuotaLimit_ValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
