<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>添加管理员页面</title>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!--<link rel="stylesheet" type="text/css" href="../css/main.css"/>-->
  <link rel="stylesheet" type="text/css"
        href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<div class="container-fluid">
  <div class="panel" style="margin-top: 15px;">
  <form method="post" id="addadmin" action="<%=request.getContextPath()%>/admin/addAdmin">
    <%--客户端验证还没做--%>
    <fieldset>
      <legend>添加管理员</legend>
      <p>
        <label for="ausername">用户名</label><em>*</em>
        <input id="ausername" type="text" autocomplete="off" name="username" placeholder="Enter username" class="required" minlength="3"/>
      </p>
      <p>
        <label for="password">密码</label><em>*</em>
        <input id="password" type="password" name="password" placeholder="Enter password"/>
      </p>
      <p>
        <label for="repassword">确认密码</label><em>*</em>
        <input id="repassword" type="password" name="confirmPwd" placeholder="Confirm password"/>
      </p>
      <p>
        <label for="email">邮箱</label><em>&nbsp;</em>
        <input id="email" type="text" autocomplete="off" name="email"/>
      </p>
      <p>
        <input type="submit" class="btn btn-warning" value="立即注册"/>
      </p>
    </fieldset>
  </form>
  </div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<%--jQuery验证插件--%>
<script src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.cms.validate.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
  $(function(){
    $("#addadmin").examvalidate();
  })
</script>
</body>
</html>
