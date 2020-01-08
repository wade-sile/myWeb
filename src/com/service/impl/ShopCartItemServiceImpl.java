package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.ShopCartItemMapper;
import com.pojo.ShopCartItem;
import com.service.ShopCartItemService;

@Service
public class ShopCartItemServiceImpl implements ShopCartItemService{

	@Resource
	private ShopCartItemMapper shopCartItemMapper;

	@Override
	public int insSCI(ShopCartItem shopCI) {
		return shopCartItemMapper.insSCI(shopCI);
	}

	@Override
	public List<ShopCartItem> showUserCart(int uid) {
		return shopCartItemMapper.selUserCart(uid);
	}

	@Override
	public ShopCartItem showCartOne(int uid, int pid) {
		return shopCartItemMapper.showOne(uid, pid);
	}

	@Override
	public int updCartOne(ShopCartItem shopItem) {
		return shopCartItemMapper.updOne(shopItem);
	}

	@Override
	public int delUserCarts(int uid) {
		return shopCartItemMapper.delUserCart(uid);
	}

	@Override
	public List<ShopCartItem> selHasOid(int id) {
		return shopCartItemMapper.selHasOid(id);
	}

	@Override
	public int delCartItem(int cartitemid) {
		return shopCartItemMapper.delCartItem(cartitemid);
	}
	
}
