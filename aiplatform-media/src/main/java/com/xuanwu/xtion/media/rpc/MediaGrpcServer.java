package com.xuanwu.xtion.media.rpc;

import com.xuanwu.xtion.grpc.AbstractGrpcServer;

import com.xuanwu.xtion.grpc.media.MediaServiceGrpc;
import com.xuanwu.xtion.log.LogWriter;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
@Component
public class MediaGrpcServer extends AbstractGrpcServer implements InitializingBean {

    @Value("${grpc.port}")
    private int port;

    @Autowired
    private MediaServiceGrpc.MediaServiceImplBase service;

    public void start() throws IOException {
        this.server = ServerBuilder.forPort(port).addService(service).build().start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> MediaGrpcServer.super.stop()));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.start();
        LogWriter.getInstance().info("media grpc server is starting, on port {} !", String.valueOf(port));
    }
}
