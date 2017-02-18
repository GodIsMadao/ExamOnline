<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div>
    <jsp:include page="/resources/jsp/top.jsp"></jsp:include>
</div>
<div class="container">
    <div>
        <a href="<%=request.getContextPath()%>/teacher/register" class="">教师注册入口</a>
    </div>
    <div>
        <a href="<%=request.getContextPath()%>/student/register" class="">学生注册入口</a>
    </div>
</div>
</body>
</html>
