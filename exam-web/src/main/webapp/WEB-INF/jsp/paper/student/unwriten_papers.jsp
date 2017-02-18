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
    <tr class="text-primary " style="font-size: 20px;border: 1px solid rgba(255, 12, 184, 0.49)">
      <td>编号</td>
      <td>试卷名称</td>
      <td>试卷简介</td>
      <td>出卷人</td>
      <td>出卷时间</td>
      <td>试卷题数</td>
      <td>所需时间</td>
      <%--<td>试卷状态</td>
      如果没有被审核通过或者未发布，不会显示在学生的界面里
      --%>
      <td>用户操作</td>
    </tr>
    </thead>
    <tbody>
      <c:forEach items="${studentpapersun.datas}" var="papers" varStatus="vs">
        <c:set var="count" value="${vs.count}"/>
        <tr style="border: 1px solid rgba(255, 12, 184, 0.49)">
          <td>${count}</td>
          <td>${papers.pname}</td>
          <td>${papers.tag}</td>
          <td><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/teacher/${papers.teacher.id}')">${papers.teacher.realname}</a></td>
          <td>${papers.create_date.year+1900}年${papers.create_date.month}月${papers.create_date.day}日</td>
          <td>${papers.maxQuestion}</td>
          <td>${papers.time}min</td>
          <td><a href="<%=request.getContextPath()%>/paper/exam/${papers.id}" class="btn btn-primary btn-rounded">进入考试</a></td>
        </tr>
      </c:forEach>
    </tbody>
    <tfoot>
      <tr>
        <td colspan="6" style="text-align:right;margin-right:10px;">
          <jsp:include page="/resources/jsp/pager.jsp">
            <jsp:param value="${studentpapersun.total }" name="totalRecord"/>
            <jsp:param value="papers" name="url"/>
          </jsp:include>
        </td>
      </tr>
    </tfoot>
  </table>
</div>
</body>
</html>
