package com.net.service;
import org.springframework.stereotype.Service;

import com.net.bean.User;

import java.util.List;
 
/**
 * @ClassName cn.saytime.service.UserService
 * @Description
 */
public interface UserService {
 
	User getUserById(Integer id);
 
	public List<User> getUserList();
 
	public int add(User user);
 
	public int update(Integer id, User user);
 
	public int delete(Integer id);

}