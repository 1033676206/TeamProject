package com.fs.mapper;

import com.fs.domain.User;

public interface LoginMapper {

	// 通过账号和密码进行查询
	User selectByLogin(User user);
	
	// 通过账号进行查询
	User selectByUsername(String username);
	
	// 将当前用户添加进数据库中
	void insertUser(User user);
}
