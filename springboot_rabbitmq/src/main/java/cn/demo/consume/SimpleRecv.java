package cn.demo.consume;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@RabbitListener(queues = "test_simple_queue")
@Component
public class SimpleRecv {

    @RabbitHandler
    public void process(String message) {
        System.out.println("[x]消费 : " + message);
    }

}
