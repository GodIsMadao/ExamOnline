<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/4
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid" style="margin-top:15px">
  <table  class="panel col-md-12 text-center">
    <thead>
    <tr class="text-primary" style="font-size: 20px;border: 1px solid rgba(65, 61, 255, 0.49);">
      <td>试题id</td>
      <td>所属试卷</td>
      <td>编题老师</td>
      <%--<td>所得分数</td>--%>
      <%--<td>试卷状态</td>
      如果没有被审核通过或者未发布，不会显示在学生的界面里
      --%>
      <td>用户操作</td>
    </tr>
    </thead>
    <tbody id="table_body">
    <c:forEach items="${stuQueRight.datas}" var="questions" varStatus="vs">
      <c:set value="${vs.count}" var="count"></c:set>
      <tr style="border: 1px solid rgba(65, 61, 255, 0.49);">
        <td><a href="${questions.id}">${count}</a></td>
        <td><a href="<%=request.getContextPath()%>/paper/${questions.exampaper.id}">${questions.exampaper.pname}</a></td>
        <td><a href="<%=request.getContextPath()%>/teacher/${questions.exampaper.teacher.id}">${questions.exampaper.teacher.realname}</a></td>
        <td><a href="<%=request.getContextPath()%>/question/${questions.id}" class="btn btn-info">查看试题情况</a></td>
      </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${stuQueRight.total }" name="totalRecord"/>
          <jsp:param value="questions/right" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
