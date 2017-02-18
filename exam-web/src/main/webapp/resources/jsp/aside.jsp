<%@ page import="zjut.sy.model.Teacher" %>
<%@ page import="zjut.sy.model.Student" %>
<%@ page import="zjut.sy.model.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div id="banner" style="width:300px;height: auto">
  <div class="panel" style="margin-top:15px ">
    <%
      Teacher t= (Teacher) session.getAttribute("loginTeacher");
      Student s=(Student)session.getAttribute("loginStudent");
      Admin a=(Admin)session.getAttribute("loginAdmin");
      pageContext.setAttribute("t1",t);
      pageContext.setAttribute("s1",s);
      pageContext.setAttribute("a1",a);
    %>
  <div class="panel-body">
  <ul class="columnMenu">
    <h3 class="column-title " style="cursor:pointer">
      <a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/welcome')">欢迎</a>
    </h3>
  </ul>
  <%
    if(s!=null){
  %>
  <ul class="columnMenu selected" >
    <h3 class="column-title" style="cursor:pointer" id="selected1">
      <span>试卷</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/papers/writen')">已做试卷</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/papers/unwriten')">待做试卷</a></li>
    <li class="column"><a  href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/listScoreFS/${s1.id}')">历次得分走向</a></li>
  </ul>
  <ul class="columnMenu">
    <h3 class="column-title" style="cursor:pointer">
      <span>问题</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/questions/writen')">已做问题</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/questions/right')">已做对问题</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/questions/wrong')">错题集</a></li>
  </ul>
  <ul class="columnMenu">
    <h3 class="column-title" style="cursor:pointer">
      <span>个人信息</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/updateself/${s1.id}')">更新个人信息</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/${s1.id}')">查看个人信息</a></li>
  </ul>
  <ul class="colmnMenu">
    <h3><a href="#">私信</a></h3>
  </ul>
  <%
    }else if(t!=null){
  %>
  <ul class="columnMenu selected" >
    <h3 class="column-title" id="selected2">
      <span>试卷</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/showReleasedPaper')">已发布试卷</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/showUnReleasedPaper')">待发布试卷</a><br></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/showUnpassPaper')">审核未通过试卷</a><br></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/add')">新增试卷</a></li>
  </ul>
  <ul class="columnMenu">
    <h3 class="column-title">
      <span>学生</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/students')">学生列表</a></li>
    <%--<li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/listStudentByScore')">平均分排名学生列表</a></li>--%>
  </ul>
  <ul class="columnMenu">
    <h3 class="column-title" style="cursor:pointer">
      <span>个人信息</span>
    </h3>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/update/${t1.id}')">更新个人信息</a></li>
    <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/${t1.id}')">查看个人信息</a></li>
  </ul>
  <ul class="colmnMenu">
    <h3><a href="#">私信</a></h3>
  </ul>
  <%
    }else if(a!=null){
  %>
    <ul class="columnMenu selected" >
      <h3 class="column-title" id="selected3">
        <span>用户管理</span>
      </h3>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/teacher/list')">教师列表</a></li>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/student/list')">学生列表</a><br></li>
    </ul>
    <ul class="columnMenu">
      <h3 class="column-title">
        <span>试卷管理</span>
      </h3>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/paper/showUncheck')">待审核试卷</a></li>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/paper/showChecked')">已审核试卷</a></li>
    </ul>
    <ul class="columnMenu">
      <h3 class="column-title" style="cursor:pointer">
        <span>管理员信息</span>
      </h3>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/${a1.id}')">查看个人信息</a></li>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/update/${a1.id}')">更新个人信息</a></li>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/showAdmins')">管理员列表</a></li>
      <li class="column"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/addAdmin')">添加管理员</a></li>
    </ul>
  <%
    }
  %>
  </div>
  </div>
</div>
</body>
</html>
