<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/12
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid">
    <div class="container-fluid panel" style="margin-top: 15px">
        <div>
            <div>
                <label class="text-primary " style="font-size: large">用户名:</label>
                <label>${admin.username}</label>
            </div>
            <div>
                <label class="text-primary " style="font-size: large">密码:</label>
                <label>${admin.password}</label>
            </div>
            <div>
                <label class="text-primary " style="font-size: large">邮箱:</label>
                <label>${admin.email}</label>
            </div>
        </div>
    </div>
</div>
</body>
</html>
