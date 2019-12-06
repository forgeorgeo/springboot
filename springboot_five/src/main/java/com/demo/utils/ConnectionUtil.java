package com.demo.utils;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * RabbitMQ连接工具类
 */
public class ConnectionUtil {

    private static final String host = "192.168.1.123";
    private static final int port = 5672;

    /**
     * 获取RabbitMQ Connection连接
     * @return
     * @throws IOException
     * @throws TimeoutException
     */
    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);

        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("1234");
        //connectionFactory.setVirtualHost("/vhost_test");

        return connectionFactory.newConnection();
    }
}
