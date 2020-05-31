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
    <h3>1.RequestParam</h3>
    <a href="anno/testRequestParam?uname=heheh">入门</a>
    <BR>

    <h3>2.RequestBody</h3>
    <form action="anno/testRequestBody" method="post">
        用户姓名:<input type="text" name="uname">
        用户年龄:<input type="text" name="age">
        <input type="submit" vlaue="submit">
    </form>
    <BR>

    <h3>4.testRequestHeader</h3>
    <a href="anno/testRequestHeader">testRequestHeader</a>
    <BR>

    <h3>5.testCookieValue</h3>
    <a href="anno/testCookieValue">testCookieValue</a>
    <BR>

    <h3>6.1 setAttribute</h3>
    <a href="anno/setAttribute">setAttribute</a>
    <BR>

    <h3>6.2 getAttribute</h3>
    <a href="anno/getAttribute">getAttribute</a>
    <BR>

    <h3>6.3 delAttribute</h3>
    <a href="anno/delAttribute">delAttribute</a>
    <BR>

</body>
</html>
