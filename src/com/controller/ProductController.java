package com.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	@Resource
	private ProductService productServiceImpl;
	
	/**
	 * ��ʼ��ҳ��
	 * @param session
	 * @return
	 */
	@RequestMapping("/initIndex")
	public String initIndex(HttpSession session) {
		List<Product> productList = productServiceImpl.show();
		session.setAttribute("proList", productList);
		return "redirect:categoryOne";
	}
	
	/**
	 * ����ͼƬ��Ʒ
	 * @return
	 */
	@RequestMapping("/product")
	public String productShow(Integer pid,Model model) {
		Product product = productServiceImpl.selByPid(pid);
		System.out.println(product);
		if(product==null) {
			System.out.println("查找物品失败！");
		}
		model.addAttribute("product", product);
		return "product.jsp";
	}
	
	/**
	 * ������Ʒ��Ϣ
	 */
	@RequestMapping("selByProductName")
	public String selProduct(String condition,HttpSession session) {
		condition=condition.trim();
		if(condition.equals("请输入关键词"))
			condition="";
		List<Product> showProductName = productServiceImpl.showProductName(condition);
		session.setAttribute("proList", showProductName);
		return "redirect:categoryOne";
	}
}
