// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/type/log_severity.proto
// Protobuf Java Version: 4.26.1

package com.google.logging.type;

public final class LogSeverityProto {
  private LogSeverityProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      LogSeverityProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/logging/type/log_severity.proto" +
      "\022\023google.logging.type\032\034google/api/annota" +
      "tions.proto*\202\001\n\013LogSeverity\022\013\n\007DEFAULT\020\000" +
      "\022\t\n\005DEBUG\020d\022\t\n\004INFO\020\310\001\022\013\n\006NOTICE\020\254\002\022\014\n\007W" +
      "ARNING\020\220\003\022\n\n\005ERROR\020\364\003\022\r\n\010CRITICAL\020\330\004\022\n\n\005" +
      "ALERT\020\274\005\022\016\n\tEMERGENCY\020\240\006B\237\001\n\027com.google." +
      "logging.typeB\020LogSeverityProtoP\001Z8google" +
      ".golang.org/genproto/googleapis/logging/" +
      "type;ltype\252\002\031Google.Cloud.Logging.Type\312\002" +
      "\031Google\\Cloud\\Logging\\Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
