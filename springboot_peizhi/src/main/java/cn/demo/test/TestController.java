package cn.demo.test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import cn.demo.bean.MyProps;
import cn.demo.bean.Config;
 
@RestController
public class TestController {
 
	@Autowired
	private Config propertiesConfig;
 
	@RequestMapping(value = "testPropertiesConfig", method = RequestMethod.GET)
	public String test(){
		//return propertiesConfig.getUsername() + ":" + propertiesConfig.getAge();
		return propertiesConfig.getToString();
	}
	
	public void propsTest() throws JsonProcessingException {  
	    System.out.println(propertiesConfig.getUsername() + ":" + propertiesConfig.getAge());
	    //System.out.println("arrayProps: " + myProps.getArrayProps());  
	} 
}	