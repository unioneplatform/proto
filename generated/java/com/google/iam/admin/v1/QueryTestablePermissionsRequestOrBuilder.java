// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 4.26.1
package com.google.iam.admin.v1;

public interface QueryTestablePermissionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.QueryTestablePermissionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The full resource name to query from the list of testable
   * permissions.
   *
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1 [json_name = "fullResourceName"];</code>
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   * <pre>
   * Required. The full resource name to query from the list of testable
   * permissions.
   *
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1 [json_name = "fullResourceName"];</code>
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString
      getFullResourceNameBytes();

  /**
   * <pre>
   * Optional limit on the number of permissions to include in the response.
   * </pre>
   *
   * <code>int32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional pagination token returned in an earlier
   * QueryTestablePermissionsRequest.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional pagination token returned in an earlier
   * QueryTestablePermissionsRequest.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
