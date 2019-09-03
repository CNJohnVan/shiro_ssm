<%--
  Created by IntelliJ IDEA.
  User: Lan
  Date: 2019/8/30
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
	<h2>查询所有账户信息</h2>
	<center>
		<table>
			<thead>
			<tr>ID</tr>
			<tr>名字</tr>
			<tr>余额</tr>
			</thead>
			<tbody>
			<c:forEach var="a" items="${account }">
				<tr>
					<td>${a.id }</td>
					<td>${a.name }</td>
					<td>${a.money }</td>
					<td><a href="/account/delete?id=${a.id}">删除</a>
						<%--<td>${users.loginTime}</td>
						<td>${users.registerTime}</td>--%>
					<%--<td><a href="">修改</a></td>
					</td>--%>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>
