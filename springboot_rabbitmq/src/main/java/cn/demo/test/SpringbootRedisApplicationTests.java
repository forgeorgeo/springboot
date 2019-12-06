package cn.demo.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.bean.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void contextLoads() {

        // 存取字符串
        redisTemplate.opsForValue().set("aa", "字符串1");
        Object a = redisTemplate.opsForValue().get("aa");
        System.out.println("取字符串=="+a);

        // 存取user对象
//        redisTemplate.opsForValue().set("user1", new User(1, "张三"));
//        User user1 = (User) redisTemplate.opsForValue().get("user1");
//        System.out.println(user1);
    }

}
