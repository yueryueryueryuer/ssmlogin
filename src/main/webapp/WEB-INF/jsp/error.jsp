
<%--登录失败界面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>
登入失败!请重新登录
${message}
<br>
<a href="<%=basePath%>/user/login">返回</a>
</body>
</html>