package com.xuanwu.xtion.grpc.media;

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
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: Image/ImageRpc.proto")
public final class MediaServiceGrpc {

  private MediaServiceGrpc() {}

  public static final String SERVICE_NAME = "media.MediaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCheckImageFuzzyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> METHOD_CHECK_IMAGE_FUZZY = getCheckImageFuzzyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> getCheckImageFuzzyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> getCheckImageFuzzyMethod() {
    return getCheckImageFuzzyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> getCheckImageFuzzyMethodHelper() {
    io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString, com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> getCheckImageFuzzyMethod;
    if ((getCheckImageFuzzyMethod = MediaServiceGrpc.getCheckImageFuzzyMethod) == null) {
      synchronized (MediaServiceGrpc.class) {
        if ((getCheckImageFuzzyMethod = MediaServiceGrpc.getCheckImageFuzzyMethod) == null) {
          MediaServiceGrpc.getCheckImageFuzzyMethod = getCheckImageFuzzyMethod = 
              io.grpc.MethodDescriptor.<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString, com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "media.MediaService", "checkImageFuzzy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaServiceMethodDescriptorSupplier("checkImageFuzzy"))
                  .build();
          }
        }
     }
     return getCheckImageFuzzyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchImageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> METHOD_FETCH_IMAGE = getFetchImageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> getFetchImageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> getFetchImageMethod() {
    return getFetchImageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image,
      com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> getFetchImageMethodHelper() {
    io.grpc.MethodDescriptor<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image, com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> getFetchImageMethod;
    if ((getFetchImageMethod = MediaServiceGrpc.getFetchImageMethod) == null) {
      synchronized (MediaServiceGrpc.class) {
        if ((getFetchImageMethod = MediaServiceGrpc.getFetchImageMethod) == null) {
          MediaServiceGrpc.getFetchImageMethod = getFetchImageMethod = 
              io.grpc.MethodDescriptor.<com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image, com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "media.MediaService", "fetchImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaServiceMethodDescriptorSupplier("fetchImage"))
                  .build();
          }
        }
     }
     return getFetchImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaServiceStub newStub(io.grpc.Channel channel) {
    return new MediaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MediaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MediaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MediaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 检查图片是否清晰
     * </pre>
     */
    public void checkImageFuzzy(com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString request,
        io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckImageFuzzyMethodHelper(), responseObserver);
    }

    /**
     */
    public void fetchImage(com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image request,
        io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchImageMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckImageFuzzyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString,
                com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean>(
                  this, METHODID_CHECK_IMAGE_FUZZY)))
          .addMethod(
            getFetchImageMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image,
                com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString>(
                  this, METHODID_FETCH_IMAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MediaServiceStub extends io.grpc.stub.AbstractStub<MediaServiceStub> {
    private MediaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检查图片是否清晰
     * </pre>
     */
    public void checkImageFuzzy(com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString request,
        io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckImageFuzzyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchImage(com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image request,
        io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchImageMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MediaServiceBlockingStub extends io.grpc.stub.AbstractStub<MediaServiceBlockingStub> {
    private MediaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检查图片是否清晰
     * </pre>
     */
    public com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean checkImageFuzzy(com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString request) {
      return blockingUnaryCall(
          getChannel(), getCheckImageFuzzyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString fetchImage(com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image request) {
      return blockingUnaryCall(
          getChannel(), getFetchImageMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MediaServiceFutureStub extends io.grpc.stub.AbstractStub<MediaServiceFutureStub> {
    private MediaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 检查图片是否清晰
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean> checkImageFuzzy(
        com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckImageFuzzyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString> fetchImage(
        com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchImageMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_IMAGE_FUZZY = 0;
  private static final int METHODID_FETCH_IMAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_IMAGE_FUZZY:
          serviceImpl.checkImageFuzzy((com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString) request,
              (io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcBoolean>) responseObserver);
          break;
        case METHODID_FETCH_IMAGE:
          serviceImpl.fetchImage((com.xuanwu.xtion.grpc.message.image.ImageMediaProto.Image) request,
              (io.grpc.stub.StreamObserver<com.xuanwu.xtion.grpc.message.BasicMessageProto.RpcString>) responseObserver);
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

  private static abstract class MediaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xuanwu.xtion.grpc.media.MediaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MediaService");
    }
  }

  private static final class MediaServiceFileDescriptorSupplier
      extends MediaServiceBaseDescriptorSupplier {
    MediaServiceFileDescriptorSupplier() {}
  }

  private static final class MediaServiceMethodDescriptorSupplier
      extends MediaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MediaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaServiceFileDescriptorSupplier())
              .addMethod(getCheckImageFuzzyMethodHelper())
              .addMethod(getFetchImageMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
