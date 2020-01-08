package com.service;

import com.pojo.User;

public interface UserService {
	User show(String username,String password);
	
	int insUser(User user);
}
