package com.net.service.impl;
import com.net.bean.User;
import com.net.mapper.UserMapper2;
import com.net.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
/**
 * @ClassName cn.saytime.service.impl.UserServiceImpl
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
 
	@Autowired
	private UserMapper2 userMapper;
 
	@Override
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}
 
	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
 
	@Override
	public int add(User user) {
		return userMapper.add(user);
	}
 
	@Override
	public int update(Integer id, User user) {
		return userMapper.update(id, user);
	}
 
	@Override
	public int delete(Integer id) {
		return userMapper.delete(id);
	}

}