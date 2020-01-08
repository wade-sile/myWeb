package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.ProductMapper;
import com.pojo.Product;
import com.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper productMapper;
	@Override
	public List<Product> show() {
		return productMapper.show();
	}
	@Override
	public Product selByPid(int pid) {
		return productMapper.selByPid(pid);
	}
	@Override
	public List<Product> showProductName(String condition) {
		return productMapper.selByProductName(condition);
	}
}
