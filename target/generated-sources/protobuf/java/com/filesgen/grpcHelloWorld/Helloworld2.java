// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld2.proto

package com.filesgen.grpcHelloWorld;

public final class Helloworld2 {
  private Helloworld2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_HelloRequest2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_filesgen_grpcHelloWorld_HelloResponse2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021helloworld2.proto\022\033com.filesgen.grpcHe" +
      "lloWorld\"\036\n\rHelloRequest2\022\r\n\005name2\030\001 \001(\t" +
      "\"#\n\016HelloResponse2\022\021\n\tgreeting2\030\001 \001(\t2x\n" +
      "\020GreetingService2\022d\n\tgreeting2\022*.com.fil" +
      "esgen.grpcHelloWorld.HelloRequest2\032+.com" +
      ".filesgen.grpcHelloWorld.HelloResponse2B" +
      "\002P\001b\006proto3"
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
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_filesgen_grpcHelloWorld_HelloRequest2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_HelloRequest2_descriptor,
        new java.lang.String[] { "Name2", });
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse2_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_filesgen_grpcHelloWorld_HelloResponse2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_filesgen_grpcHelloWorld_HelloResponse2_descriptor,
        new java.lang.String[] { "Greeting2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
