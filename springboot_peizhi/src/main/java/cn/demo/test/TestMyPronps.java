package cn.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.bean.MyProps;
import cn.demo.bean.User;

@RestController
public class TestMyPronps {
	
	@Autowired
	private MyProps myProps;
 
	@RequestMapping(value = "testmyProps", method = RequestMethod.GET)
	public String test2(){
		return myProps.getSimpleProp() + "==" + myProps.getListProp1()+ "==" + myProps.getArrayProps();
	}


}
