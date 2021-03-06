/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/irm/v1alpha2/incidents_service.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * Response for the SearchSignals method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.SearchSignalsResponse}
 */
public final class SearchSignalsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.SearchSignalsResponse)
    SearchSignalsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchSignalsResponse.newBuilder() to construct.
  private SearchSignalsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchSignalsResponse() {
    signals_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchSignalsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                signals_ = new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Signal>();
                mutable_bitField0_ |= 0x00000001;
              }
              signals_.add(
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.Signal.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        signals_ = java.util.Collections.unmodifiableList(signals_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_SearchSignalsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_SearchSignalsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.SearchSignalsResponse.class,
            com.google.irm.service.v1alpha2.api.SearchSignalsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SIGNALS_FIELD_NUMBER = 1;
  private java.util.List<com.google.irm.service.v1alpha2.api.Signal> signals_;
  /**
   *
   *
   * <pre>
   * Signals that matched the query in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
   */
  public java.util.List<com.google.irm.service.v1alpha2.api.Signal> getSignalsList() {
    return signals_;
  }
  /**
   *
   *
   * <pre>
   * Signals that matched the query in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
   */
  public java.util.List<? extends com.google.irm.service.v1alpha2.api.SignalOrBuilder>
      getSignalsOrBuilderList() {
    return signals_;
  }
  /**
   *
   *
   * <pre>
   * Signals that matched the query in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
   */
  public int getSignalsCount() {
    return signals_.size();
  }
  /**
   *
   *
   * <pre>
   * Signals that matched the query in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.Signal getSignals(int index) {
    return signals_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Signals that matched the query in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.SignalOrBuilder getSignalsOrBuilder(int index) {
    return signals_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of signals.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of signals.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < signals_.size(); i++) {
      output.writeMessage(1, signals_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < signals_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, signals_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.SearchSignalsResponse)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.SearchSignalsResponse other =
        (com.google.irm.service.v1alpha2.api.SearchSignalsResponse) obj;

    if (!getSignalsList().equals(other.getSignalsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getSignalsCount() > 0) {
      hash = (37 * hash) + SIGNALS_FIELD_NUMBER;
      hash = (53 * hash) + getSignalsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.irm.service.v1alpha2.api.SearchSignalsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the SearchSignals method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.SearchSignalsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.SearchSignalsResponse)
      com.google.irm.service.v1alpha2.api.SearchSignalsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchSignalsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchSignalsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.SearchSignalsResponse.class,
              com.google.irm.service.v1alpha2.api.SearchSignalsResponse.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.SearchSignalsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSignalsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (signalsBuilder_ == null) {
        signals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        signalsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_SearchSignalsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchSignalsResponse getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.SearchSignalsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchSignalsResponse build() {
      com.google.irm.service.v1alpha2.api.SearchSignalsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.SearchSignalsResponse buildPartial() {
      com.google.irm.service.v1alpha2.api.SearchSignalsResponse result =
          new com.google.irm.service.v1alpha2.api.SearchSignalsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (signalsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          signals_ = java.util.Collections.unmodifiableList(signals_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.signals_ = signals_;
      } else {
        result.signals_ = signalsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.irm.service.v1alpha2.api.SearchSignalsResponse) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.SearchSignalsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.SearchSignalsResponse other) {
      if (other == com.google.irm.service.v1alpha2.api.SearchSignalsResponse.getDefaultInstance())
        return this;
      if (signalsBuilder_ == null) {
        if (!other.signals_.isEmpty()) {
          if (signals_.isEmpty()) {
            signals_ = other.signals_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSignalsIsMutable();
            signals_.addAll(other.signals_);
          }
          onChanged();
        }
      } else {
        if (!other.signals_.isEmpty()) {
          if (signalsBuilder_.isEmpty()) {
            signalsBuilder_.dispose();
            signalsBuilder_ = null;
            signals_ = other.signals_;
            bitField0_ = (bitField0_ & ~0x00000001);
            signalsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSignalsFieldBuilder()
                    : null;
          } else {
            signalsBuilder_.addAllMessages(other.signals_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.irm.service.v1alpha2.api.SearchSignalsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.SearchSignalsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.irm.service.v1alpha2.api.Signal> signals_ =
        java.util.Collections.emptyList();

    private void ensureSignalsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signals_ = new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Signal>(signals_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Signal,
            com.google.irm.service.v1alpha2.api.Signal.Builder,
            com.google.irm.service.v1alpha2.api.SignalOrBuilder>
        signalsBuilder_;

    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Signal> getSignalsList() {
      if (signalsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signals_);
      } else {
        return signalsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public int getSignalsCount() {
      if (signalsBuilder_ == null) {
        return signals_.size();
      } else {
        return signalsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Signal getSignals(int index) {
      if (signalsBuilder_ == null) {
        return signals_.get(index);
      } else {
        return signalsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder setSignals(int index, com.google.irm.service.v1alpha2.api.Signal value) {
      if (signalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignalsIsMutable();
        signals_.set(index, value);
        onChanged();
      } else {
        signalsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder setSignals(
        int index, com.google.irm.service.v1alpha2.api.Signal.Builder builderForValue) {
      if (signalsBuilder_ == null) {
        ensureSignalsIsMutable();
        signals_.set(index, builderForValue.build());
        onChanged();
      } else {
        signalsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder addSignals(com.google.irm.service.v1alpha2.api.Signal value) {
      if (signalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignalsIsMutable();
        signals_.add(value);
        onChanged();
      } else {
        signalsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder addSignals(int index, com.google.irm.service.v1alpha2.api.Signal value) {
      if (signalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignalsIsMutable();
        signals_.add(index, value);
        onChanged();
      } else {
        signalsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder addSignals(com.google.irm.service.v1alpha2.api.Signal.Builder builderForValue) {
      if (signalsBuilder_ == null) {
        ensureSignalsIsMutable();
        signals_.add(builderForValue.build());
        onChanged();
      } else {
        signalsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder addSignals(
        int index, com.google.irm.service.v1alpha2.api.Signal.Builder builderForValue) {
      if (signalsBuilder_ == null) {
        ensureSignalsIsMutable();
        signals_.add(index, builderForValue.build());
        onChanged();
      } else {
        signalsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder addAllSignals(
        java.lang.Iterable<? extends com.google.irm.service.v1alpha2.api.Signal> values) {
      if (signalsBuilder_ == null) {
        ensureSignalsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, signals_);
        onChanged();
      } else {
        signalsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder clearSignals() {
      if (signalsBuilder_ == null) {
        signals_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        signalsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public Builder removeSignals(int index) {
      if (signalsBuilder_ == null) {
        ensureSignalsIsMutable();
        signals_.remove(index);
        onChanged();
      } else {
        signalsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Signal.Builder getSignalsBuilder(int index) {
      return getSignalsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.SignalOrBuilder getSignalsOrBuilder(int index) {
      if (signalsBuilder_ == null) {
        return signals_.get(index);
      } else {
        return signalsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public java.util.List<? extends com.google.irm.service.v1alpha2.api.SignalOrBuilder>
        getSignalsOrBuilderList() {
      if (signalsBuilder_ != null) {
        return signalsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signals_);
      }
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Signal.Builder addSignalsBuilder() {
      return getSignalsFieldBuilder()
          .addBuilder(com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Signal.Builder addSignalsBuilder(int index) {
      return getSignalsFieldBuilder()
          .addBuilder(index, com.google.irm.service.v1alpha2.api.Signal.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Signals that matched the query in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Signal signals = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Signal.Builder>
        getSignalsBuilderList() {
      return getSignalsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Signal,
            com.google.irm.service.v1alpha2.api.Signal.Builder,
            com.google.irm.service.v1alpha2.api.SignalOrBuilder>
        getSignalsFieldBuilder() {
      if (signalsBuilder_ == null) {
        signalsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.Signal,
                com.google.irm.service.v1alpha2.api.Signal.Builder,
                com.google.irm.service.v1alpha2.api.SignalOrBuilder>(
                signals_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        signals_ = null;
      }
      return signalsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of signals.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of signals.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of signals.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of signals.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of signals.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.SearchSignalsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.SearchSignalsResponse)
  private static final com.google.irm.service.v1alpha2.api.SearchSignalsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.SearchSignalsResponse();
  }

  public static com.google.irm.service.v1alpha2.api.SearchSignalsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchSignalsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchSignalsResponse>() {
        @java.lang.Override
        public SearchSignalsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchSignalsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchSignalsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchSignalsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.SearchSignalsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
