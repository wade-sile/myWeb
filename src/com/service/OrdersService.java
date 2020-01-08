package com.service;

import java.util.List;

import com.pojo.Orders;

public interface OrdersService {
	int insOrder(Orders order);
	
	Orders showUserOrderOne(int uid);
	
	List<Orders> showUserOrders(int uid);
}
