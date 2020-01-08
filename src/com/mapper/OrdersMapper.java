package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.pojo.Orders;

public interface OrdersMapper {
	
	@Insert("insert into orders values(default,#{money},#{state},#{receiveInfo},#{phoNum},default,#{uid},#{accepter})")
	@SelectKey(statement="select LAST_INSERT_ID() AS oid",keyProperty="oid",before=false,resultType=Integer.class) //返回最新的oid
	int insOrder(Orders order);
	
	@Select("select * from orders where uid=#{0} order by order_time desc limit 1;")
	Orders selUserOrderOne(int uid);
	
	@Select("select * from orders where uid=#{0} order by oid")
	List<Orders> selUserOrders(int uid);
}
