<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid" style="margin-top: 15px">
  <table class="panel">
    <thead>
    <tr>
      <td>试卷名称</td>
      <td>试卷简介</td>
      <td>试卷题数</td>
      <td>所需时间</td>
      <%--<td>试卷状态</td>
      如果没有被审核通过或者未发布，不会显示在学生的界面里
      --%>
      <td>用户操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentpapers.datas}" var="papers">
      <td><a href="<%=request.getContextPath()%>/paper/${papers.id}">${papers.pname}</a></td>
      <td>${papers.tag}</td>
      <td>${papers.maxQuestion}</td>
      <td>${papers.time}</td>
      <td><a href="<%=request.getContextPath()%>/paper/showteachpaper/${papers.id}">查看试卷情况</a></td>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${studentpapers.total }" name="totalRecord"/>
          <jsp:param value="papers" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
