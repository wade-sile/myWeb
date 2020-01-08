<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="span10 last">
	<div class="topNav clearfix">
		<ul>
					<c:if test="${loginUser==null }">
						<li id="headerLogin" class="headerLogin" style="display: list-item;">
							<a href="login.jsp">登录</a>|
						</li>
					</c:if>
					<c:if test="${loginUser!=null }">
						<li id="headerLogin" class="headerLogin" style="display: list-item;">
							您好：${loginUser.getUsername() }!欢迎进入
						</li>
					</c:if>
					<li id="headerRegister" class="headerRegister" style="display: list-item;">
						<a href="regist.jsp">注册</a>|</li>
						<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="" style="color: red;">留言板</a>
				   |</li>
					<li id="headerLogin" class="headerLogin" style="display: list-item;">
					</li>
					<c:if test="${loginUser!=null }">
						<li id="headerLogin" class="headerLogin" style="display: list-item;">
						<a href="order" style="color: red;">我的订单</a>
				   |</li>
					</c:if>
				   <li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a href="" style="color: red;">留言板</a>
				   |</li>
				   <c:if test="${loginUser!=null }">
				    <div class="cart">
						<a href="cartAdd">购物车</a>
					</div>
					</c:if>
					<li id="headerLogout" class="headerLogout" style="display: list-item;">
					<a href="loginOut" onclick="return confirm('确定要退出登录吗？')">退出</a>|</li>
			<li><a href="">后台登录</a></li>
		</ul>
	</div>
	
	<div class="phone">
		<form method="post" action="selByProductName" >
                <input id="condition" name="condition" type="text" value="请输入关键词" onfocus="this.value = '';"
                onblur="if (this.value == '') {this.value = '请输入关键词';}">
                <input id="searchSub" type="submit" value="搜">
        </form>
	</div>
</div>
<div class="span24">
	<ul class="mainNav">
		<li><a href="initIndex">首页</a> |</li>
		<c:forEach items="${categoryList }" var="cg">
			<li><a href="cProduct?id=${cg.cid }">${cg.cname }</a> |</li>
		</c:forEach>
	</ul>
</div>
