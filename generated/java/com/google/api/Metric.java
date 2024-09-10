// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/metric.proto

// Protobuf Java Version: 4.26.1
package com.google.api;

/**
 * <pre>
 * A specific metric, identified by specifying values for all of the
 * labels of a [`MetricDescriptor`][google.api.MetricDescriptor].
 * </pre>
 *
 * Protobuf type {@code google.api.Metric}
 */
public final class Metric extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.Metric)
    MetricOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Metric.class.getName());
  }
  // Use Metric.newBuilder() to construct.
  private Metric(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Metric() {
    type_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.MetricProto.internal_static_google_api_Metric_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetLabels();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.MetricProto.internal_static_google_api_Metric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Metric.class, com.google.api.Metric.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
   * For example, `custom.googleapis.com/invoice/paid/amount`.
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
   * For example, `custom.googleapis.com/invoice/paid/amount`.
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;
  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.api.MetricProto.internal_static_google_api_Metric_LabelsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> labels_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }
  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public boolean containsLabels(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetLabels().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public java.lang.String getLabelsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessage
      .serializeStringMapTo(
        output,
        internalGetLabels(),
        LabelsDefaultEntryHolder.defaultEntry,
        2);
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      labels__ = LabelsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, labels__);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, type_);
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
    if (!(obj instanceof com.google.api.Metric)) {
      return super.equals(obj);
    }
    com.google.api.Metric other = (com.google.api.Metric) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!internalGetLabels().equals(
        other.internalGetLabels())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Metric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Metric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Metric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Metric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Metric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Metric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Metric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Metric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.api.Metric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.Metric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Metric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Metric parseFrom(
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
  public static Builder newBuilder(com.google.api.Metric prototype) {
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
   * A specific metric, identified by specifying values for all of the
   * labels of a [`MetricDescriptor`][google.api.MetricDescriptor].
   * </pre>
   *
   * Protobuf type {@code google.api.Metric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Metric)
      com.google.api.MetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.MetricProto.internal_static_google_api_Metric_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.MetricProto.internal_static_google_api_Metric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Metric.class, com.google.api.Metric.Builder.class);
    }

    // Construct using com.google.api.Metric.newBuilder()
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
      type_ = "";
      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.MetricProto.internal_static_google_api_Metric_descriptor;
    }

    @java.lang.Override
    public com.google.api.Metric getDefaultInstanceForType() {
      return com.google.api.Metric.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.Metric build() {
      com.google.api.Metric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.Metric buildPartial() {
      com.google.api.Metric result = new com.google.api.Metric(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.Metric result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.labels_ = internalGetLabels();
        result.labels_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.Metric) {
        return mergeFrom((com.google.api.Metric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Metric other) {
      if (other == com.google.api.Metric.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(
          other.internalGetLabels());
      bitField0_ |= 0x00000002;
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
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              labels__ = input.readMessage(
                  LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableLabels().getMutableMap().put(
                  labels__.getKey(), labels__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
     * For example, `custom.googleapis.com/invoice/paid/amount`.
     * </pre>
     *
     * <code>string type = 3 [json_name = "type"];</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
     * For example, `custom.googleapis.com/invoice/paid/amount`.
     * </pre>
     *
     * <code>string type = 3 [json_name = "type"];</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
     * For example, `custom.googleapis.com/invoice/paid/amount`.
     * </pre>
     *
     * <code>string type = 3 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
     * For example, `custom.googleapis.com/invoice/paid/amount`.
     * </pre>
     *
     * <code>string type = 3 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
     * For example, `custom.googleapis.com/invoice/paid/amount`.
     * </pre>
     *
     * <code>string type = 3 [json_name = "type"];</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> labels_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return labels_;
    }
    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    @java.lang.Override
    public boolean containsLabels(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetLabels().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLabelsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getLabelsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    @java.lang.Override
    public java.lang.String getLabelsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearLabels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableLabels().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    public Builder removeLabels(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableLabels().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableLabels() {
      bitField0_ |= 0x00000002;
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    public Builder putLabels(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableLabels().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The set of label values that uniquely identify this metric. All
     * labels listed in the `MetricDescriptor` must be assigned values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
     */
    public Builder putAllLabels(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.Metric)
  }

  // @@protoc_insertion_point(class_scope:google.api.Metric)
  private static final com.google.api.Metric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Metric();
  }

  public static com.google.api.Metric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metric>
      PARSER = new com.google.protobuf.AbstractParser<Metric>() {
    @java.lang.Override
    public Metric parsePartialFrom(
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

  public static com.google.protobuf.Parser<Metric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.Metric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

