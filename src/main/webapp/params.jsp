<%--
  Created by IntelliJ IDEA.
  User: genew
  Date: 2020/5/11
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
</head>
<body>

    <a href="params/testParam?username=hehe&password=haha">请求参数测试</a>

    <br>
    <!-- 1.请求参数封装为类对象 -->
    <form action="params/save" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>

    <br>
    <!-- 2.请求参数封装为类对象,对象内部又有对象 -->
    <form action="params/save" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        用户姓名:<input type="text" name="user.uname"><br>
        用户年龄:<input type="text" name="user.age"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
