// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/context.proto

// Protobuf Java Version: 4.26.1
package com.google.api;

/**
 * <pre>
 * A context rule provides information about the context for an individual API
 * element.
 * </pre>
 *
 * Protobuf type {@code google.api.ContextRule}
 */
public final class ContextRule extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.ContextRule)
    ContextRuleOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ContextRule.class.getName());
  }
  // Use ContextRule.newBuilder() to construct.
  private ContextRule(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ContextRule() {
    selector_ = "";
    requested_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    provided_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.ContextRule.class, com.google.api.ContextRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The selector.
   */
  @java.lang.Override
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The bytes for selector.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTED_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList requested_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2 [json_name = "requested"];</code>
   * @return A list containing the requested.
   */
  public com.google.protobuf.ProtocolStringList
      getRequestedList() {
    return requested_;
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2 [json_name = "requested"];</code>
   * @return The count of requested.
   */
  public int getRequestedCount() {
    return requested_.size();
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2 [json_name = "requested"];</code>
   * @param index The index of the element to return.
   * @return The requested at the given index.
   */
  public java.lang.String getRequested(int index) {
    return requested_.get(index);
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2 [json_name = "requested"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the requested at the given index.
   */
  public com.google.protobuf.ByteString
      getRequestedBytes(int index) {
    return requested_.getByteString(index);
  }

  public static final int PROVIDED_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList provided_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3 [json_name = "provided"];</code>
   * @return A list containing the provided.
   */
  public com.google.protobuf.ProtocolStringList
      getProvidedList() {
    return provided_;
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3 [json_name = "provided"];</code>
   * @return The count of provided.
   */
  public int getProvidedCount() {
    return provided_.size();
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3 [json_name = "provided"];</code>
   * @param index The index of the element to return.
   * @return The provided at the given index.
   */
  public java.lang.String getProvided(int index) {
    return provided_.get(index);
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3 [json_name = "provided"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the provided at the given index.
   */
  public com.google.protobuf.ByteString
      getProvidedBytes(int index) {
    return provided_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(selector_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, selector_);
    }
    for (int i = 0; i < requested_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, requested_.getRaw(i));
    }
    for (int i = 0; i < provided_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, provided_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(selector_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, selector_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < requested_.size(); i++) {
        dataSize += computeStringSizeNoTag(requested_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRequestedList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < provided_.size(); i++) {
        dataSize += computeStringSizeNoTag(provided_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProvidedList().size();
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
    if (!(obj instanceof com.google.api.ContextRule)) {
      return super.equals(obj);
    }
    com.google.api.ContextRule other = (com.google.api.ContextRule) obj;

    if (!getSelector()
        .equals(other.getSelector())) return false;
    if (!getRequestedList()
        .equals(other.getRequestedList())) return false;
    if (!getProvidedList()
        .equals(other.getProvidedList())) return false;
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    if (getRequestedCount() > 0) {
      hash = (37 * hash) + REQUESTED_FIELD_NUMBER;
      hash = (53 * hash) + getRequestedList().hashCode();
    }
    if (getProvidedCount() > 0) {
      hash = (37 * hash) + PROVIDED_FIELD_NUMBER;
      hash = (53 * hash) + getProvidedList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.ContextRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.ContextRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.ContextRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.ContextRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.api.ContextRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.ContextRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.ContextRule parseFrom(
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
  public static Builder newBuilder(com.google.api.ContextRule prototype) {
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
   * A context rule provides information about the context for an individual API
   * element.
   * </pre>
   *
   * Protobuf type {@code google.api.ContextRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.ContextRule)
      com.google.api.ContextRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.ContextRule.class, com.google.api.ContextRule.Builder.class);
    }

    // Construct using com.google.api.ContextRule.newBuilder()
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
      selector_ = "";
      requested_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      provided_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.ContextRule getDefaultInstanceForType() {
      return com.google.api.ContextRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.ContextRule build() {
      com.google.api.ContextRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.ContextRule buildPartial() {
      com.google.api.ContextRule result = new com.google.api.ContextRule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.ContextRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        requested_.makeImmutable();
        result.requested_ = requested_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        provided_.makeImmutable();
        result.provided_ = provided_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.ContextRule) {
        return mergeFrom((com.google.api.ContextRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.ContextRule other) {
      if (other == com.google.api.ContextRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.requested_.isEmpty()) {
        if (requested_.isEmpty()) {
          requested_ = other.requested_;
          bitField0_ |= 0x00000002;
        } else {
          ensureRequestedIsMutable();
          requested_.addAll(other.requested_);
        }
        onChanged();
      }
      if (!other.provided_.isEmpty()) {
        if (provided_.isEmpty()) {
          provided_ = other.provided_;
          bitField0_ |= 0x00000004;
        } else {
          ensureProvidedIsMutable();
          provided_.addAll(other.provided_);
        }
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
              selector_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureRequestedIsMutable();
              requested_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureProvidedIsMutable();
              provided_.add(s);
              break;
            } // case 26
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

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return The selector.
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return The bytes for selector.
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @param value The selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSelector() {
      selector_ = getDefaultInstance().getSelector();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @param value The bytes for selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList requested_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureRequestedIsMutable() {
      if (!requested_.isModifiable()) {
        requested_ = new com.google.protobuf.LazyStringArrayList(requested_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @return A list containing the requested.
     */
    public com.google.protobuf.ProtocolStringList
        getRequestedList() {
      requested_.makeImmutable();
      return requested_;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @return The count of requested.
     */
    public int getRequestedCount() {
      return requested_.size();
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param index The index of the element to return.
     * @return The requested at the given index.
     */
    public java.lang.String getRequested(int index) {
      return requested_.get(index);
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the requested at the given index.
     */
    public com.google.protobuf.ByteString
        getRequestedBytes(int index) {
      return requested_.getByteString(index);
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param index The index to set the value at.
     * @param value The requested to set.
     * @return This builder for chaining.
     */
    public Builder setRequested(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRequestedIsMutable();
      requested_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param value The requested to add.
     * @return This builder for chaining.
     */
    public Builder addRequested(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRequestedIsMutable();
      requested_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param values The requested to add.
     * @return This builder for chaining.
     */
    public Builder addAllRequested(
        java.lang.Iterable<java.lang.String> values) {
      ensureRequestedIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, requested_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequested() {
      requested_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2 [json_name = "requested"];</code>
     * @param value The bytes of the requested to add.
     * @return This builder for chaining.
     */
    public Builder addRequestedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureRequestedIsMutable();
      requested_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList provided_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureProvidedIsMutable() {
      if (!provided_.isModifiable()) {
        provided_ = new com.google.protobuf.LazyStringArrayList(provided_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @return A list containing the provided.
     */
    public com.google.protobuf.ProtocolStringList
        getProvidedList() {
      provided_.makeImmutable();
      return provided_;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @return The count of provided.
     */
    public int getProvidedCount() {
      return provided_.size();
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param index The index of the element to return.
     * @return The provided at the given index.
     */
    public java.lang.String getProvided(int index) {
      return provided_.get(index);
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the provided at the given index.
     */
    public com.google.protobuf.ByteString
        getProvidedBytes(int index) {
      return provided_.getByteString(index);
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param index The index to set the value at.
     * @param value The provided to set.
     * @return This builder for chaining.
     */
    public Builder setProvided(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureProvidedIsMutable();
      provided_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param value The provided to add.
     * @return This builder for chaining.
     */
    public Builder addProvided(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureProvidedIsMutable();
      provided_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param values The provided to add.
     * @return This builder for chaining.
     */
    public Builder addAllProvided(
        java.lang.Iterable<java.lang.String> values) {
      ensureProvidedIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, provided_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProvided() {
      provided_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3 [json_name = "provided"];</code>
     * @param value The bytes of the provided to add.
     * @return This builder for chaining.
     */
    public Builder addProvidedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureProvidedIsMutable();
      provided_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.ContextRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.ContextRule)
  private static final com.google.api.ContextRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.ContextRule();
  }

  public static com.google.api.ContextRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContextRule>
      PARSER = new com.google.protobuf.AbstractParser<ContextRule>() {
    @java.lang.Override
    public ContextRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContextRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContextRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.ContextRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

