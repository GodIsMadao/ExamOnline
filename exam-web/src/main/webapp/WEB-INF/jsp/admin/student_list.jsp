<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/12
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%--学生列表--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid" style="margin-top:15px">
  <table class="col-md-12 panel text-center">
    <thead>
    <tr style="font-size: 20px;border: 1px solid rgba(98, 183, 255, 0.57)">
      <td>编号</td>
      <td>头像</td>
      <td>用户名</td>
      <td>真实姓名</td>
      <td>创建时间</td>
      <td>状态</td>
      <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students.datas}" var="student" varStatus="vs">
      <c:set var="count" value="${vs.count}"/>
      <tr style="border: 1px solid rgba(98, 183, 255, 0.57)">
        <td>${count}</td>
        <td><img src="<%=request.getContextPath()%>/${student.picpath}" alt="${student.realname}" class="img-circle" height="35" width="35"/></td>
        <td>${student.username}</td>
        <td>${student.realname}</td>
        <td>${student.create_date}</td>
        <%--停用/启用--%>
        <td>
         <c:if test="${student.status eq 0}">
           <span class="font-bold text-danger">停用</span>
         </c:if>
          <c:if test="${student.status eq 1}">
            <span class="font-bold text-success">启用</span>
          </c:if>
        </td>
        <td><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/admin/student/updateStatus/${student.id}')" class="btn btn-rounded btn-primary">更改状态</a></td>
      </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${students.total }" name="totalRecord"/>
          <jsp:param value="student/list" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
