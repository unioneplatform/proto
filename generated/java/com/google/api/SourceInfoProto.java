// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/source_info.proto
// Protobuf Java Version: 4.26.1

package com.google.api;

public final class SourceInfoProto {
  private SourceInfoProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      SourceInfoProto.class.getName());
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
    internal_static_google_api_SourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_SourceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/api/source_info.proto\022\ngoogle.a" +
      "pi\032\031google/protobuf/any.proto\"E\n\nSourceI" +
      "nfo\0227\n\014source_files\030\001 \003(\0132\024.google.proto" +
      "buf.AnyR\013sourceFilesBq\n\016com.google.apiB\017" +
      "SourceInfoProtoP\001ZEgoogle.golang.org/gen" +
      "proto/googleapis/api/serviceconfig;servi" +
      "ceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_google_api_SourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_SourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_SourceInfo_descriptor,
        new java.lang.String[] { "SourceFiles", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
