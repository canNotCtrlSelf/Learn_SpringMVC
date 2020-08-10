<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/2/25
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>上传文件</h2>
<form action="${pageContext.request.contextPath}/testFileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="filename"><br>
    <input type="submit" value="上传"><br>
</form>
</body>
</html>