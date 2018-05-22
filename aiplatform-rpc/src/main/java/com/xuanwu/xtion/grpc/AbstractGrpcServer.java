package com.xuanwu.xtion.grpc;

import io.grpc.Server;

import java.io.IOException;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
public abstract class AbstractGrpcServer {

    protected Server server;

    public abstract void start() throws IOException;

    public void stop() {
        if (this.server != null) { this.server.shutdown(); }
    }

}
