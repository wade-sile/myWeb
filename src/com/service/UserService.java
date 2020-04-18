package com.service;

import java.util.List;

import com.pojo.User;

public interface UserService {
	User show(String username,String password);
	
	int insUser(User user);
	List<User> showUser();
}
