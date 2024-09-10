// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 4.26.1
package com.google.iam.admin.v1;

public interface PermissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.Permission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this Permission.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of this Permission.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The title of this Permission.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of this Permission.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * A brief description of what this Permission is used for.
   * This permission can ONLY be used in predefined roles.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A brief description of what this Permission is used for.
   * This permission can ONLY be used in predefined roles.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * This permission can ONLY be used in predefined roles.
   * </pre>
   *
   * <code>bool only_in_predefined_roles = 4 [json_name = "onlyInPredefinedRoles"];</code>
   * @return The onlyInPredefinedRoles.
   */
  boolean getOnlyInPredefinedRoles();

  /**
   * <pre>
   * The current launch stage of the permission.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Permission.PermissionLaunchStage stage = 5 [json_name = "stage"];</code>
   * @return The enum numeric value on the wire for stage.
   */
  int getStageValue();
  /**
   * <pre>
   * The current launch stage of the permission.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Permission.PermissionLaunchStage stage = 5 [json_name = "stage"];</code>
   * @return The stage.
   */
  com.google.iam.admin.v1.Permission.PermissionLaunchStage getStage();

  /**
   * <pre>
   * The current custom role support level.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Permission.CustomRolesSupportLevel custom_roles_support_level = 6 [json_name = "customRolesSupportLevel"];</code>
   * @return The enum numeric value on the wire for customRolesSupportLevel.
   */
  int getCustomRolesSupportLevelValue();
  /**
   * <pre>
   * The current custom role support level.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Permission.CustomRolesSupportLevel custom_roles_support_level = 6 [json_name = "customRolesSupportLevel"];</code>
   * @return The customRolesSupportLevel.
   */
  com.google.iam.admin.v1.Permission.CustomRolesSupportLevel getCustomRolesSupportLevel();
}
