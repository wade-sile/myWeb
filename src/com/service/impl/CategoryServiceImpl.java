package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CategoryMapper;
import com.pojo.Category;
import com.pojo.CategorySecond;
import com.pojo.Product;
import com.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryMapper categoryMapper;
	@Override
	public List<Category> showCategory() {
		return categoryMapper.showCategory();
	}

	@Override
	public List<CategorySecond> showCategorySecond(int cid) {
		return categoryMapper.showCategorySecond(cid);
	}

	@Override
	public List<Product> selByCsId(int csid) {
		return categoryMapper.selByCsId(csid);
	}

	@Override
	public List<Product> showByCid(int cid) {
		return categoryMapper.selByCid(cid);
	}
	
}
