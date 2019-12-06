package cn.demo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test_1{
	
    //@Autowired
	@Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void set(){
        redisTemplate.opsForValue().set("Key","取出的key");
        System.out.println("redis=="+redisTemplate.opsForValue().get("Key"));
    }
}
