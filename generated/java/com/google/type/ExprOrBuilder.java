// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/expr.proto

// Protobuf Java Version: 4.26.1
package com.google.type;

public interface ExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.Expr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Textual representation of an expression in
   * Common Expression Language syntax.
   *
   * The application context of the containing message determines which
   * well-known feature set of CEL is supported.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   * <pre>
   * Textual representation of an expression in
   * Common Expression Language syntax.
   *
   * The application context of the containing message determines which
   * well-known feature set of CEL is supported.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString
      getExpressionBytes();

  /**
   * <pre>
   * An optional title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * An optional title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * An optional description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * An optional string indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * An optional string indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();
}
