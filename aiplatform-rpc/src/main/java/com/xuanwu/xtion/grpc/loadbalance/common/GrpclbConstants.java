package com.xuanwu.xtion.grpc.loadbalance.common;

import io.grpc.Metadata;

public class GrpclbConstants {

    public final static Metadata.Key<String> TOKEN_METADATA_KEY = Metadata.Key.of("lb-name", Metadata.ASCII_STRING_MARSHALLER);

}
