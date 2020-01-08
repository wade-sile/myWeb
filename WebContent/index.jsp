<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>购物商城</title>
<link href="css/slider.css"
	rel="stylesheet" type="text/css" />
<link href="css/common.css"
	rel="stylesheet" type="text/css" />
<link href="css/index.css"
	rel="stylesheet" type="text/css" />
	<link href="css/product.css"
		rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a href=""> <img
					src="image/r___________renleipic_01/logo.gif"
					alt="服装商城" />
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
	
	<div class="container productList">
			<div class="span6">
				<div class="hotProductCategory">
					<c:forEach items="${categoryList }" var="cg">
						<dl>
							<dt>
								<a href="cProduct?id=${cg.cid }">${cg.cname }</a>
							</dt>
							<c:forEach items="${cg.csList }" var="cs">
								<dd>
									<a href="csProduct?id=${cs.csid }">${cs.csname }</a>
								</dd>
							</c:forEach>
						</dl>
					</c:forEach>
				</div>
			</div>
		<div class="span18 last">
			<div id="result" class="result table clearfix">
				<div class="title">
					<strong>热门商品</strong>
				</div> 
				<ul>
					<c:forEach items="${proList}" var="product">
						<c:if test="${product.is_hot==1 }">
							<li><a href="product?pid=${product.pid }" target="_blank">
							 <img src="${product.image}" width="170px" height="170px" style="display: inline-block;"/>
								<span
									style='color: green;align:center;'>${product.pname }</span><span class="price">
										商城价：${product.shop_price } </span>
							</a></li>
						</c:if>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="span18 last">
			<div id="result" class="result table clearfix">
				<div class="title">
					<strong>最新商品</strong> <a target="_blank"></a>
				</div>
				<ul>
					<c:forEach items="${proList}" var="product">
						<li><a
							href="product?pid=${product.pid }"
							target="_blank">
							 <img src="${product.image}" width="170" height="170" style="display: inline-block;"/>
								<span
									style='color: green'>${product.pname }</span> <span class="price">
										商城价：${product.shop_price } </span>
								</a>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		
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