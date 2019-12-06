package com.demo.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@RestController     //定义这是一个控制器，可以通过浏览器访问
@RequestMapping("kafka")
public class TestKafkaProducerController {
 
    
    //定义一个kafka模板
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate; //这里会报错，但不影响
    //当在浏览器上输入http://localhost:8080/kafka/send?msg=abc，就会发送abc到服务器上去让消费者接收，msg对应下面的String msg
	
    @RequestMapping("send")
    public String send(String msg){
        kafkaTemplate.send("test_topic", msg); //使用kafka模板发送信息
        return "success";
    }

}
