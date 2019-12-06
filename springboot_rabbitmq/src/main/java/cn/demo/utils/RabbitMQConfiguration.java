package cn.demo.utils;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {
	
	//发布2个队列到交换机
    private static final String EXCHANGE_FANNOUT_NAME = "test_exchange_fanout";
    private static final String QUEUE_PS_SMS_NAME = "test_queue_fanout_sms";
    private static final String QUEUE_PS_EMAIL_NAME = "test_queue_fanout_email";

    @Bean("fanoutExchange")
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(EXCHANGE_FANNOUT_NAME);
    }
    @Bean
    public Queue fanoutSmsQueue(){
        return new Queue(QUEUE_PS_SMS_NAME, false, false, false, null);
    }
    @Bean
    public Queue fanoutEmailQueue(){
        return new Queue(QUEUE_PS_EMAIL_NAME, false, false, false, null);
    }
    @Bean
    public Binding smsQueueExchangeBinding(FanoutExchange fanoutExchange, Queue fanoutSmsQueue){
        return BindingBuilder.bind(fanoutSmsQueue).to(fanoutExchange);
    }
    @Bean
    public Binding emailQueueExchangeBinding(FanoutExchange fanoutExchange, Queue fanoutEmailQueue){
        return BindingBuilder.bind(fanoutEmailQueue).to(fanoutExchange);
    }

}
