package com.demo.dao;

import java.util.List;

import com.demo.mapper.User;


public interface UserDao {
	
	public User getUserById(Integer id);
	
	public List<User> getUserList();

}
