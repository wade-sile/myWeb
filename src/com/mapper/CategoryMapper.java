package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.pojo.Category;
import com.pojo.CategorySecond;
import com.pojo.Product;

public interface CategoryMapper {
	/**
	 * һ��Ŀ¼
	 */
	@Select("select * from category")
	List<Category> showCategory();
	
	/**
	 * ����Ŀ¼
	 */
	@Select("select * from categorysecond where fk_cid=#{0}")
	List<CategorySecond> showCategorySecond(int cid);

	/**
	 * һ��Ŀ¼����¼�
	 * @return
	 */
	@Select("select * from product where csid in(select csid from categorysecond where fk_cid = #{0})")
	List<Product> selByCid(int cid);
	
	/**
	 * ����Ŀ¼����¼�
	 * @return
	 */
	@Select("select * from product where csid=#{0}")
	List<Product> selByCsId(int csid);
}
