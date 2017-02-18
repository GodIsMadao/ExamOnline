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
<div class="container-fluid" style="margin-top: 15px">
  <table class="col-md-12 panel text-center">
    <thead>
      <tr style="font-size: 20px;border: 1px solid rgba(77, 255, 39, 0.57)">
        <td>编号</td>
        <td>试卷名</td>
        <td>介绍</td>
        <td>所需时间</td>
        <td>出卷人</td>
        <td>题量</td>
        <td>操作</td>
      </tr>
    </thead>
    <tbody id="body">
      <c:forEach items="${uncheck_papers.datas}" var="paper" varStatus="vs">
        <c:set var="count" value="${vs.count}"></c:set>
        <tr id="${count}" style="border: 1px solid rgba(77, 255, 39, 0.57)">
          <td>${count}</td>
          <td>${paper.pname}</td>
          <td>${paper.tag}</td>
          <td>${paper.time}</td>
          <td>${paper.teacher.realname}</td>
          <td>${paper.maxQuestion}</td>
          <td><em><a href="javascript:void(0)"
                     onclick="$(this).parent().parent().parent().fadeTo(900,0.2,function(){$('#content').load('<%=request.getContextPath()%>/admin/updateCheckStatusPass/${paper.id}')}).hide(900)"
                     id="pass" class="btn btn-success">审核通过</a></em></td>
          <td>or</td>
          <td><span><a href="javascript:void(0)" onclick="$(this).parent().parent().fadeTo(900,0.2,function(){$('#content').load('<%=request.getContextPath()%>/admin/updateCheckStatusUnpass/${paper.id}')}).hide(900)" id="unpass" class="btn btn-default">审核不通过</a></span></td>
        </tr>
      </c:forEach>
    </tbody>
    <tfoot>
    <tr>
      <td colspan="6" style="text-align:right;margin-right:10px;">
        <jsp:include page="/resources/jsp/pager.jsp">
          <jsp:param value="${uncheck_papers.total }" name="totalRecord"/>
          <jsp:param value="paper/showUncheck" name="url"/>
        </jsp:include>
      </td>
    </tr>
    </tfoot>
  </table>
</div>
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<script type="text/javascript">
  $(function() {
    function click_func(){
    $('#body').find('em').each(function () {
      $(this).children("a").click(function () {
        $(this).parent().parent().parent().fadeIn(900,0.2);
        $(this).parent().parent().parent().hide(1000);
      });
    })
    $('#body').find('span').each(function () {
      $(this).children("a").click(function () {
        $(this).parent().parent().parent().fadeIn(900,0.2);
        $(this).parent().parent().parent().hide(1000);
      });
    })
    }
  })
</script>
</body>
</html>
