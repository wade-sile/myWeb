package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.pojo.User;

public interface UserMapper {
	@Select("select * from user where username=#{0} and password=#{1}")
	User show(String username,String password);
	
	@Insert("insert into user values(default,#{username},#{password},#{name},#{email},#{phone},#{addr},default,default)")
	int insUser(User user);
	
	@Select("select * from user")
	List<User> selUser();
}
