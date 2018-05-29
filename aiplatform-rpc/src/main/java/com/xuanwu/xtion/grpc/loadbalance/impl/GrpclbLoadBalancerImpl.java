package com.xuanwu.xtion.grpc.loadbalance.impl;

import com.xuanwu.xtion.grpc.loadbalance.GrpclbLoadBalancer;

import javax.validation.constraints.NotNull;

public class GrpclbLoadBalancerImpl extends GrpclbLoadBalancer {

    public GrpclbLoadBalancerImpl(SubchannelPicker picker) {
        this.picker = picker;
    }

    @NotNull
    private SubchannelPicker picker;

    @Override
    public PickResult pick(PickSubchannelArgs args) {
        return picker.pickSubchannel(args);
    }
}
