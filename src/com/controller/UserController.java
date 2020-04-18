package com.controller;

import java.util.List;
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
	   * �û�ע��
	 * @return
	 */
	@RequestMapping("insUser")
	public String insUser(User user,String rePassword,Model model) {
		if(!user.getPassword().equals(rePassword)||rePassword.equals("")) {
			model.addAttribute("msg", "请输入密码！");
			return "regist.jsp";
		}
		String check = "\\w*\\@[A-z0-9]+\\.[A-z]+";
		boolean matches = Pattern.matches(check, user.getEmail());
		if(!matches) {
			model.addAttribute("msg", "请输入有效的邮箱！");
			return "regist.jsp";
		}
		int index = userServiceImpl.insUser(user);
		if(index==0) {
			System.out.println("注册失败！请重试！");
		}
		return "redirect:login.jsp";
	}
	
	@RequestMapping("show")
	public String showUser() {
		List<User> showUser = userServiceImpl.showUser();
		for(User user:showUser) {
			System.out.println(user);
		}
		return "index.jsp";
	}
	
}
