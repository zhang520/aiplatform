package com.xuanwu.xtion.media.rpc.impl;

import com.xuanwu.xtion.grpc.media.MediaServiceGrpc;
import com.xuanwu.xtion.grpc.message.BasicMessageProto;
import com.xuanwu.xtion.grpc.message.image.ImageMediaProto;
import com.xuanwu.xtion.media.service.ImageService;
import io.grpc.stub.StreamObserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@Component
public class MediaGrpcServiceImpl extends MediaServiceGrpc.MediaServiceImplBase {

    @Autowired
    private ImageService imageService;

    @Override
    public void checkImageFuzzy(BasicMessageProto.RpcString request, StreamObserver<BasicMessageProto.RpcBoolean> responseObserver) {
//        super.checkImageFuzzy(request, responseObserver);
        boolean ret = imageService.checkImageFuzzy(request.getValue());
        responseObserver.onNext(BasicMessageProto.RpcBoolean.newBuilder().setValue(ret).build());
        responseObserver.onCompleted();
    }

    @Override
    public void fetchImage(ImageMediaProto.Image request, StreamObserver<BasicMessageProto.RpcString> responseObserver) {
        String ret = imageService.fetchImage(request.getImageUrl(), request.getImageName());
        responseObserver.onNext(BasicMessageProto.RpcString.newBuilder().setValue(ret).build());
        responseObserver.onCompleted();
    }

}
