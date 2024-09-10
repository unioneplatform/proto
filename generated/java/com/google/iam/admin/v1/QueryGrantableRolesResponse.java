// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 4.26.1
package com.google.iam.admin.v1;

/**
 * <pre>
 * The grantable role query response.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.QueryGrantableRolesResponse}
 */
public final class QueryGrantableRolesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.QueryGrantableRolesResponse)
    QueryGrantableRolesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      QueryGrantableRolesResponse.class.getName());
  }
  // Use QueryGrantableRolesResponse.newBuilder() to construct.
  private QueryGrantableRolesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private QueryGrantableRolesResponse() {
    roles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_QueryGrantableRolesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_QueryGrantableRolesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.QueryGrantableRolesResponse.class, com.google.iam.admin.v1.QueryGrantableRolesResponse.Builder.class);
  }

  public static final int ROLES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.iam.admin.v1.Role> roles_;
  /**
   * <pre>
   * The list of matching roles.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.iam.admin.v1.Role> getRolesList() {
    return roles_;
  }
  /**
   * <pre>
   * The list of matching roles.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.iam.admin.v1.RoleOrBuilder> 
      getRolesOrBuilderList() {
    return roles_;
  }
  /**
   * <pre>
   * The list of matching roles.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public int getRolesCount() {
    return roles_.size();
  }
  /**
   * <pre>
   * The list of matching roles.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.Role getRoles(int index) {
    return roles_.get(index);
  }
  /**
   * <pre>
   * The list of matching roles.
   * </pre>
   *
   * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.RoleOrBuilder getRolesOrBuilder(
      int index) {
    return roles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * To retrieve the next page of results, set
   * `QueryGrantableRolesRequest.page_token` to this value.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * To retrieve the next page of results, set
   * `QueryGrantableRolesRequest.page_token` to this value.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < roles_.size(); i++) {
      output.writeMessage(1, roles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, roles_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.iam.admin.v1.QueryGrantableRolesResponse)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.QueryGrantableRolesResponse other = (com.google.iam.admin.v1.QueryGrantableRolesResponse) obj;

    if (!getRolesList()
        .equals(other.getRolesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRolesCount() > 0) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getRolesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.QueryGrantableRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.iam.admin.v1.QueryGrantableRolesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The grantable role query response.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.QueryGrantableRolesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.QueryGrantableRolesResponse)
      com.google.iam.admin.v1.QueryGrantableRolesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_QueryGrantableRolesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_QueryGrantableRolesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.QueryGrantableRolesResponse.class, com.google.iam.admin.v1.QueryGrantableRolesResponse.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.QueryGrantableRolesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
      } else {
        roles_ = null;
        rolesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_QueryGrantableRolesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.QueryGrantableRolesResponse getDefaultInstanceForType() {
      return com.google.iam.admin.v1.QueryGrantableRolesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.QueryGrantableRolesResponse build() {
      com.google.iam.admin.v1.QueryGrantableRolesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.QueryGrantableRolesResponse buildPartial() {
      com.google.iam.admin.v1.QueryGrantableRolesResponse result = new com.google.iam.admin.v1.QueryGrantableRolesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.iam.admin.v1.QueryGrantableRolesResponse result) {
      if (rolesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roles_ = java.util.Collections.unmodifiableList(roles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roles_ = roles_;
      } else {
        result.roles_ = rolesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.iam.admin.v1.QueryGrantableRolesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.admin.v1.QueryGrantableRolesResponse) {
        return mergeFrom((com.google.iam.admin.v1.QueryGrantableRolesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.QueryGrantableRolesResponse other) {
      if (other == com.google.iam.admin.v1.QueryGrantableRolesResponse.getDefaultInstance()) return this;
      if (rolesBuilder_ == null) {
        if (!other.roles_.isEmpty()) {
          if (roles_.isEmpty()) {
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRolesIsMutable();
            roles_.addAll(other.roles_);
          }
          onChanged();
        }
      } else {
        if (!other.roles_.isEmpty()) {
          if (rolesBuilder_.isEmpty()) {
            rolesBuilder_.dispose();
            rolesBuilder_ = null;
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rolesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRolesFieldBuilder() : null;
          } else {
            rolesBuilder_.addAllMessages(other.roles_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.iam.admin.v1.Role m =
                  input.readMessage(
                      com.google.iam.admin.v1.Role.parser(),
                      extensionRegistry);
              if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.add(m);
              } else {
                rolesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.iam.admin.v1.Role> roles_ =
      java.util.Collections.emptyList();
    private void ensureRolesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roles_ = new java.util.ArrayList<com.google.iam.admin.v1.Role>(roles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.iam.admin.v1.Role, com.google.iam.admin.v1.Role.Builder, com.google.iam.admin.v1.RoleOrBuilder> rolesBuilder_;

    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<com.google.iam.admin.v1.Role> getRolesList() {
      if (rolesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roles_);
      } else {
        return rolesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public int getRolesCount() {
      if (rolesBuilder_ == null) {
        return roles_.size();
      } else {
        return rolesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public com.google.iam.admin.v1.Role getRoles(int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);
      } else {
        return rolesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, com.google.iam.admin.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.set(index, value);
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, com.google.iam.admin.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.set(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(com.google.iam.admin.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, com.google.iam.admin.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(index, value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        com.google.iam.admin.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, com.google.iam.admin.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addAllRoles(
        java.lang.Iterable<? extends com.google.iam.admin.v1.Role> values) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roles_);
        onChanged();
      } else {
        rolesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder clearRoles() {
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rolesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder removeRoles(int index) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.remove(index);
        onChanged();
      } else {
        rolesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public com.google.iam.admin.v1.Role.Builder getRolesBuilder(
        int index) {
      return getRolesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public com.google.iam.admin.v1.RoleOrBuilder getRolesOrBuilder(
        int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);  } else {
        return rolesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<? extends com.google.iam.admin.v1.RoleOrBuilder> 
         getRolesOrBuilderList() {
      if (rolesBuilder_ != null) {
        return rolesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roles_);
      }
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public com.google.iam.admin.v1.Role.Builder addRolesBuilder() {
      return getRolesFieldBuilder().addBuilder(
          com.google.iam.admin.v1.Role.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public com.google.iam.admin.v1.Role.Builder addRolesBuilder(
        int index) {
      return getRolesFieldBuilder().addBuilder(
          index, com.google.iam.admin.v1.Role.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching roles.
     * </pre>
     *
     * <code>repeated .google.iam.admin.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<com.google.iam.admin.v1.Role.Builder> 
         getRolesBuilderList() {
      return getRolesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.iam.admin.v1.Role, com.google.iam.admin.v1.Role.Builder, com.google.iam.admin.v1.RoleOrBuilder> 
        getRolesFieldBuilder() {
      if (rolesBuilder_ == null) {
        rolesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.iam.admin.v1.Role, com.google.iam.admin.v1.Role.Builder, com.google.iam.admin.v1.RoleOrBuilder>(
                roles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roles_ = null;
      }
      return rolesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * To retrieve the next page of results, set
     * `QueryGrantableRolesRequest.page_token` to this value.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * To retrieve the next page of results, set
     * `QueryGrantableRolesRequest.page_token` to this value.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * To retrieve the next page of results, set
     * `QueryGrantableRolesRequest.page_token` to this value.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * To retrieve the next page of results, set
     * `QueryGrantableRolesRequest.page_token` to this value.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * To retrieve the next page of results, set
     * `QueryGrantableRolesRequest.page_token` to this value.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.QueryGrantableRolesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.QueryGrantableRolesResponse)
  private static final com.google.iam.admin.v1.QueryGrantableRolesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.QueryGrantableRolesResponse();
  }

  public static com.google.iam.admin.v1.QueryGrantableRolesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGrantableRolesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGrantableRolesResponse>() {
    @java.lang.Override
    public QueryGrantableRolesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryGrantableRolesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGrantableRolesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.QueryGrantableRolesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

