<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/17
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h3>1、testRequestParam</h3>
        <form action="anno/testRequestParam" method="post" >
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交"><br>
        </form>
        <h3>2、testRequestBody</h3>
        <h4>2.1 post请求</h4>
        <form action="anno/testRequestBody" method="post" >
            姓名：<input type="text" name="name"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交"><br>
        </form>
        <h4>2.2 get请求</h4>
        <a href="anno/testRequestBody?body=test">testRequestBody</a><br>
        <h3>3、testPathVariable</h3>
        <a href="anno/testPathVariable/200">testPathVaribale</a><br>
        <h3>4、testRequestHeader</h3>
        <a href="anno/testRequestHeader">testRequestHeader</a><br>
        <h3>5、testCookieValue</h3>
        <a href="anno/testCookieValue">testCookieValue</a><br>


        <h3>6、testModelAttribute</h3>
        <form action="anno/testModelAttribute" method="post" >
            姓名：<input type="text" name="uname"><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交"><br>
        </form>

        <h3>7、testSessionAttribute</h3>
        <a href="springmvc/testPut">testPut</a><br>
        <a href="springmvc/testGet">testPut</a><br>
        <a href="springmvc/testClean">testPut</a><br>
    </body>
</html>
