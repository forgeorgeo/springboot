package cn.demo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.bean.Days;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String,Days> redisTemplate;
    
    //注入一个对象缓存在redis
    @Test
    public void testSet(){
    	Days d=new Days();
        d.setDate("123");
        d.setDaysId("456");
        d.setItemNumber(123);
        d.setOpenId("dawda");
        d.setTitle("title");
        this.redisTemplate.opsForValue().set("days",d);
        System.out.println("redisTemplate=="+(redisTemplate.opsForValue().get("days")));
    }
}
