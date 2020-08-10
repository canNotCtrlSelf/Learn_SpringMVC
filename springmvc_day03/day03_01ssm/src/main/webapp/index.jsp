<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/20
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">查询所有</a><br>
    <form action="account/saveAccount" method="post">
        姓名：<input type="text" name="name"> <br>
        存款：<input type="text" name="money"> <br>
        <input type="submit" value="查询"><br>
    </form>
</body>
</html>
