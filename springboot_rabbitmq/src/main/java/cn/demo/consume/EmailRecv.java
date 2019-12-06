package cn.demo.consume;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * email消费者
 */
@RabbitListener(queues = "test_queue_fanout_email")
@Component
public class EmailRecv {

	//消费 email队列的消息
    @RabbitHandler
    public void process(String message){
        System.out.println("[email] 邮件消费 : " + message);
    }

}
