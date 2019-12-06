package com.demo.service;

import java.util.List;

import com.demo.bean.User;

public interface UserService {
	
	User getUserById(Integer id);
	 
	public List<User> getUserList();

}
