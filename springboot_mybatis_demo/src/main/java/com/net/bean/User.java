package com.net.bean;
import java.util.Date;
 

public class User {
 
	public  int id;
	public  String username;
	public  int age;
	public  Date ctm;
 
	public User() {
	}
 
	public User(String username, int age) {
		this.username = username;
		this.age = age;
		this.ctm = new Date();
	}
	// Getter、Setter
}