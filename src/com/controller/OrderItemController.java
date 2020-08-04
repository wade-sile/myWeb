package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.Orders;
import com.pojo.ShopCartItem;
import com.pojo.User;
import com.service.OrderItemService;
import com.service.OrdersService;
import com.service.ShopCartItemService;

@Controller
public class OrderItemController {
	@Resource
	private OrderItemService orderItemServiceImpl;
	@Resource
	private OrdersService prdersServiceImpl;
	@Resource
	private ShopCartItemService shopCartItemServiceImpl;
	
	@RequestMapping("orderSuccess")
	public String showOrderList(HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		Orders order = prdersServiceImpl.showUserOrderOne(uid);
		List<ShopCartItem> userCartList = shopCartItemServiceImpl.showUserCart(uid);
		req.setAttribute("userCartList", userCartList);
		req.setAttribute("order", order);
		req.getSession().setAttribute("oid", order.getOid());
		return "../insOrderItem";
	}
	@RequestMapping("insOrderItem")
	public String insOrderItem(HttpServletRequest req) {
		int oid = Integer.parseInt(req.getSession().getAttribute("oid").toString());
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		List<ShopCartItem> userCartList = shopCartItemServiceImpl.showUserCart(uid);
		for (ShopCartItem shopCartItem : userCartList) {
			System.out.println(shopCartItem);
		}
		int index = orderItemServiceImpl.insOrdersList(userCartList,oid);
		if(index<1) {
			System.out.println("添加购物车失败！");
			return "index.jsp";
		}
		req.getSession().removeAttribute("oid");
		return "../delUserCart";
	}
	
	@RequestMapping("delUserCart")
	public String delUserCart(HttpServletRequest req) {
		int uid = ((User)req.getSession().getAttribute("loginUser")).getUid();
		int index = shopCartItemServiceImpl.delUserCarts(uid);
		if(index<1) {
			System.out.println("清除购物车失败！");
			return "index.jsp";
		}
		return "orderList.jsp";
	}
}
