package com.filesgen.grpcHelloWorld;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class simplegrpcServer1 {
    public static void main(String[] args) throws Exception {
        io.grpc.Server server2 = ServerBuilder.forPort(50051)
                .addService(new GreetingService2Impl())
                .build();
        server2.start();
        System.out.println("Server started at 50051");
        server2.awaitTermination();
    }
    static class GreetingService2Impl extends GreetingService2Grpc.GreetingService2ImplBase {
        @Override public void greeting2(HelloRequest2 request2,
                                        StreamObserver<HelloResponse2> responseObserver) {
            final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                    .usePlaintext()
                    .build();
            GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
            HelloRequest request = HelloRequest.newBuilder()
                    .setName("Padmasri")
                    .build();
            HelloResponse response = stub.greeting(request);
            System.out.println(response);
            channel.shutdown();

            System.out.println("Received Request server 1");
            HelloResponse2 response2 = HelloResponse2.newBuilder()
                    .setGreeting2("Hello there, " + request2.getName2())
                    .build();
            responseObserver.onNext(response2);
            responseObserver.onCompleted();
        }
    }
}
