package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pojo.Product;

public interface ProductMapper {
	List<Product> show();
	
	@Select("select * from product where pid=#{0}")
	Product selByPid(int pid);
	
	List<Product> selByProductName(@Param("condition")String condition);
}
