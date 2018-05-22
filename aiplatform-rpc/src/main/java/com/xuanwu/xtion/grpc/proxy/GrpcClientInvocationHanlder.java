package com.xuanwu.xtion.grpc.proxy;

import com.xuanwu.xtion.grpc.AbstractGrpcClient;
import io.grpc.StatusRuntimeException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;

/**
 * Created by Mr.zhang on 2018/5/19.
 */
public class GrpcClientInvocationHanlder implements InvocationHandler {

    public GrpcClientInvocationHanlder(Object target) {
        this.target = target;
    }

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        AbstractGrpcClient client = null;
        try {
            client = (AbstractGrpcClient) target;
            client.getChannelLock().readLock().lock();
            return method.invoke(this.target, args);
        } catch (InvocationTargetException e) {
            Throwable throwable = e.getTargetException();
            if (throwable instanceof StatusRuntimeException) {
                switch (throwable.getCause().getClass().toString()) {
                    case "ConnectException.class":
                        if (client != null) { client.refreshChannel(); }
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) { client.getChannelLock().readLock().unlock(); }
        }
        return null;
    }
}
