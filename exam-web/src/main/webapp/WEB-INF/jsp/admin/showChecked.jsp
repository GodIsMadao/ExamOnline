<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/12
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
</head>
<body>
<div class="container-fluid" style="margin-top: 15px">
  <table class="panel col-md-12 text-center">
    <thead>
    <tr style="font-size: 20px;border: 1px solid rgba(39, 33, 255, 0.57)">
      <td>编号</td>
      <td>试卷名</td>
      <td>介绍</td>
      <td>所需时间</td>
      <td>出卷人</td>
      <td>题量</td>
      <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${checked_papers.datas}" var="paper" varStatus="vs">
      <c:set var="count" value="${vs.count}"></c:set>
      <tr style="border: 1px solid rgba(39, 33, 255, 0.57)">
        <td>${count}</td>
        <td>${paper.pname}</td>
        <td>${paper.tag}</td>
        <td>${paper.time}</td>
        <td>${paper.teacher.realname}</td>
        <td>${paper.maxQuestion}</td>
        <td><button class="btn btn-facebook btn-rounded">待定操作</button></td>
      </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${checked_papers.total }" name="totalRecord"/>
          <jsp:param value="paper/showChecked" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
