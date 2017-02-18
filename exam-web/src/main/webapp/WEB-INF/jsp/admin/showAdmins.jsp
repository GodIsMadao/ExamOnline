<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/12
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
</head>
<body>
<div class="container-fluid">
  <table style="margin-top: 15px" class="panel col-md-12 text-center">
    <thead>
    <tr style="font-size: 20px;border: 1px solid rgba(255, 0, 119, 0.57)">
      <td>编号</td>
      <td>用户名</td>
      <td>邮箱</td>
      <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${admins.datas}" var="admin" varStatus="vs">
      <c:set var="count" value="${vs.count}"></c:set>
      <tr style="border: 1px solid rgba(255, 0, 119, 0.57)">
        <td>${count}</td>
        <td>${admin.username}</td>
        <td>${admin.email}</td>
        <td><button class="btn btn-success btn-default">待定操作</button></td>
      </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${admins.total }" name="totalRecord"/>
          <jsp:param value="showAdmins" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
