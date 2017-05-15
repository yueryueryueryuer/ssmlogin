<%--
  Created by IntelliJ IDEA.
  User: XF
  Date: 2017/5/14 0014
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%--注册失败界面--%>
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
注册失败！改用户名已经存在，请重新注册
<br>
已存在的用户名：${user.username}
<br>
<a href="<%=basePath%>/user/signlogin">重新注册</a>
</body>
</html>
