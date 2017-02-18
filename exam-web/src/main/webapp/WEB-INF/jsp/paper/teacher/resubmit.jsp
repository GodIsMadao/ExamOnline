<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/14
  Time: 7:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <%--重新提交试卷页面--%>
</head>
<body>
<div class="container-fluid clearfix">
  <div class="wrapper">
    <div class="col-md-12">
      <section class="panel">
        <header class="panel-heading bg-success">
          <ul class="nav nav-tabs">
            <li class="active">
              <a href="#profile" data-toggle="tab">
                <h6>试卷基本信息</h6>
              </a>
            </li>
          </ul>
        </header>
        <div class="panel-body">
          <div class="tab-content">
            <div id="profile" class="tab-pane active">
              <form style="width:300px" action="<%=request.getContextPath()%>/paper/updatepaper/${unpasspaper.id}" method="post" target="_self">
                <div class="form-group">
                  <label class="control-label" for="id_pname">试卷名</label>
                  <input id="id_pname" class="form-control" type="text"
                         placeholder="Enter exampaper's name" name="pname">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_tag">试卷简介</label>
                  <input id="id_tag" class="form-control" type="text" maxlength="16"
                         placeholder="Enter introduction of exampaper" name="tag">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_time">考试时间</label>
                  <input id="id_time" class="form-control" type="text" placeholder="minutes"
                         name="time">
                </div>
                <div class="form-group">
                  <label class="control-label" for="id_maxquestion">题量</label>
                  <input id="id_maxquestion" class="form-control" step="5" type="number" name="maxQuestion">
                </div>
                <input type="submit" class="btn btn-block btn-success" value="重新提交" />
              </form>
            </div>
            </form>
          </div>
        </div>
      </section>
    </div>
  </div>
</div>
</body>
</html>
