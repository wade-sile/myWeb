<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
	<title>购物商城</title>
	<link href="css/common.css"
		rel="stylesheet" type="text/css"/>
		<link href="css/product.css"
			rel="stylesheet" type="text/css"/>
			
</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a> <img
					src="image/r___________renleipic_01/logo.gif"
					alt=""/></a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="image\r___________renleipic_01/header.jpg" alt="正品保障"
					title="正品保障" height="50" width="320"/>
			</div>
		</div>
		<%@ include file="menu.jsp"%>
	</div>
	<div class="container productContent">
		<div class="span6">
				<div class="hotProductCategory">
						<dl>
							<dt>
								<a href=""></a>
							</dt>
								<dd>
									<a href=""></a>
								</dd>
						</dl>
				</div>
		</div>
		<div class="span18 last">

			<div class="productImage">
				<div class="zoomPad">
					<img style="opacity: 1;" title="" class="medium"
						src="${product.image }"/>
						<div
							style="display: block; top: 0px; left: 162px; width: 0px; height: 0px; position: absolute; border-width: 1px;"
							class="zoomPup"></div>
						<div
							style="position: absolute; z-index: 5001; left: 312px; top: 0px; display: block;"
							class="zoomWindow">
							<div style="width: 368px;" class="zoomWrapper">
								<div style="width: 100%; position: absolute; display: none;"
									class="zoomWrapperTitle"></div>
								<div style="width: 0%; height: 0px;" class="zoomWrapperImage">
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="name">
			</div>
			<div class="sn">
				<div>
					编号：${product.pid }
				</div>
			</div>
			<div class="info">
				<dl>
					<dt>亿家价:</dt>
					<dd>
						<strong>￥：${product.shop_price } 元
						</strong> 参 考 价：
						<del>
							￥
							${product.market_price }
							元
						</del>
					</dd>
				</dl>
				<dl>
					<dt>促销:</dt>
					<dd>
						<a target="_blank" title="限时抢购 ">限时抢购</a>
					</dd>
				</dl>
				<dl>
					<dt></dt>
					<dd>
						<span> </span>
					</dd>
				</dl>
			</div>
			<form id="cartForm" action="cartAdd"  method="post" >
				<input type="hidden" name="pid" value="${product.pid }"></input>
			<div class="action">
				<dl class="quantity">
					<dt>购买数量:</dt>
					<dd>
						<input id="count" name="count" value="1" maxlength="4"
							onpaste="return false;" type="text"/>
							<div>
							<!-- 设置数量的增加或减少 -->
								<span id="increase" class="increase" onclick="increase()">&nbsp;</span> 
								<span id="decrease" class="decrease" onclick="decrease()">&nbsp;</span>
							</div>
					</dd>
					<dd>件</dd>
				</dl>
				<div class="buy">
					<input id="addCart" class="addCart" value="加入购物车"  ${loginUser==null?'onclick="alertMsg()"':'' } type="submit" title="点击加入购物车"/>
				</div>
			</div>
			</form>
			<div id="bar" class="bar">
				<ul>
					<li id="introductionTab"><a href="#introduction">商品介绍</a></li>
				</ul>
			</div>

			<div id="introduction" name="introduction" class="introduction">
				<div class="title">
					<strong>${product.pdesc }</strong>
				</div>
				<div>
					<img
						src="${product.image }"/>
				</div>
			</div>



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
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script>
		function increase(){
			var count = document.getElementById('count');
			if(isNaN(count.value)) count.value=1;
			else count.value=parseInt(count.value)+1;
			
		}
		function decrease(){
			var count = document.getElementById('count');
			if(count.value.match(/^\d+/) && count.value>1)
				count.value=parseInt(count.value)-1;
			else count.value=1;
		}
		function alertMsg(){
			alert("请先登录！！！");
			window.location.href="login.jsp";
			document.getElementById('addCart').disabled='disabled';
		}
	</script>
</body>
</html>