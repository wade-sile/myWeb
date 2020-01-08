package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.Product;
import com.pojo.ShopCartItem;
import com.pojo.User;
import com.service.ProductService;
import com.service.ShopCartItemService;

@Controller
public class ShopCartItemController {
	
	@Resource
	private ShopCartItemService shopCartItemServiceImpl;
	@Resource
	private ProductService productServiceImpl;
	/**
	 * 添加商品到购物车
	 * @return
	 */
	@RequestMapping("cartAdd")
	public String  cartAdd(Integer pid,Integer count,HttpServletRequest req) {
		if(pid==null||pid==0)
			return "cartShow";
		int uid = ((User)(req.getSession().getAttribute("loginUser"))).getUid();
		ShopCartItem shopOne = shopCartItemServiceImpl.showCartOne(uid, pid);
		Product product = productServiceImpl.selByPid(pid);
		if(shopOne!=null) {
			shopOne.setPcount(count+shopOne.getPcount());
			shopOne.setPtotal(product.getShop_price()*shopOne.getPcount());
			int index = shopCartItemServiceImpl.updCartOne(shopOne);
			if(index<1) {
				System.out.println("更新失败");
			}
			return "cartShow";
		}
		ShopCartItem shopCI = new ShopCartItem();
		shopCI.setUid(((User)req.getSession().getAttribute("loginUser")).getUid());
		shopCI.setPcount(count);
		shopCI.setPid(pid);
		shopCI.setImage(product.getImage());
		shopCI.setPname(product.getPname());
		shopCI.setPrice(product.getShop_price());
		shopCI.setPtotal(product.getShop_price()*count);
		int index = shopCartItemServiceImpl.insSCI(shopCI);
		if(index<1) {
			System.out.println("加入购物车失败!");
		}
		return "cartShow";
	}
	
	@RequestMapping("cartShow")
	public String userCartShow(HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		List<ShopCartItem> cartList = shopCartItemServiceImpl.showUserCart(uid);
		double money=0;
		for (ShopCartItem shopCartItem : cartList) {
			money+=shopCartItem.getPtotal();
		}
		req.setAttribute("totalMoney", money);
		req.setAttribute("cartList", cartList);
		return "cart.jsp";
	}
	
	@RequestMapping("delCart")
	public String delCart(HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		int index = shopCartItemServiceImpl.delUserCarts(uid);
		if(index<1) {
			System.out.println("清空购物车失败！");
			return "redirect:index.jsp";
		}
		req.setAttribute("msg", "清空购物车成功");
		return "cart.jsp";
	}
	
	@RequestMapping("deleteItem")
	public String delCartItem(int cartitemid) {
		int index = shopCartItemServiceImpl.delCartItem(cartitemid);
		if(index<1) {
			System.out.println("删除商品失败！");
		}
		return "cartShow";
	}
}
