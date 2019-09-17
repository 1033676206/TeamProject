package com.fs.service;

import com.fs.domain.User;

public interface UserService {

	User checkUserLogin(User user);// 根据用户信息查询
	
	boolean checkUserName(String username);// 根据用户名来查询是否存在
	
	void saveUser(User user);// 添加一个用户
}
