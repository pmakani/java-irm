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
 * Request for the UpdateArtifact method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.UpdateArtifactRequest}
 */
public final class UpdateArtifactRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.UpdateArtifactRequest)
    UpdateArtifactRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateArtifactRequest.newBuilder() to construct.
  private UpdateArtifactRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateArtifactRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateArtifactRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateArtifactRequest(
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
          case 10:
            {
              com.google.irm.service.v1alpha2.api.Artifact.Builder subBuilder = null;
              if (artifact_ != null) {
                subBuilder = artifact_.toBuilder();
              }
              artifact_ =
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.Artifact.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(artifact_);
                artifact_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_UpdateArtifactRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_UpdateArtifactRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.class,
            com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.Builder.class);
  }

  public static final int ARTIFACT_FIELD_NUMBER = 1;
  private com.google.irm.service.v1alpha2.api.Artifact artifact_;
  /**
   *
   *
   * <pre>
   * The artifact to update with the new values.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
   *
   * @return Whether the artifact field is set.
   */
  public boolean hasArtifact() {
    return artifact_ != null;
  }
  /**
   *
   *
   * <pre>
   * The artifact to update with the new values.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
   *
   * @return The artifact.
   */
  public com.google.irm.service.v1alpha2.api.Artifact getArtifact() {
    return artifact_ == null
        ? com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance()
        : artifact_;
  }
  /**
   *
   *
   * <pre>
   * The artifact to update with the new values.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.ArtifactOrBuilder getArtifactOrBuilder() {
    return getArtifact();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * List of fields that should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (artifact_ != null) {
      output.writeMessage(1, getArtifact());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (artifact_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getArtifact());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.UpdateArtifactRequest)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.UpdateArtifactRequest other =
        (com.google.irm.service.v1alpha2.api.UpdateArtifactRequest) obj;

    if (hasArtifact() != other.hasArtifact()) return false;
    if (hasArtifact()) {
      if (!getArtifact().equals(other.getArtifact())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasArtifact()) {
      hash = (37 * hash) + ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getArtifact().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parseFrom(
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
      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest prototype) {
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
   * Request for the UpdateArtifact method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.UpdateArtifactRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.UpdateArtifactRequest)
      com.google.irm.service.v1alpha2.api.UpdateArtifactRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_UpdateArtifactRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_UpdateArtifactRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.class,
              com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (artifactBuilder_ == null) {
        artifact_ = null;
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_UpdateArtifactRequest_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.UpdateArtifactRequest getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.UpdateArtifactRequest build() {
      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.UpdateArtifactRequest buildPartial() {
      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest result =
          new com.google.irm.service.v1alpha2.api.UpdateArtifactRequest(this);
      if (artifactBuilder_ == null) {
        result.artifact_ = artifact_;
      } else {
        result.artifact_ = artifactBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.irm.service.v1alpha2.api.UpdateArtifactRequest) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.UpdateArtifactRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.UpdateArtifactRequest other) {
      if (other == com.google.irm.service.v1alpha2.api.UpdateArtifactRequest.getDefaultInstance())
        return this;
      if (other.hasArtifact()) {
        mergeArtifact(other.getArtifact());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.irm.service.v1alpha2.api.UpdateArtifactRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.UpdateArtifactRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.irm.service.v1alpha2.api.Artifact artifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Artifact,
            com.google.irm.service.v1alpha2.api.Artifact.Builder,
            com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
        artifactBuilder_;
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     *
     * @return Whether the artifact field is set.
     */
    public boolean hasArtifact() {
      return artifactBuilder_ != null || artifact_ != null;
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     *
     * @return The artifact.
     */
    public com.google.irm.service.v1alpha2.api.Artifact getArtifact() {
      if (artifactBuilder_ == null) {
        return artifact_ == null
            ? com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance()
            : artifact_;
      } else {
        return artifactBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public Builder setArtifact(com.google.irm.service.v1alpha2.api.Artifact value) {
      if (artifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artifact_ = value;
        onChanged();
      } else {
        artifactBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public Builder setArtifact(
        com.google.irm.service.v1alpha2.api.Artifact.Builder builderForValue) {
      if (artifactBuilder_ == null) {
        artifact_ = builderForValue.build();
        onChanged();
      } else {
        artifactBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public Builder mergeArtifact(com.google.irm.service.v1alpha2.api.Artifact value) {
      if (artifactBuilder_ == null) {
        if (artifact_ != null) {
          artifact_ =
              com.google.irm.service.v1alpha2.api.Artifact.newBuilder(artifact_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          artifact_ = value;
        }
        onChanged();
      } else {
        artifactBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public Builder clearArtifact() {
      if (artifactBuilder_ == null) {
        artifact_ = null;
        onChanged();
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Artifact.Builder getArtifactBuilder() {

      onChanged();
      return getArtifactFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.ArtifactOrBuilder getArtifactOrBuilder() {
      if (artifactBuilder_ != null) {
        return artifactBuilder_.getMessageOrBuilder();
      } else {
        return artifact_ == null
            ? com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance()
            : artifact_;
      }
    }
    /**
     *
     *
     * <pre>
     * The artifact to update with the new values.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.Artifact artifact = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Artifact,
            com.google.irm.service.v1alpha2.api.Artifact.Builder,
            com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
        getArtifactFieldBuilder() {
      if (artifactBuilder_ == null) {
        artifactBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.Artifact,
                com.google.irm.service.v1alpha2.api.Artifact.Builder,
                com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>(
                getArtifact(), getParentForChildren(), isClean());
        artifact_ = null;
      }
      return artifactBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * List of fields that should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.UpdateArtifactRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.UpdateArtifactRequest)
  private static final com.google.irm.service.v1alpha2.api.UpdateArtifactRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.UpdateArtifactRequest();
  }

  public static com.google.irm.service.v1alpha2.api.UpdateArtifactRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateArtifactRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateArtifactRequest>() {
        @java.lang.Override
        public UpdateArtifactRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateArtifactRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateArtifactRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateArtifactRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.UpdateArtifactRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}