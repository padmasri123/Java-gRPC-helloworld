package com.filesgen.grpcHelloWorld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: helloworld2.proto")
public final class GreetingService2Grpc {

  private GreetingService2Grpc() {}

  public static final String SERVICE_NAME = "com.filesgen.grpcHelloWorld.GreetingService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.HelloRequest2,
      com.filesgen.grpcHelloWorld.HelloResponse2> getGreeting2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting2",
      requestType = com.filesgen.grpcHelloWorld.HelloRequest2.class,
      responseType = com.filesgen.grpcHelloWorld.HelloResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.HelloRequest2,
      com.filesgen.grpcHelloWorld.HelloResponse2> getGreeting2Method() {
    io.grpc.MethodDescriptor<com.filesgen.grpcHelloWorld.HelloRequest2, com.filesgen.grpcHelloWorld.HelloResponse2> getGreeting2Method;
    if ((getGreeting2Method = GreetingService2Grpc.getGreeting2Method) == null) {
      synchronized (GreetingService2Grpc.class) {
        if ((getGreeting2Method = GreetingService2Grpc.getGreeting2Method) == null) {
          GreetingService2Grpc.getGreeting2Method = getGreeting2Method = 
              io.grpc.MethodDescriptor.<com.filesgen.grpcHelloWorld.HelloRequest2, com.filesgen.grpcHelloWorld.HelloResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.filesgen.grpcHelloWorld.GreetingService2", "greeting2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.filesgen.grpcHelloWorld.HelloRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.filesgen.grpcHelloWorld.HelloResponse2.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingService2MethodDescriptorSupplier("greeting2"))
                  .build();
          }
        }
     }
     return getGreeting2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingService2Stub newStub(io.grpc.Channel channel) {
    return new GreetingService2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingService2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingService2FutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingService2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting2(com.filesgen.grpcHelloWorld.HelloRequest2 request,
        io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.HelloResponse2> responseObserver) {
      asyncUnimplementedUnaryCall(getGreeting2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreeting2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.filesgen.grpcHelloWorld.HelloRequest2,
                com.filesgen.grpcHelloWorld.HelloResponse2>(
                  this, METHODID_GREETING2)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingService2Stub extends io.grpc.stub.AbstractStub<GreetingService2Stub> {
    private GreetingService2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService2Stub(channel, callOptions);
    }

    /**
     */
    public void greeting2(com.filesgen.grpcHelloWorld.HelloRequest2 request,
        io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.HelloResponse2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreeting2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetingService2BlockingStub extends io.grpc.stub.AbstractStub<GreetingService2BlockingStub> {
    private GreetingService2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService2BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.filesgen.grpcHelloWorld.HelloResponse2 greeting2(com.filesgen.grpcHelloWorld.HelloRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getGreeting2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingService2FutureStub extends io.grpc.stub.AbstractStub<GreetingService2FutureStub> {
    private GreetingService2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingService2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingService2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingService2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.filesgen.grpcHelloWorld.HelloResponse2> greeting2(
        com.filesgen.grpcHelloWorld.HelloRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getGreeting2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING2 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING2:
          serviceImpl.greeting2((com.filesgen.grpcHelloWorld.HelloRequest2) request,
              (io.grpc.stub.StreamObserver<com.filesgen.grpcHelloWorld.HelloResponse2>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.filesgen.grpcHelloWorld.Helloworld2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService2");
    }
  }

  private static final class GreetingService2FileDescriptorSupplier
      extends GreetingService2BaseDescriptorSupplier {
    GreetingService2FileDescriptorSupplier() {}
  }

  private static final class GreetingService2MethodDescriptorSupplier
      extends GreetingService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingService2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetingService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingService2FileDescriptorSupplier())
              .addMethod(getGreeting2Method())
              .build();
        }
      }
    }
    return result;
  }
}
