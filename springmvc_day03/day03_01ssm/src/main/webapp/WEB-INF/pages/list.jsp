<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/20
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    查询所有成功！<br>
    <c:forEach items="${list}" var="account">
        ${account.name},${account.money}<br>
    </c:forEach>
</body>
</html>
