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
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

public interface IncidentRoleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.IncidentRole)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of role. The role type is immutable in role assignments. Each role
   * type can only be used once per incident, except for TYPE_OTHER.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of role. The role type is immutable in role assignments. Each role
   * type can only be used once per incident, except for TYPE_OTHER.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.irm.service.v1alpha2.api.IncidentRole.Type getType();

  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
   * must be unique within an incident.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
   * must be unique within an incident.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Description of the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Description of the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}