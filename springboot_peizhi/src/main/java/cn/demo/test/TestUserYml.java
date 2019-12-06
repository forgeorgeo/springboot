package cn.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.bean.MyProps;
import cn.demo.bean.User;
import cn.demo.bean.UserYml;

@RestController
public class TestUserYml {
	
	@Autowired
	private UserYml userYml;
 
	//新建的test.yml和 person.yml文件，取不到值，都是null，但是新建的person.properies可以取值。
	@RequestMapping(value = "testUserYml", method = RequestMethod.GET)
	public String test2(){
		return userYml.getUsername() + ":" + userYml.getAge()+ ":" + userYml.getEmail();
	}


}
