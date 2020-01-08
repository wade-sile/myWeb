package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mapper.OrdersMapper;
import com.pojo.Orders;
import com.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersMapper orderMapper;
	@Override
	public int insOrder(Orders order) {
		return orderMapper.insOrder(order);
	}
	@Override
	public List<Orders> showUserOrders(int uid) {
		return orderMapper.selUserOrders(uid);
	}
	@Override
	public Orders showUserOrderOne(int uid) {
		return orderMapper.selUserOrderOne(uid);
	}
}
