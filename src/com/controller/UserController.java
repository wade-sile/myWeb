package com.controller;

import java.util.regex.Pattern;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userServiceImpl;
	
	/**
	   * 用户注册
	 * @return
	 */
	@RequestMapping("insUser")
	public String insUser(User user,String rePassword,Model model) {
		if(!user.getPassword().equals(rePassword)||rePassword.equals("")) {
			model.addAttribute("msg", "两次输入的密码不正确");
			return "regist.jsp";
		}
		String check = "\\w*\\@[A-z0-9]+\\.[A-z]+";
		boolean matches = Pattern.matches(check, user.getEmail());
		if(!matches) {
			model.addAttribute("msg", "邮箱输入有误");
			return "regist.jsp";
		}
		int index = userServiceImpl.insUser(user);
		if(index==0) {
			System.out.println("注册失败");
		}
		System.out.println("注册成功");
		return "redirect:login.jsp";
	}
}
