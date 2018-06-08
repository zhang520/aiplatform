package com.xuanwu.xtion.grpc.loadbalance;

import io.grpc.*;

import java.util.List;

public abstract class GrpclbLoadBalancer extends LoadBalancer {

    @Override
    public void handleResolvedAddressGroups(List<EquivalentAddressGroup> list, Attributes attributes) {

    }

    @Override
    public void handleNameResolutionError(Status status) {

    }

    @Override
    public void handleSubchannelState(Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {

    }

    @Override
    public void shutdown() {

    }

    public abstract PickResult pick(PickSubchannelArgs args);
}
