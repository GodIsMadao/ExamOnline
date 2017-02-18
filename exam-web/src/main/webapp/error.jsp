<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/26
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>404页面</title>
  <link rel="stylesheet" type="text/css"
        href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
</head>
<body>
<div class="container-fluid">
<div class="col-md-6 col-md-offset-1" style="margin-top: 100px;">
  <img src="<%=request.getContextPath()%>/resources/image/error.jpg" alt="error"><br>
</div>
<div class="col-md-5" style="margin-top: 150px;">
  <label style="font-style: italic;font-size: large;color:rgba(10, 31, 255, 0.57)">你所要的东西啊并不存在！！</label>
</div>
</div>
</body>
</html>
