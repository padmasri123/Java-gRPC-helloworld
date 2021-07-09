package com.filesgen.grpcHelloWorld;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class simplegrpcServer2 {
    public static void main(String[] args) throws Exception {
        io.grpc.Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl())
                .build();
        server.start();
        System.out.println("Server started at 8080");
        server.awaitTermination();
    }
    static class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
        @Override public void greeting(HelloRequest request1,
                                       StreamObserver<HelloResponse> responseObserver) {
            System.out.println("Received Request at server 2");
            HelloResponse response1 = HelloResponse.newBuilder()
                    .setGreeting("Hello there, " + request1.getName())
                    .build();
            responseObserver.onNext(response1);
            responseObserver.onCompleted();
        }
    }
}