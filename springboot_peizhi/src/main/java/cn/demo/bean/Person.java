package cn.demo.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component  
@PropertySource(value="classpath:person.properties")
@ConfigurationProperties(prefix ="person")
public class Person {  
    private String name;  
    private Integer age;  
    private String address;  
    private Map<String, String> object;
    private List<Object> lists;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, String> getObject() {
		return object;
	}
	public void setObject(Map<String, String> object) {
		this.object = object;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", object=" + object + ", lists="
				+ lists + "]";
	}
 
   
} 