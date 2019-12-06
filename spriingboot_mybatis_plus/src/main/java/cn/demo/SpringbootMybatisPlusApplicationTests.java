package cn.demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.demo.model.User;
import cn.demo.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        // 所有用户
        List<User> users = userService.selectList(null);
        System.out.println(users);
        
        //查询id=1的用户
        User user = userService.selectById(1);
        System.out.println("users1=="+user);
    }

}
