<%--
  Created by IntelliJ IDEA.
  User: yhw
  Date: 2019/9/3
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<table>
    <tr><td>
        <shiro:hasRole name="teacher">
            用户[<shiro:principal/>]拥有角色teacher<br/>
        </shiro:hasRole>
    </td></tr>
    <tr><td>
        <shiro:hasAnyRoles name="boss">
            用户[<shiro:principal/>]拥有角色boss<br/>
        </shiro:hasAnyRoles>
    </td></tr>
    <tr><td>
        <shiro:hasPermission name="role:list">
            用户[<shiro:principal/>]拥有权限role:list<br/>
        </shiro:hasPermission>
    </td></tr>
    <tr><td>
        <shiro:hasPermission name="permission:add">
            用户[<shiro:principal/>]拥有权限user:create<br/>
        </shiro:hasPermission>
    </td></tr>
    <td><tr>
        <a href="/addperm">添加权限</a>
    </tr></td>
    <a href="${pageContext.request.contextPath}/logout">点击退出</a>
</table>
</body>
</html>
