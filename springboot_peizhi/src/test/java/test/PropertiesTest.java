package test;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.bean.Config;
import cn.demo.bean.User;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class PropertiesTest {
	
    @Autowired
    private Config user;
    
    @Test
    public void test() {
        System.out.println("server display name:" + user.getUsername());
        System.out.println("server address:" + user.getAge());
        //System.out.println("server emain:" + user.getEmail());
    }
}