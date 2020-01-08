package com.service;

import java.util.List;


import com.pojo.ShopCartItem;

public interface ShopCartItemService {
	int insSCI(ShopCartItem shopCI);
	
	List<ShopCartItem> showUserCart(int uid);
	
	ShopCartItem showCartOne(int uid,int pid);
	
	int updCartOne(ShopCartItem shopItem);
	
	int delUserCarts(int uid);
	
	List<ShopCartItem> selHasOid(int id);
	
	int delCartItem(int cartitemid);
}
