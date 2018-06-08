package com.xuanwu.xtion.grpc.loadbalance;

import com.xuanwu.xtion.grpc.loadbalance.entity.BackendEntry;
import io.grpc.LoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RoundRobinPicker extends LoadBalancer.SubchannelPicker {

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    private List<BackendEntry> pickList = new ArrayList<>();

    private int pickIndex = 0;

    @Override
    public LoadBalancer.PickResult pickSubchannel(LoadBalancer.PickSubchannelArgs args) {
        lock.readLock().lock();
        try {
            BackendEntry entry = pickList.get(pickIndex);
            pickIndex++;
            if (pickIndex == pickList.size()) {
                pickIndex = 0;
            }
            return entry.picked(args.getHeaders());
        } finally {
            lock.readLock().unlock();
        }
    }
}
