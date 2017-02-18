<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>学生登陆页面</title>
<body>
<div class="container clearfix">
  <div class="wrapper">
    <div class="col-lg-9">
      <section class="panel">
        <header class="panel-heading bg-success">
          <ul class="nav nav-tabs">
            <li class="active">
              <a href="#profile" data-toggle="tab">
                <h6>个人信息</h6>
              </a>
            </li>
          </ul>
        </header>
        <div class="panel-body">
          <div class="tab-content">
            <div id="profile" class="tab-pane active">
              <form style="width:300px" id="teacherSetting" action="<%=request.getContextPath()%>/teacher/update/${loginTeacher.id}" method="post" enctype="multipart/form-data">
                <div class="form-group">
                  <label class="control-label" for="id_username">用户名</label>
                  <input id="id_username" class="form-control" type="text" value="${loginTeacher.username}"
                         maxlength="16" name="username" readonly="readonly">
                </div>
                <div class="form-group">
                  <label class="control-label">新密码</label>
                  <input id="password" class="form-control" type="password" placeholder="新密码" name="password">
                </div>
                <div class="form-group">
                  <label class="control-label">新密码确认</label>
                  <input id="id_password3" class="form-control" type="password" placeholder="新密码确认" name="confirmPwd">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_realname">姓名</label>
                  <input id="id_realname" class="form-control" name="realname" value="${loginStudent.realname}" type="text">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_email">邮箱</label>
                  <input id="id_email" class="form-control" type="email"
                         name="email">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_school">学校</label>
                  <input id="id_school" class="form-control" name="school" type="text" value="">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_phone" >电话</label>
                  <input id="id_phone" class="form-control" type="text" name="phone">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_address" >地址</label>
                  <input id="id_address" class="form-control" type="text" name="address">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_head" >头像</label>
                  <input id="id_head" class="form-control" type="file" name="myfile">
                </div>
                <input type="submit" class="btn btn-block btn-success" value="保存个人信息">
                </input>
              </form>
            </div>
          </div>
        </div>
      </section>
    </div>
  </div>
</div>
<%--jQuery验证插件--%>
<script src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.cms.validate.js"></script>
<script type="text/javascript">
  $(function(){
    $("#teacherSetting").examvalidate();
  })
</script>
</body>
</html>
