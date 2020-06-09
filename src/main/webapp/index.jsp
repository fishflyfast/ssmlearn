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

    <p>传统方式文件上传</p>
    <form action="file/fileUpload1" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload"/>
        <input type="submit" value="上传">
    </form>

    <p>SpringMVC方式文件上传</p>
    <form action="file/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload"/>
        <input type="submit" value="上传">
    </form>

</body>
</html>
