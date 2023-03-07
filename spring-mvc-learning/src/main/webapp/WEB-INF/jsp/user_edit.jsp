<%--
  Created by IntelliJ IDEA.
  User: ChenQi
  Date: 2023/3/7
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editusers"method="post" id='formid'>
    <table>
        <tr>
        <td>选择</td>
        <td>用户名</td>
        </tr>
        <tr>
        <td>
            <input name="users[o].id" value="1" type="checkbox"/>
        </td>
        <td>
            <input name="users[o].username" value="tome" type="text"/></td>
        </tr>
        <tr>
            <td>
                <input name="users[1].id" value="2" type="checkbox"/>
            </td>
            ctd>
            <input name="users[1].username" value="jack" type="text"/></td>
        </tr>
    </table>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
