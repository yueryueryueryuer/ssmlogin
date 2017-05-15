<%--
  Created by IntelliJ IDEA.
  User: XF
  Date: 2017/5/14 0014
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%--注册界面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form name="form3" action="/user/checksign" method="post" >
    <table width="300" border="1" align="center">
        <tr>
            <td colspan="2">注册窗口</td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input  type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit3" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
