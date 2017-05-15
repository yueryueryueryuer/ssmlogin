<%--
  Created by IntelliJ IDEA.
  User: XF
  Date: 2017/5/14 0014
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%--注册成功界面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
您已成功注册！
<br>
您的用户名：${user.username}
<br>
您的密码：${user.password}
<br>
<a href="<%=basePath%>/user/login">请您登录</a>
</body>
</html>
