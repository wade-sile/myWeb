<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>订单页面</title>
<link href="css/common.css"
	rel="stylesheet" type="text/css" />
<link href="css/cart.css"
	rel="stylesheet" type="text/css" />
<link href="css/product.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a> <img
					src="image/r___________renleipic_01/logo.gif"
					alt="" />
				</a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="image/header.jpg"
					width="320" height="50" alt="正品保障" title="正品保障" />
			</div>
		</div>
		<%@ include file="menu.jsp"%>
	</div>
	<div class="container cart">
		<div class="span24">
			<div class="step step1">
				<ul>
					<li class="current"></li>
					<li>我的订单</li>
				</ul>
			</div>
			<table>
				<tbody>
						<tr>
							<th colspan="5">订单编号:<font color="red">${order.oid }</font>&nbsp;&nbsp;&nbsp;&nbsp; 
							订单金额:<font color="red">${order.money }</font>&nbsp;&nbsp;&nbsp;&nbsp;
								订单状态：${order.state }
									<a style="color: red;"
										href="">付款</a>
										已付款即将发货
									<a style="color: red;"
										href="">确认收货</a>
										交易成功
							</th>
						</tr>
						<tr>
							<th>图片</th>
							<th>商品</th>
							<th>价格</th>
							<th>数量</th>
							<th>小计</th>
						</tr>
						<c:forEach items="${userCartList}" var="cart">
							<tr>   
								<td width="60"><img
									src="${cart.image}" />
								</td>
								<td>${cart.pname}</td>
								<td>${cart.price}</td>
								<td class="quantity" width="60">
									${cart.pcount}
								</td>
								<td width="140">
								    <span class="subtotal">
								    	${cart.ptotal}
									</span>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>

	</div>
	<div class="container footer">
		<div class="span24">
			<div class="footerAd">
				<img src="image\r___________renleipic_01/footer.jpg" alt="我们的优势"
					title="我们的优势" height="52" width="950"/>
			</div>
		</div>
		<div class="span24">
			<ul class="bottomNav">
				<li><hr></hr></li>
			</ul>
		</div>
		<div class="span24">
			<div class="copyright">Copyright ©  网上商城 版权所有</div>
		</div>
	</div>
</body>
</html>