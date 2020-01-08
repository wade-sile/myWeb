package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.ShopCartItem;

public interface OrderItemMapper {
	int insOrderitem(@Param("userCartList")List<ShopCartItem> userCartList,@Param("oid")int oid);
}
