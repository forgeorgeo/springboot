package cn.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.bean.MyProps;
import cn.demo.bean.User;

@RestController
public class TestUser {
	
	@Autowired
	private User user;
 
	@RequestMapping(value = "testUser", method = RequestMethod.GET)
	public String test2(){
		System.out.println("进入test2方法");
		return user.getUsername() + ":" + user.getAge()+ ":" + user.getEmail();
	}


}
