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
    <p>1.请求参数封装为类对象 </p>
    <form action="params/save" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>

    <br>
    <p>2.请求参数封装为类对象,对象内部又有对象</p>
    <form action="params/saveAccountUser" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        用户姓名:<input type="text" name="user.uname"><br>
        用户年龄:<input type="text" name="user.age"><br>
        <input type="submit" value="提交">
    </form>

    <p>3.请求参数封装为类对象,对象中存在集合（List,Map）</p>
    <form action="params/saveAccountColl" method="post">
        姓名:<input type="text" name="username"><br>
        密码:<input type="text" name="password"><br>
        金额:<input type="text" name="money"><br>
        用户姓名:<input type="text" name="list[0].uname"><br>
        用户年龄:<input type="text" name="list[0].age"><br>

        用户姓名:<input type="text" name="map['one'].uname"><br>
        用户年龄:<input type="text" name="map['one'].age"><br>
        <input type="submit" value="提交">
    </form>

    <!-- 4.请求参数封装为类对象,使用自定义类型转换器 -->
    <p>4.请求参数封装为类对象,使用自定义类型转换器</p>
    <form action="params/saveUser" method="post">
        姓名:<input type="text" name="uname"><br>
        密码:<input type="text" name="age"><br>
        生日:<input type="text" name="birthday"><br>

        <input type="submit" value="提交">
    </form>

</body>
</html>
