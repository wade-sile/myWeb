package com.service;

import java.util.List;
import com.pojo.ShopCartItem;

public interface OrderItemService {
	int insOrdersList(List<ShopCartItem> userCartList,int oid);
}
