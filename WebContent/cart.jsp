<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>购物车</title>
	<link href="css/common.css" rel="stylesheet" type="text/css"/>
	<link href="css/cart.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript">
    </script>

</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a href="http://localhost:8080/mango/"> <img
					src="image/r___________renleipic_01/logo.gif"
					alt=""/></a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="image/header.jpg"
					width="320" height="50" alt="正品保障" title="正品保障"/>
			</div>
		</div>
		<%@ include file="menu.jsp"%>
	</div>
	<div class="container cart">
					<div class="span24">
						<div class="step step1"></div>
						<table>
							<tbody>
								<tr>
									<th>图片</th>
									<th>商品</th>
									<th>价格</th>
									<th>数量</th>
									<th>小计</th>
									<th>操作</th>
								</tr>
									<c:forEach items="${cartList}" var="cart">
										<tr>
											<!-- 商品图片 -->
											<td width="60">
											<input type="hidden" name="id" value="${cart.pid }"/>
													<img src="${cart.image}"/></td>
											<!-- 商品名称 -->
											<td><a target="_blank">${cart.pname}</a></td>
											<!-- 商品单价 -->
											<td>${cart.price}</td>
											<!-- 商品数量 -->
											<td class="quantity" width="60">${cart.pcount}</td>
											<!-- 小计 -->
											<td class="quantity" width="60">${cart.ptotal}</td>
											<td><a href="deleteItem?cartitemid=${cart.cartitemid }" onclick="return confirm('确定要删除吗？')" class="delete">删除</a>
											</td>
										</tr>
									</c:forEach>
							</tbody>
						</table>
						<dl id="giftItems" class="hidden" style="display: none;">
						</dl>
						<div class="total">
							<em id="promotion"></em> <em> 登录后确认是否享有优惠 </em> 赠送积分: <em
								id="effectivePoint"></em> 商品金额: ${totalMoney }<strong
								id="effectivePrice"></strong>
						</div>
						<div class="bottom">
							<span style="float: left;">${msg }</span>
							<a ${cartList!=null?'href="delCart"':'target="_blank"' } id="clear" class="clear">清空购物车</a>
							<a ${cartList!=null?'href="order"':'target="_blank"' } id="submit" class="submit">提交订单</a>
						</div>
			</div>
				<c:if test="${empty cartList }">
					<div class="span24">
						<div class="step step1">
							<span><h2>亲!您还没有购物!请先去购物!</h2></span>
						</div>
					</div>
				</c:if>
	</div>
	<div class="container footer">
		<div class="span24">
			<div class="footerAd">
				<img src="image/footer.jpg"
					width="950" height="52" alt="我们的优势" title="我们的优势"/>
			</div>
		</div>
		<div class="span24">
			<ul class="bottomNav">
				<li><hr></hr></li>
			</ul>
		</div>
		<div class="span24">
			<div class="copyright">Copyright © 网上商城 版权所有</div>
		</div>
	</div>
</body>
</html>