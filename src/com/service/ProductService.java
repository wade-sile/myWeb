package com.service;

import java.util.List;

import com.pojo.Product;

public interface ProductService {
	List<Product> show();
	
	Product selByPid(int pid);
	
	List<Product> showProductName(String condition);
}
