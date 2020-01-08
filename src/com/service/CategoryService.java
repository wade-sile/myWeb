package com.service;

import java.util.List;

import com.pojo.Category;
import com.pojo.CategorySecond;
import com.pojo.Product;

public interface CategoryService {
	List<Category> showCategory();
	
	List<CategorySecond> showCategorySecond(int cid);
	
	List<Product> selByCsId(int csid);
	
	List<Product> showByCid(int cid);
}
