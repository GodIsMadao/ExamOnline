<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
  <%--显示(给老师)已发布的试卷列表--%>
</head>
<body>
<div class="container-fluid">
  <div style="margin-top: 15px">
  <table class="panel col-md-12 text-center" >
    <thead class="text-primary" style="font-size: 20px;border: 1px solid rgba(41, 10, 255, 0.38)">
    <tr>
      <td>试卷名称</td>
      <td>试卷简介</td>
      <td>试卷题数</td>
      <td>所需时间</td>
      <td>试卷状态</td>
      <td>用户操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${unpass_papers.datas}" var="papers">
      <tr style="border: 1px solid rgba(41, 10, 255, 0.38)">
      <td><a href="<%=request.getContextPath()%>/paper/${papers.id}">${papers.pname}</a></td>
      <td>${papers.tag}</td>
      <td>${papers.maxQuestion}</td>
      <td>${papers.time}</td>
      <td class="text-danger">审核未通过</td>
      <%--<td>--%>
      <%--<c:if test="${papers.check_status eq }"--%>
      <%--</td>--%>
      <td class="btn btn-danger rounded"><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/paper/updatepaper/${papers.id}')" class="text-white ">更新试卷</a></td>
      </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${unpass_papers.total }" name="totalRecord"/>
          <jsp:param value="showUnpassPaper" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
    </div>
</div>
</body>
</html>
