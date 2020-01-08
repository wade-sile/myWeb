package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pojo.ShopCartItem;

public interface ShopCartItemMapper {
	@Insert("insert into shopcartitem value(default,#{uid},#{pid},#{pcount},#{price},#{image},#{ptotal},#{pname})")
	int insSCI(ShopCartItem shopCI);
	
	@Select("select * from shopcartitem where uid=#{0}")
	List<ShopCartItem> selUserCart(int uid);
	
	@Select("select * from shopcartitem where uid=#{0} and pid=#{1}")
	ShopCartItem showOne(int uid,int pid);
	
	@Update("update shopcartitem set pcount=#{pcount},ptotal=#{ptotal} where pid=#{pid}")
	int updOne(ShopCartItem shopItem);
	
	@Delete("delete from shopcartitem where uid=#{0}")
	int delUserCart(int uid);
	
	List<ShopCartItem> selHasOid(@Param("oid")int id);
	
	@Delete("delete from shopcartitem where cartitemid=#{0}")
	int delCartItem(int cartitemid);
}
