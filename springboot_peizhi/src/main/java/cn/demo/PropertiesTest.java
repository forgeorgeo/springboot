package cn.demo;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.bean.Config;
import cn.demo.bean.Person;
import cn.demo.bean.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
	
    @Autowired
    private User user;
    
    @Autowired
    private Person person;
    
  //新建的test.yml和 person.yml文件，取不到值，都是null，但是新建的person.properies可以取值。
    
    @Test
    public void test() {
        System.out.println("server display name:" + user.getUsername());
        System.out.println("server address:" + user.getAge());
        System.out.println("server emain:" + user.getEmail());
    }
    
    @Test
    public void test2() {
        System.out.println("person-infomation:" + person.toString());
    }
    
    
}