package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	@Override
	public User show(String username, String password) {
		return userMapper.show(username, password);
	}
	@Override
	public int insUser(User user) {
		return userMapper.insUser(user);
	}
}
