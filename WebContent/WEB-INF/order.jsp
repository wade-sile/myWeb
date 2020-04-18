<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

<title>订单页面</title>
<link href="css/common.css" rel="stylesheet" type="text/css"/>
<link href="css/cart.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="container header">
	<div class="span5">
		<div class="logo">
			<a>
				<img src="image/r___________renleipic_01/logo.gif" alt=""/>
			</a>
		</div>
	</div>
	<div class="span9">
<div class="headerAd">
	<img src="image/header.jpg" width="320" height="50" alt="正品保障" title="正品保障"/>
</div>	
</div>
	<%@ include file="menu.jsp"%>
	<!-- 菜单栏 -->
</div>	

<div class="container cart">
		<div class="span24">
			<div class="step step1">
				<ul>
					<li class="current"></li>
					<c:choose>
						<c:when test="${not empty orderList }">
							<li>生成订单成功</li>
						</c:when>
						<c:otherwise>
							<span style="color: red;font-size: xx-large;">亲！您还没有订单呢！请先去购物！</span>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
				<table>
					<tbody>
						<th colspan="5">订单编号:&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<tr>
						<th>图片</th>
						<th>商品</th>
						<th>价格</th>
						<th>数量</th>
						<th>小计</th>
					</tr>
					<c:forEach items="${orderList }" var="order">
						<tr>
							<td width="60">
								<input type="hidden" name="oid" value="${order.oid }"/>
								<img src="${order.image}"/>
							</td>
							<td>
								<a target="_blank">${order.pname}</a>
							</td>
							<td>
								${order.price}
							</td>
							<td class="quantity" width="60">
								${order.pcount}
							</td>
							<td width="140">
								<span class="subtotal">${order.ptotal}</span>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
				<dl id="giftItems" class="hidden" style="display: none;">
				</dl>
				<div class="total">
					<em id="promotion"></em>
					商品金额: <strong id="effectivePrice">${totalMoney }</strong>
				</div>
			<form id="orderForm" action="clickOrder" method="post">
				<div class="span24">
						<p>
							收货地址：<input name="receiveInfo" type="text" value="" style="width:350px" />
								<br />
							收货人&nbsp;&nbsp;&nbsp;：<input name="accepter" type="text" value="" style="width:150px" />
								<br /> 
							联系方式：<input name="phoNum" type="text" value="" style="width:150px" />
						</p>
						<hr />
						<p>
							选择银行：<br/>
							<input type="radio" name="pd_FrpId" value="ICBC-NET-B2C" checked="checked"/>工商银行
							<img src="bank_img/icbc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="pd_FrpId" value="BOC-NET-B2C"/>中国银行
							<img src="bank_img/bc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="pd_FrpId" value="ABC-NET-B2C"/>农业银行
							<img src="bank_img/abc.bmp" align="middle"/>
							<br/>
							<input type="radio" name="pd_FrpId" value="BOCO-NET-B2C"/>交通银行
							<img src="bank_img/bcc.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="pd_FrpId" value="PINGANBANK-NET"/>平安银行
							<img src="bank_img/pingan.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="pd_FrpId" value="CCB-NET-B2C"/>建设银行
							<img src="bank_img/ccb.bmp" align="middle"/>
							<br/>
							<input type="radio" name="pd_FrpId" value="CEB-NET-B2C"/>光大银行
							<img src="bank_img/guangda.bmp" align="middle"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="pd_FrpId" value="CMBCHINA-NET-B2C"/>招商银行
							<img src="bank_img/cmb.bmp" align="middle"/>					
						</p>
						<hr />
						<p style="text-align:right">
							<!-- 在超链接中添加javascript:document.getElementById('orderForm').submit();代码 功能就相当于提交表单 -->
							<a ${not empty orderList?'href="javascript:document.getElementById(\'orderForm\').submit();"':" " }>
								<img src="images/finalbutton.gif" width="204" height="51" border="0" />
							</a>
						</p>
				</div>
			</form>
		</div>
		
	</div>
<div class="container footer">
	<div class="span24">
		<div class="footerAd">
					<img src="image\r___________renleipic_01/footer.jpg" alt="我们的优势" title="我们的优势" height="52" width="950"/>
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