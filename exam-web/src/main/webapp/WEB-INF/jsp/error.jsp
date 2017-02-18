<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发生错误</title>
  <link rel="stylesheet" type="text/css"
        href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
</head>
<body>
<div id="container" class="container-fluid">
  <div id = "error">
    <h2 class="col-md-12" style="font-style: italic">出现错误!!!</h2>
    <img src="<%=request.getContextPath()%>/resources/image/error1.jpg" class="col-md-4">
    <div id="message" style="font-size: 20px;color: rgba(255, 6, 25, 0.57)"><span class="errorContainer">${exception.message }</span></div>
    <div id="upPage"><a href="javascript:history.go(-1)" class="btn btn-default">返回上一页</a></div>
  </div>
</div>
</body>
</html>
