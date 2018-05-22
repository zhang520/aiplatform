package com.xuanwu.xtion.grpc.media.impl;

import com.xuanwu.xtion.grpc.AbstractGrpcClient;
import com.xuanwu.xtion.grpc.media.MediaGrpcClient;
import com.xuanwu.xtion.grpc.media.MediaServiceGrpc;
import com.xuanwu.xtion.grpc.message.BasicMessageProto;
import com.xuanwu.xtion.grpc.message.image.ImageMediaProto;

import org.springframework.stereotype.Component;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@Component
public class MediaGrpcClientImpl extends AbstractGrpcClient<MediaGrpcClientImpl> implements MediaGrpcClient {

    private MediaServiceGrpc.MediaServiceBlockingStub blockingStub;

    @Override
    public boolean checkImageFuzzy(String imageUrl) {
        BasicMessageProto.RpcString request = BasicMessageProto.RpcString.newBuilder().setValue(imageUrl).build();
        BasicMessageProto.RpcBoolean res = blockingStub.checkImageFuzzy(request);
        return res.getValue();
    }

    @Override
    public String fetchImage(String imageUrl, String imageName) {
        ImageMediaProto.Image request = ImageMediaProto.Image.newBuilder().setImageUrl(imageUrl).setImageName(imageName).build();
        BasicMessageProto.RpcString res = blockingStub.fetchImage(request);
        return res.getValue();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO: 2018/5/19 初始化stub
        super.afterPropertiesSet();
        this.blockingStub = MediaServiceGrpc.newBlockingStub(super.channel);
    }
}
