package com.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.Category;
import com.pojo.Product;
import com.service.CategoryService;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryService categoryServiceImpl;
	
	@RequestMapping("categoryOne")
	private String categoryOne(HttpServletRequest req) {
		List<Category> categoryList = categoryServiceImpl.showCategory();
		for (Category category : categoryList) {
			category.setCsList(categoryServiceImpl.showCategorySecond(category.getCid()));
		}
		req.getSession().setAttribute("categoryList", categoryList);
		return "redirect:index.jsp";
	}
	@RequestMapping("csProduct")
	private String csProduct(int id,HttpServletRequest req) {
		List<Product> proList = categoryServiceImpl.selByCsId(id);
		req.getSession().setAttribute("proList", proList);
		return "redirect:index.jsp";
	}
	@RequestMapping("cProduct")
	private String cProduct(int id,HttpServletRequest req) {
		List<Product> proList = categoryServiceImpl.showByCid(id);
		req.getSession().setAttribute("proList", proList);
		return "redirect:index.jsp";
	}
}
