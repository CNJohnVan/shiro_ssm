<%--
  Created by IntelliJ IDEA.
  User: Lan
  Date: 2019/8/31
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
	<form action="/account/insert" method="post">
		名字<input type="text" name="name"/>
		余额<input type="text" name="money"/>
		<button type="submit">添加</button>
	</form>
</body>
</html>
