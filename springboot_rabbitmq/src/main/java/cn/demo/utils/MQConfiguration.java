package cn.demo.utils;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LI
 *
 */
@Configuration
public class MQConfiguration {

	
    /**
     * 声明队列
     */
    private static final String QUEUE_SIMPLE_NAME = "test_simple_queue";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_SIMPLE_NAME, false, false, false, null);
    }
    
    

}
