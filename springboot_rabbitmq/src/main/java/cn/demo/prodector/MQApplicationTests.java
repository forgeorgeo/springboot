package cn.demo.prodector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MQApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    //@Test
    public void testSimpleQueue() {
        String message = "你好- 简单队列RabbitMQ !";
        amqpTemplate.convertAndSend("test_simple_queue", message);
        System.out.println("[x] 发送 " + message + "--ok");
    }

}
