package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.User;
import com.service.ProductService;
import com.service.UserService;

@Controller
public class LoginController {
	@Resource
	private UserService userServiceImpl;
	@Resource
	private ProductService productServiceImpl;
	
	/**
	 * ÓÃ»§µÇÂ¼
	 * @return
	 */
	@RequestMapping("login")
	public String login(String username,String password,HttpSession session,Model model) {
		User user = userServiceImpl.show(username, password);
		//µÇÂ¼ÑéÖ¤
		if(user==null) {
			model.addAttribute("msg", "ÕËºÅ»òÕßÃÜÂë´íÎó");
			return "login.jsp";
		}
		session.setAttribute("loginUser", user);
		return "redirect:index.jsp";
	}
	
	/**
	   *  ÍË³öµÇÂ¼
	 * @return
	 */
	@RequestMapping("loginOut")
	public String loginOut(HttpServletRequest req) {
		req.getSession().removeAttribute("loginUser");
		return "redirect:login.jsp";
	}
}
