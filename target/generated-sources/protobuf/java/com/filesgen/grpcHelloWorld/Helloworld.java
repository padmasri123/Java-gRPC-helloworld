// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.filesgen.grpcHelloWorld;

public final class Helloworld {
  private Helloworld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\022\033com.filesgen.grpcHel" +
      "loWorld\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"!\n" +
      "\rHelloResponse\022\020\n\010greeting\030\001 \001(\t2t\n\017Gree" +
      "tingService\022a\n\010greeting\022).com.filesgen.g" +
      "rpcHelloWorld.HelloRequest\032*.com.filesge" +
      "n.grpcHelloWorld.HelloResponseB\002P\001b\006prot" +
      "o3"
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
        }, assigner);
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
