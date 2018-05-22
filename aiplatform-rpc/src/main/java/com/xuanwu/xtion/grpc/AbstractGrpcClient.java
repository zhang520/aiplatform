package com.xuanwu.xtion.grpc;

import com.xuanwu.xtion.grpc.proxy.GrpcClientInvocationHanlder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Mr.zhang on 2018/5/12.
 */
public abstract class AbstractGrpcClient<T extends AbstractGrpcClient> implements FactoryBean, InitializingBean {

    private ReadWriteLock channelLock = new ReentrantReadWriteLock();

    protected ManagedChannel channel;

    private void shutdown() {
        if (channel != null && !channel.isShutdown()) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ReadWriteLock getChannelLock() { return this.channelLock; }

    @Override
    public Object getObject() throws Exception {
        System.out.println("invoke getObject...");
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.getClass().getInterfaces(), new GrpcClientInvocationHanlder(this));
    }

    @Override
    public Class<? extends AbstractGrpcClient> getObjectType() {
        return this.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    protected void refreshChannel() {
        // TODO: 用来更新channel
        try {
            getChannelLock().writeLock().lock();
            System.out.println("invoke refreshChannel...");
            this.shutdown(); // 先停止之前的，然后重新寻找更优
            this.channel = ManagedChannelBuilder.forAddress("localhost", 52521).usePlaintext().build();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getChannelLock().writeLock().unlock();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO: 初始化channel
        System.out.println("invoke afterPropertiesSet...");
        this.refreshChannel();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> this.shutdown()));
        // throw new Error("discovery 服务未启动");
    }
}
