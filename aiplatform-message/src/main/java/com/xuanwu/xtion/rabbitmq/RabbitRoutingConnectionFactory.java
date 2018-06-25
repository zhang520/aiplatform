package com.xuanwu.xtion.rabbitmq;

import com.xuanwu.xtion.common.RabbitConfig;
import com.xuanwu.xtion.helper.CommonException;
import com.xuanwu.xtion.helper.ErrorCode;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionListener;
import org.springframework.amqp.rabbit.connection.SimpleRoutingConnectionFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RabbitRoutingConnectionFactory extends SimpleRoutingConnectionFactory {

    public RabbitRoutingConnectionFactory(ConnectionFactoryInitializer initializer) {
        this.initializer = initializer;
    }

    private final ConnectionFactoryInitializer initializer;

    private Lock target = new ReentrantLock();

    @Override
    public ConnectionFactory getTargetConnectionFactory(Object key) {
        ConnectionFactory connectionFactory = super.getTargetConnectionFactory(key.toString());
        if (connectionFactory == null) {
            target.lock();
            try {
                connectionFactory = super.getTargetConnectionFactory(key.toString());
                if (connectionFactory == null) {
                    RabbitConfig rabbitConfig = (RabbitConfig) key;
                    connectionFactory = initializer.initialConnectionFactory(rabbitConfig);
                    super.addTargetConnectionFactory(key.toString(), connectionFactory);
                }
            } catch (Exception ex) {
                throw new CommonException(ErrorCode.INITIALIZE_EROOR, ex);
            }finally {
                target.unlock();
            }
        }
        return connectionFactory;
    }

    @Override
    protected ConnectionFactory determineTargetConnectionFactory() {
        Object lookupKey = this.determineCurrentLookupKey();
        ConnectionFactory connectionFactory = null;
        if (lookupKey != null) {
            connectionFactory = this.getTargetConnectionFactory(lookupKey);
        }
        if (connectionFactory == null) {
            connectionFactory = super.determineTargetConnectionFactory();
        }
        return connectionFactory;
    }

    public void addConnectionListenerByKeys(ConnectionListener listener, Object... keys) {
        for (Object key: keys) {
            ConnectionFactory connectionFactory = this.getTargetConnectionFactory(key);
            if (connectionFactory != null) {
                connectionFactory.addConnectionListener(listener);
            }
        }
    }

    public void removeConnectionListenerByKeys(ConnectionListener listener, Object... keys) {
        for (Object key: keys) {
            ConnectionFactory connectionFactory = this.getTargetConnectionFactory(key);
            if (connectionFactory != null) {
                connectionFactory.removeConnectionListener(listener);
            }
        }
    }
}
