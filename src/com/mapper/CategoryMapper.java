package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.pojo.Category;
import com.pojo.CategorySecond;
import com.pojo.Product;

public interface CategoryMapper {
	/**
	 * 一级目录
	 */
	@Select("select * from category")
	List<Category> showCategory();
	
	/**
	 * 二级目录
	 */
	@Select("select * from categorysecond where fk_cid=#{0}")
	List<CategorySecond> showCategorySecond(int cid);

	/**
	 * 一级目录点击事件
	 * @return
	 */
	@Select("select * from product where csid in(select csid from categorysecond where fk_cid = #{0})")
	List<Product> selByCid(int cid);
	
	/**
	 * 二级目录点击事件
	 * @return
	 */
	@Select("select * from product where csid=#{0}")
	List<Product> selByCsId(int csid);
}
