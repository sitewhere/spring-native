// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.sitewhere.grpc.test;

/**
 * <pre>
 * Response from creating an asset type.
 * </pre>
 *
 * Protobuf type {@code com.sitewhere.grpc.test.GetLocationResponse}
 */
public final class GetLocationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sitewhere.grpc.test.GetLocationResponse)
    GetLocationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLocationResponse.newBuilder() to construct.
  private GetLocationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLocationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetLocationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLocationResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder subBuilder = null;
            if (location_ != null) {
              subBuilder = location_.toBuilder();
            }
            location_ = input.readMessage(com.sitewhere.grpc.test.model.TestModel.NamedLocation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(location_);
              location_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sitewhere.grpc.test.TestServices.internal_static_com_sitewhere_grpc_test_GetLocationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sitewhere.grpc.test.TestServices.internal_static_com_sitewhere_grpc_test_GetLocationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sitewhere.grpc.test.GetLocationResponse.class, com.sitewhere.grpc.test.GetLocationResponse.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private com.sitewhere.grpc.test.model.TestModel.NamedLocation location_;
  /**
   * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
   * @return The location.
   */
  @java.lang.Override
  public com.sitewhere.grpc.test.model.TestModel.NamedLocation getLocation() {
    return location_ == null ? com.sitewhere.grpc.test.model.TestModel.NamedLocation.getDefaultInstance() : location_;
  }
  /**
   * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
   */
  @java.lang.Override
  public com.sitewhere.grpc.test.model.TestModel.NamedLocationOrBuilder getLocationOrBuilder() {
    return getLocation();
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
    if (location_ != null) {
      output.writeMessage(1, getLocation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (location_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sitewhere.grpc.test.GetLocationResponse)) {
      return super.equals(obj);
    }
    com.sitewhere.grpc.test.GetLocationResponse other = (com.sitewhere.grpc.test.GetLocationResponse) obj;

    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sitewhere.grpc.test.GetLocationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sitewhere.grpc.test.GetLocationResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response from creating an asset type.
   * </pre>
   *
   * Protobuf type {@code com.sitewhere.grpc.test.GetLocationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sitewhere.grpc.test.GetLocationResponse)
      com.sitewhere.grpc.test.GetLocationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sitewhere.grpc.test.TestServices.internal_static_com_sitewhere_grpc_test_GetLocationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sitewhere.grpc.test.TestServices.internal_static_com_sitewhere_grpc_test_GetLocationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sitewhere.grpc.test.GetLocationResponse.class, com.sitewhere.grpc.test.GetLocationResponse.Builder.class);
    }

    // Construct using com.sitewhere.grpc.test.GetLocationResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (locationBuilder_ == null) {
        location_ = null;
      } else {
        location_ = null;
        locationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sitewhere.grpc.test.TestServices.internal_static_com_sitewhere_grpc_test_GetLocationResponse_descriptor;
    }

    @java.lang.Override
    public com.sitewhere.grpc.test.GetLocationResponse getDefaultInstanceForType() {
      return com.sitewhere.grpc.test.GetLocationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sitewhere.grpc.test.GetLocationResponse build() {
      com.sitewhere.grpc.test.GetLocationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sitewhere.grpc.test.GetLocationResponse buildPartial() {
      com.sitewhere.grpc.test.GetLocationResponse result = new com.sitewhere.grpc.test.GetLocationResponse(this);
      if (locationBuilder_ == null) {
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sitewhere.grpc.test.GetLocationResponse) {
        return mergeFrom((com.sitewhere.grpc.test.GetLocationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sitewhere.grpc.test.GetLocationResponse other) {
      if (other == com.sitewhere.grpc.test.GetLocationResponse.getDefaultInstance()) return this;
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.sitewhere.grpc.test.GetLocationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sitewhere.grpc.test.GetLocationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.sitewhere.grpc.test.model.TestModel.NamedLocation location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sitewhere.grpc.test.model.TestModel.NamedLocation, com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder, com.sitewhere.grpc.test.model.TestModel.NamedLocationOrBuilder> locationBuilder_;
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return locationBuilder_ != null || location_ != null;
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     * @return The location.
     */
    public com.sitewhere.grpc.test.model.TestModel.NamedLocation getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.sitewhere.grpc.test.model.TestModel.NamedLocation.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public Builder setLocation(com.sitewhere.grpc.test.model.TestModel.NamedLocation value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public Builder setLocation(
        com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public Builder mergeLocation(com.sitewhere.grpc.test.model.TestModel.NamedLocation value) {
      if (locationBuilder_ == null) {
        if (location_ != null) {
          location_ =
            com.sitewhere.grpc.test.model.TestModel.NamedLocation.newBuilder(location_).mergeFrom(value).buildPartial();
        } else {
          location_ = value;
        }
        onChanged();
      } else {
        locationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = null;
        onChanged();
      } else {
        location_ = null;
        locationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder getLocationBuilder() {
      
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    public com.sitewhere.grpc.test.model.TestModel.NamedLocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.sitewhere.grpc.test.model.TestModel.NamedLocation.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.com.sitewhere.grpc.test.model.NamedLocation location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sitewhere.grpc.test.model.TestModel.NamedLocation, com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder, com.sitewhere.grpc.test.model.TestModel.NamedLocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sitewhere.grpc.test.model.TestModel.NamedLocation, com.sitewhere.grpc.test.model.TestModel.NamedLocation.Builder, com.sitewhere.grpc.test.model.TestModel.NamedLocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sitewhere.grpc.test.GetLocationResponse)
  }

  // @@protoc_insertion_point(class_scope:com.sitewhere.grpc.test.GetLocationResponse)
  private static final com.sitewhere.grpc.test.GetLocationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sitewhere.grpc.test.GetLocationResponse();
  }

  public static com.sitewhere.grpc.test.GetLocationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLocationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetLocationResponse>() {
    @java.lang.Override
    public GetLocationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLocationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLocationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLocationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sitewhere.grpc.test.GetLocationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
