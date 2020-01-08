package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mapper.OrderItemMapper;
import com.pojo.ShopCartItem;
import com.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Resource
	private OrderItemMapper orderItemMapper;
	
	@Override
	public int insOrdersList(List<ShopCartItem> userCartList,int oid) {
		return orderItemMapper.insOrderitem(userCartList,oid);
	}
}
