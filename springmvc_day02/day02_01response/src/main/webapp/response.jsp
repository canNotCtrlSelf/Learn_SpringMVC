<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/17
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
               $.ajax( {
                   "type":"POST",
                   "url":"user/testJson",
                   "data":{
                       "username":"Jack",
                       "age":20
                   },
                   "dataType":"json",
                   "success":function (data) {
                        console.log(data.username,data.age);
                   }

               });
            });
        });
    </script>
</head>
<body>
    <h3>1、返回值是字符串</h3><br>
    <a href="user/testString">testString</a><br>
    <h3>2、返回值是void</h3><br>
    <a href="user/testVoid">请求转发</a><br>
    <h3>3、返回值是void</h3><br>
    <a href="user/testVoid2">重定向</a><br>
    <h3>4、返回值是void</h3><br>
    <a href="user/testModelAndView">testModelAndView</a><br>
    <h3>5、返回值是json字符串</h3><br>
    <%--<form>
        <input id="btn" type="submit" value="提交"> <br>
        姓名：<input type="text" name="username"><br>
        年龄：<input type="text" name="age"><br>
    </form>--%>
    <button id="btn">发送ajax请求</button>
</body>
</html>
