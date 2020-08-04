package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.Orders;
import com.pojo.ShopCartItem;
import com.pojo.User;
import com.service.OrdersService;
import com.service.ShopCartItemService;

@Controller
public class OrdersController {
	
	@Resource
	private OrdersService ordersServiceImpl;
	@Resource
	private ShopCartItemService shopCartItemServiceImpl;
	/**
	 * ����
	 * @return
	 */
	double money=0;
	@RequestMapping("order")
	public String showOrder(HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		List<ShopCartItem> cartList = shopCartItemServiceImpl.showUserCart(uid);
		money = 0;
		for (ShopCartItem shopCartItem : cartList) {
			money+=shopCartItem.getPtotal();
		}
		req.setAttribute("orderList", cartList);
		req.setAttribute("totalMoney", money);
		return "order.jsp";
	}
	@RequestMapping("clickOrder")
	public String clickOrder(Orders order,HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		order.setUid(uid);
//		if(req.getAttribute("totalMoney")==null) {
//			return "redirect:index.jsp";
//		}
		order.setMoney(money);
		int index = ordersServiceImpl.insOrder(order);
		if(index<1) {
			System.out.println("下单失败！");
			return "index.jsp";
		}
		return "../orderSuccess";
	}
}
