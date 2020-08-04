package com.controller;

import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userServiceImpl;
	
	/**
	   * �û�ע��
	 * @return
	 */
	@RequestMapping("insUser")
	@ResponseBody
	public Integer insUser(User user,String rePassword,Model model) {
		if(!user.getPassword().equals(rePassword)||rePassword.equals("")) {
			model.addAttribute("msg", "请确保两次输入的密码一致！");
			return 0;
		}
		String check = "\\w*\\@[A-z0-9]+\\.[A-z]+";
		boolean matches = Pattern.matches(check, user.getEmail());
		if(!matches) {
			model.addAttribute("msg", "请输入有效的邮箱！");
			return 0;
		}
		int index = userServiceImpl.insUser(user);
		if(index==0) {
			System.out.println("注册失败！请重试！");
			return 0;
		}
		return 1;
	}
	
	@RequestMapping("isUser")
	@ResponseBody
	public Integer isUser(HttpServletRequest req,String username) {
		String uname = userServiceImpl.isUser(username);
		System.out.println(uname);
		if(uname!=null)
			return 0;
		else return 1;
	}
	
	@RequestMapping("show")
	public String showUser() {
		List<User> showUser = userServiceImpl.showUser();
		for(User user:showUser) {
			System.out.println(user);
		}
		return "../index.jsp";
	}
	
}
