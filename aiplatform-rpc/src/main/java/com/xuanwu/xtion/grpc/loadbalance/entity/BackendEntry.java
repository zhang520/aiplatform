package com.xuanwu.xtion.grpc.loadbalance.entity;

import com.xuanwu.xtion.grpc.loadbalance.common.GrpclbConstants;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;

public class BackendEntry {

    private final LoadBalancer.PickResult result;

    private final String token;

    public BackendEntry(LoadBalancer.Subchannel subchannel) {
        this.result = LoadBalancer.PickResult.withSubchannel(subchannel);
        this.token = null;
    }

    public BackendEntry(LoadBalancer.Subchannel subchannel, String token) {
        this.result = LoadBalancer.PickResult.withSubchannel(subchannel);
        this.token = token;
    }

    public LoadBalancer.PickResult picked(Metadata arg) {
        arg.discardAll(GrpclbConstants.TOKEN_METADATA_KEY);
        if (token != null) {
            arg.put(GrpclbConstants.TOKEN_METADATA_KEY, token);
        }
        return result;
    }
}