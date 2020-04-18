package com.test;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.User;
import com.service.impl.UserServiceImpl;
import com.util.MD5Util;


public class Test {
	
	
	@org.junit.Test
	public  void beanlifeTest(){
	    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Man man=(Man)context.getBean("man");
	    man.run();
	    context.close();
	}
	@org.junit.Test
	public void test() {
		String md5 = MD5Util.getMD5("123456");
		System.out.println(md5);
	}
}
