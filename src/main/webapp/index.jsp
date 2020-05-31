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
    <script src="js/jquery.min.js"></script>

    <script>
        //页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function () {
                alert("click btn");
            });
        });

    </script>
</head>
<body>
    <h3>1.testString</h3>
    <a href="testString">testString</a>
    <BR>

    <h3>2.testVoid</h3>
    <a href="testVoid">testVoid</a>
    <BR>

    <h3>3.testModelAndView</h3>
    <a href="testModelAndView">testModelAndView</a>
    <BR>

    <h3>4.testForwordRedirect</h3>
    <a href="testForwordRedirect">testForwordRedirect</a>
    <BR>

    <button id="btn">发送ajax请求</button>

</body>
</html>
