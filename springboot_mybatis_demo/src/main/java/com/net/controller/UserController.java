package com.net.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.bean.JsonResult;
import com.net.bean.User;
import com.net.service.UserService;
 
@RestController
public class UserController {
 
	@Autowired
	private UserService userService;
 
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUserById (@PathVariable(value = "id") Integer id){
		JsonResult r = new JsonResult();
		try {
			User user = userService.getUserById(id);
			r.setResult(user);
			r.setStatus("ok");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}
 
	/**
	 * 查询用户列表
	 * @return
	 */
	@RequestMapping(value = "findUsers", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getUserList (){
		JsonResult r = new JsonResult();
		try {
			List<User> users = userService.getUserList();
			r.setResult(users);
			r.setStatus("ok");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}
 
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */

	@RequestMapping(value = "/add", method =RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<JsonResult> add ( User user){
		JsonResult r = new JsonResult();
		try {
			int orderId = userService.add(user);
			if (orderId < 0) {
				r.setResult(orderId);
				r.setStatus("fail");
			} else {
				r.setResult(orderId);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
 
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}
 
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "delte/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<JsonResult> delete (@PathVariable(value = "id") Integer id){
		JsonResult r = new JsonResult();
		try {
			int ret = userService.delete(id);
			if (ret < 0) {
				r.setResult(ret);
				r.setStatus("fail");
			} else {
				r.setResult(ret);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
 
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}
 
	/**
	 * 根据id修改用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "edit/{id}", method = RequestMethod.PUT)
	public ResponseEntity<JsonResult> update (@PathVariable("id") Integer id, @RequestBody User user){
		JsonResult r = new JsonResult();
		try {
			int ret = userService.update(id, user);
			if (ret < 0) {
				r.setResult(ret);
				r.setStatus("fail");
			} else {
				r.setResult(ret);
				r.setStatus("ok");
			}
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
 
			e.printStackTrace();
		}
		return ResponseEntity.ok(r);
	}
 
}
