// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_data.proto

package com.google.bigtable.admin.cluster.v1;

public final class BigtableClusterDataProto {
  private BigtableClusterDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_Zone_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_Zone_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_Cluster_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_Cluster_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/bigtable/admin/cluster/v1/bigta" +
      "ble_cluster_data.proto\022 google.bigtable." +
      "admin.cluster.v1\032#google/longrunning/ope" +
      "rations.proto\032\037google/protobuf/timestamp" +
      ".proto\"\273\001\n\004Zone\022\014\n\004name\030\001 \001(\t\022\024\n\014display" +
      "_name\030\002 \001(\t\022=\n\006status\030\003 \001(\0162-.google.big" +
      "table.admin.cluster.v1.Zone.Status\"P\n\006St" +
      "atus\022\013\n\007UNKNOWN\020\000\022\006\n\002OK\020\001\022\027\n\023PLANNED_MAI" +
      "NTENANCE\020\002\022\030\n\024EMERGENCY_MAINENANCE\020\003\"\240\002\n" +
      "\007Cluster\022\014\n\004name\030\001 \001(\t\022/\n\013delete_time\030\002 ",
      "\001(\0132\032.google.protobuf.Timestamp\0228\n\021curre" +
      "nt_operation\030\003 \001(\0132\035.google.longrunning." +
      "Operation\022\024\n\014display_name\030\004 \001(\t\022\023\n\013serve" +
      "_nodes\030\005 \001(\005\022\021\n\thdd_bytes\030\006 \001(\003\022\021\n\tssd_b" +
      "ytes\030\007 \001(\003\022K\n\024default_storage_type\030\010 \001(\016" +
      "2-.google.bigtable.admin.cluster.v1.Stor" +
      "ageType*H\n\013StorageType\022\027\n\023STORAGE_UNSPEC" +
      "IFIED\020\000\022\017\n\013STORAGE_SSD\020\001\022\017\n\013STORAGE_HDD\020" +
      "\002BB\n$com.google.bigtable.admin.cluster.v" +
      "1B\030BigtableClusterDataProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_bigtable_admin_cluster_v1_Zone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_cluster_v1_Zone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_Zone_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Status", });
    internal_static_google_bigtable_admin_cluster_v1_Cluster_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_cluster_v1_Cluster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_Cluster_descriptor,
        new java.lang.String[] { "Name", "DeleteTime", "CurrentOperation", "DisplayName", "ServeNodes", "HddBytes", "SsdBytes", "DefaultStorageType", });
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}