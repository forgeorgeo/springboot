package com.demo.web;
import com.demo.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 生产者
 */
public class Send3 {

	private static final String QUEUE_NAME = "test_workfair_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 获取连接
        Connection connection = ConnectionUtil.getConnection();
        // 从连接开一个通道
        Channel channel = connection.createChannel();
        // 申明这个通道连接的队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        channel.basicQos(1);

        for (int i = 0; i < 20; i++) {
            String message = "Hello RabbitMQ " + i;
            // 发送消息
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
            try {
                Thread.sleep(i*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 关闭通道和连接
        channel.close();
        connection.close();
    }

}
