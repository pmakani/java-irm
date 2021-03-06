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

public interface IncidentRoleAssignmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.IncidentRoleAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name such as
   * "projects/{project_id}/incidents/{incident_id}/role_assignments/{role_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name such as
   * "projects/{project_id}/incidents/{incident_id}/role_assignments/{role_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Etag for this version of the resource. Must be specified in
   * update requests and match the current version in storage. Must not be
   * modified by the client.
   * </pre>
   *
   * <code>string etag = 2;</code>
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. Etag for this version of the resource. Must be specified in
   * update requests and match the current version in storage. Must not be
   * modified by the client.
   * </pre>
   *
   * <code>string etag = 2;</code>
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The role that is or will be assigned.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole role = 3;</code>
   */
  boolean hasRole();
  /**
   *
   *
   * <pre>
   * The role that is or will be assigned.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole role = 3;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRole getRole();
  /**
   *
   *
   * <pre>
   * The role that is or will be assigned.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole role = 3;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRoleOrBuilder getRoleOrBuilder();

  /**
   *
   *
   * <pre>
   * The user this role is assigned to. This field can only be directly set
   * during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User assignee = 4;</code>
   */
  boolean hasAssignee();
  /**
   *
   *
   * <pre>
   * The user this role is assigned to. This field can only be directly set
   * during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User assignee = 4;</code>
   */
  com.google.irm.service.v1alpha2.api.User getAssignee();
  /**
   *
   *
   * <pre>
   * The user this role is assigned to. This field can only be directly set
   * during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User assignee = 4;</code>
   */
  com.google.irm.service.v1alpha2.api.UserOrBuilder getAssigneeOrBuilder();

  /**
   *
   *
   * <pre>
   * The recipient of a requested role handoff. This field can only be directly
   * set during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * `assignee` is always the current role-holder, and `proposed_assignee` is
   * used to track unfinished assignments and handoffs. Let's say Bob assigns
   * Alice to a role. Then the fields are:
   *   `assignee`: nil, `proposed_assignee`: Alice
   * If Alice accepts, then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If she cancels, then the RoleAssignment is deleted.
   * Let's say Alice has the role. Then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If Alice becomes incapacitated and Bob requests Carol to take over, then
   * the fields are:
   *   `assignee`: Alice, `proposed_assignee`: Carol
   * After Carol accepts the handover, the fields are:
   *   `assignee`: Carol, `proposed_assignee`: nil
   * Or if Carol refuses the handover, the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User proposed_assignee = 5;</code>
   */
  boolean hasProposedAssignee();
  /**
   *
   *
   * <pre>
   * The recipient of a requested role handoff. This field can only be directly
   * set during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * `assignee` is always the current role-holder, and `proposed_assignee` is
   * used to track unfinished assignments and handoffs. Let's say Bob assigns
   * Alice to a role. Then the fields are:
   *   `assignee`: nil, `proposed_assignee`: Alice
   * If Alice accepts, then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If she cancels, then the RoleAssignment is deleted.
   * Let's say Alice has the role. Then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If Alice becomes incapacitated and Bob requests Carol to take over, then
   * the fields are:
   *   `assignee`: Alice, `proposed_assignee`: Carol
   * After Carol accepts the handover, the fields are:
   *   `assignee`: Carol, `proposed_assignee`: nil
   * Or if Carol refuses the handover, the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User proposed_assignee = 5;</code>
   */
  com.google.irm.service.v1alpha2.api.User getProposedAssignee();
  /**
   *
   *
   * <pre>
   * The recipient of a requested role handoff. This field can only be directly
   * set during creation request. Subsequent updates are done via the
   * IncidentRoleHandover methods.
   * `assignee` is always the current role-holder, and `proposed_assignee` is
   * used to track unfinished assignments and handoffs. Let's say Bob assigns
   * Alice to a role. Then the fields are:
   *   `assignee`: nil, `proposed_assignee`: Alice
   * If Alice accepts, then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If she cancels, then the RoleAssignment is deleted.
   * Let's say Alice has the role. Then the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * If Alice becomes incapacitated and Bob requests Carol to take over, then
   * the fields are:
   *   `assignee`: Alice, `proposed_assignee`: Carol
   * After Carol accepts the handover, the fields are:
   *   `assignee`: Carol, `proposed_assignee`: nil
   * Or if Carol refuses the handover, the fields are:
   *   `assignee`: Alice, `proposed_assignee`: nil
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User proposed_assignee = 5;</code>
   */
  com.google.irm.service.v1alpha2.api.UserOrBuilder getProposedAssigneeOrBuilder();
}
