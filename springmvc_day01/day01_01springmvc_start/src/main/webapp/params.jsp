<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/16
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<h1>1、基本数据类型</h1>
<a href="params/basicParam?username=zhangsan">基本类型</a><br>
<h1>2、引用数据类型</h1>
<form action="params/accountParam" method="post">
    账户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    存款：<input type="text" name="money"><br>
    <input type="submit" value="提交">
</form>
<h1>3、Account类中存在一个引用变量</h1>
<form action="params/accountParam2" method="post">
    账户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    存款：<input type="text" name="money"><br>
    用户名：<input type="text" name="user.uname"><br>
    年龄：<input type="text" name="user.age"><br>
    <input type="submit" value="提交">
</form>
<h1>4、Account类存在list和map集合</h1>
<form action="params/accountParam3" method="post">
    账户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    存款：<input type="text" name="money"><br>
    用户名：<input type="text" name="list[0].uname"><br>
    年龄：<input type="text" name="list[0].age"><br>
    用户名：<input type="text" name="map['one'].uname"><br>
    年龄：<input type="text" name="map['one'].age"><br>
    <input type="submit" value="提交">
</form>
<h1>5、自定义类型转换器</h1>
<form action="params/customConventer" method="post">
    用户名：<input type="text" name="uname"><br>
    年龄：<input type="text" name="age"><br>
    生日：<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>

<h1>6、ServletAPI 对象作为方法参数</h1>
<a href="params/servletAPI">servletAPI</a>
<%--3、集合类型--%>

</body>
</html>
