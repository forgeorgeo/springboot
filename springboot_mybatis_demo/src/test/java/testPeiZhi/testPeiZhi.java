package testPeiZhi;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.net.bean.MyProps;

public class testPeiZhi {
	
	@Autowired  
	private MyProps myProps;   
	
	@Test  
	public void propsTest() throws JsonProcessingException {  
	    System.out.println("simpleProp: " + myProps.getSimpleProp());  
	    System.out.println("arrayProps: " + myProps.getArrayProps());  
	   /* System.out.println("listProp1: " + objectMapper.writeValueAsString(myProps.getListProp1()));  
	    System.out.println("listProp2: " + objectMapper.writeValueAsString(myProps.getListProp2()));  
	    System.out.println("mapProps: " + objectMapper.writeValueAsString(myProps.getMapProps()));  */
	} 
}

