package com.fs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.domain.User;
import com.fs.mapper.LoginMapper;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	LoginMapper lgMapper;
	
	@Override
	public User checkUserLogin(User user) {
		User rntUser = lgMapper.selectByLogin(user);
		
		return rntUser;
	}

	@Override
	public boolean checkUserName(String username) {
		User rntUser = lgMapper.selectByUsername(username);
		
		return rntUser != null;
	}

	@Override
	public void saveUser(User user) {
		lgMapper.insertUser(user);
	}

	

}
