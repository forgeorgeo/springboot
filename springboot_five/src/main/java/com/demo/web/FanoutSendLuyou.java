package com.demo.web;

import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class FanoutSendLuyou {

	/**
	 * 生产者
	 */
    private static final String EXCHANGE_NAME = "test_exchange_routing";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 获取连接
        Connection connection = ConnectionUtil.getConnection();
        // 从连接开一个通道
        Channel channel = connection.createChannel();
        // 声明一个direct路由交换机
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // 发送info路由键消息
        String infoMessage = "hello, DIRECT_日志消息";
        channel.basicPublish(EXCHANGE_NAME, "info", null, infoMessage.getBytes());
        
        // 发送error路由键消息
        String errorMessage = "hello, DIRECT_错误消息";
        channel.basicPublish(EXCHANGE_NAME, "error", null, errorMessage.getBytes());
        
        System.out.println(" [x] Sent routing --info message : '" + infoMessage + "'");
        System.out.println(" [x] Sent routing --error message :  '" + errorMessage + "'");

        channel.close();
        connection.close();

    }

}
