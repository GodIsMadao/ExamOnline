<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>学生登陆页面</title>
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
<div class="container clearfix">
  <div class="wrapper">
    <div class="col-lg-9">
      <section class="panel">
        <header class="panel-heading bg-success">
          <ul class="nav nav-tabs">
            <li>
              <a href="#profile">
                <h6>个人信息</h6>
              </a>
            </li>
          </ul>
        </header>
        <div class="panel-body">
          <div class="tab-content">
            <div id="profile" class="tab-pane active">
              <form style="width:300px" action="<%=request.getContextPath()%>/admin/update/${loginAdmin.id}" id="updateadmin" method="post">
                <div class="form-group">
                  <label class="control-label" for="username">用户名</label>
                  <input id="username" class="form-control" type="text" autocomplete="off" value="${loginAdmin.username}" name="username">
                </div>
                <div class="form-group">
                  <label class="control-label">当前密码</label>
                  <input id="id_password1"  class="form-control" placeholder="当前密码" value="${loginAdmin.password}" readonly="readonly" name="current_password">
                </div>
                <div class="form-group">
                  <label class="control-label">新密码</label>
                  <input id="password" class="form-control" type="password" placeholder="新密码" name="password">
                </div>
                <div class="form-group">
                  <label class="control-label">新密码确认</label>
                  <input id="confirmPwd" class="form-control" type="password" placeholder="新密码确认" name="confirmPwd">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_email">邮箱</label>
                  <input id="id_email" class="form-control" type="email" value="lalalalal@qq.com" readonly="readonly"
                         name="email">
                </div>
                <button class="btn btn-block btn-success">
                  保存个人信息
                </button>
              </form>
            </div>
          </div>
        </div>
      </section>
    </div>
  </div>
</div>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<%--jQuery验证插件--%>
<script src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.cms.validate.js"></script>
<script type="text/javascript">
  $(function(){
    $("#updateadmin").examvalidate();
  })
</script>
</body>
</html>
