package cn.demo.consume;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * sms消费者
 */
@RabbitListener(queues = "test_queue_fanout_sms")
@Component
public class SmsRecv {

    @RabbitHandler
    public void process(String message){
        System.out.println("[sms] 短信消费 : " + message);
    }

}
