<%--
  Created by IntelliJ IDEA.
  User: zhaokemin
  Date: 2020-04-28
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序</h3>
    <!-- 类上加注解 注意这里user前面不能写/,否则会认为这是根路径-->
    <a href="user/requestMapping">类上加注解</a>
    <br>
    <a href="user/params?username=zhkm">params测试</a>
</body>
</html>
