<%--
  Created by IntelliJ IDEA.
  User: 13248
  Date: 2020/2/14
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入门</title>
</head>
<body>
<h1>
    <a href="hello">点击进入SpringMVC入门</a>
</h1>
<h1>
    <%--    多级访问路径测试--%>
    <a href="user/testRequestMapping">testRequestMapping</a>
    <%--    提交方式测试--%>
    <%--<a href="account/saveAccount?">params 提交方法测试</a>--%>
    <%--提交参数测试--%>
    <a href="account/saveAccount?username=lisi">params 提交方法测试</a>
</h1>
</body>
</html>
