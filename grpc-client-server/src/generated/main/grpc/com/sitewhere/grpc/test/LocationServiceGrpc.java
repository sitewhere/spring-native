package com.sitewhere.grpc.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: test.proto")
public final class LocationServiceGrpc {

  private LocationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.sitewhere.grpc.test.LocationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sitewhere.grpc.test.GetLocationRequest,
      com.sitewhere.grpc.test.GetLocationResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocation",
      requestType = com.sitewhere.grpc.test.GetLocationRequest.class,
      responseType = com.sitewhere.grpc.test.GetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sitewhere.grpc.test.GetLocationRequest,
      com.sitewhere.grpc.test.GetLocationResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.sitewhere.grpc.test.GetLocationRequest, com.sitewhere.grpc.test.GetLocationResponse> getGetLocationMethod;
    if ((getGetLocationMethod = LocationServiceGrpc.getGetLocationMethod) == null) {
      synchronized (LocationServiceGrpc.class) {
        if ((getGetLocationMethod = LocationServiceGrpc.getGetLocationMethod) == null) {
          LocationServiceGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<com.sitewhere.grpc.test.GetLocationRequest, com.sitewhere.grpc.test.GetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sitewhere.grpc.test.GetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sitewhere.grpc.test.GetLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocationServiceMethodDescriptorSupplier("GetLocation"))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceStub>() {
        @java.lang.Override
        public LocationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceStub(channel, callOptions);
        }
      };
    return LocationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceBlockingStub>() {
        @java.lang.Override
        public LocationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationServiceFutureStub>() {
        @java.lang.Override
        public LocationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationServiceFutureStub(channel, callOptions);
        }
      };
    return LocationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LocationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLocation(com.sitewhere.grpc.test.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.sitewhere.grpc.test.GetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sitewhere.grpc.test.GetLocationRequest,
                com.sitewhere.grpc.test.GetLocationResponse>(
                  this, METHODID_GET_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class LocationServiceStub extends io.grpc.stub.AbstractAsyncStub<LocationServiceStub> {
    private LocationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLocation(com.sitewhere.grpc.test.GetLocationRequest request,
        io.grpc.stub.StreamObserver<com.sitewhere.grpc.test.GetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationServiceBlockingStub> {
    private LocationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sitewhere.grpc.test.GetLocationResponse getLocation(com.sitewhere.grpc.test.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LocationServiceFutureStub> {
    private LocationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sitewhere.grpc.test.GetLocationResponse> getLocation(
        com.sitewhere.grpc.test.GetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.sitewhere.grpc.test.GetLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.sitewhere.grpc.test.GetLocationResponse>) responseObserver);
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

  private static abstract class LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sitewhere.grpc.test.TestServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationService");
    }
  }

  private static final class LocationServiceFileDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier {
    LocationServiceFileDescriptorSupplier() {}
  }

  private static final class LocationServiceMethodDescriptorSupplier
      extends LocationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationServiceFileDescriptorSupplier())
              .addMethod(getGetLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
