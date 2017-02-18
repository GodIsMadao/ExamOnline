<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更多试卷</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--<link rel="stylesheet" type="text/css" href="../css/main.css"/>-->
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div >
    <jsp:include page="/resources/jsp/top.jsp"></jsp:include>
</div>
<div class="container panel" style="margin-top:80px;">
    <table class="panel col-md-12">
        <thead>
        <tr class="text-primary" style="font-size: large;">
            <td>试卷名称</td>
            <td>出题人</td>
            <td>试卷简介</td>
            <td>试卷题数</td>
            <td>所需时间</td>
            <td>试卷状态</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${papers.datas}" var="papers">
            <tr style="border-top: 10px solid rgba(201, 203, 255, 0.15);border-bottom: 10px solid rgba(201, 203, 255, 0.15);">
                <td style="color: rgba(255, 0, 41, 0.9)">${papers.pname}</td>
                <td class="text-muted">${papers.teacher.username}</td>
                <td>${papers.tag}</td>
                <td>${papers.maxQuestion}</td>
                <td>${papers.time}</td>
                <td>
                    <c:if test="${papers.check_status eq 1}">
                        <span class="btn btn-info" style="width: 120px;">待审核</span>
                    </c:if>
                    <c:if test="${papers.check_status eq 2}">
                        <span class="btn btn-warning" style="width: 120px;">已审核待发布</span>
                    </c:if>
                    <c:if test="${papers.check_status eq 3}">
                        <span class="btn btn-success" style="width: 120px;">已发布</span>
                    </c:if>
                    <c:if test="${papers.check_status eq 4}">
                        <span class="btn btn-danger" style="width: 120px;">审核不通过</span>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
        </tbody>
        <tfoot>
        <tr>
            <td colspan="6" style="text-align:right;margin-right:10px;">
                <jsp:include page="/resources/jsp/pager1.jsp">
                    <jsp:param value="${papers.total }" name="totalRecord"/>
                    <jsp:param value="morepaper" name="url"/>
                </jsp:include>
            </td>
        </tr>
        </tfoot>
    </table>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</body>
</html>
