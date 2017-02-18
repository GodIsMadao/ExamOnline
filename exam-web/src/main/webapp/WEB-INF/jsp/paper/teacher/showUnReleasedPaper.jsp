<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <%--显示(给老师)待发布的试卷列表--%>
</head>
<body>
<div class="container-fluid">
    <div class="panel" style="margin-top: 15px">
        <header class="panel-heading bg-success">
            <ul class="nav nav-tabs">
                <li class="active">
                    <a href="#profile" data-toggle="tab">
                        <h6>已审核</h6>
                    </a>
                </li>
                <li class="">
                    <a href="#password" data-toggle="tab">
                        <h6>未审核</h6>
                    </a>
                </li>
            </ul>
        </header>
        <div class="panel-body">
            <div class="tab-content">
                <div id="profile" class="tab-pane active">
                    <table class="col-md-12">
                        <thead>
                        <tr class="text-primary" style="font-size: 20px;border: 1px solid rgba(255, 52, 25, 0.38);">
                            <td>编号</td>
                            <td>试卷名称</td>
                            <td>试卷简介</td>
                            <td>试卷题数</td>
                            <td>所需时间</td>
                            <td>状态</td>
                            <td>用户操作</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${checked_papers.datas}" var="checked" varStatus="vs">
                            <c:set var="count" value="${vs.count}"/>
                            <tr style="border: 1px solid rgba(255, 52, 25, 0.38);">
                                <td>${count}</td>
                                <td><a href="<%=request.getContextPath()%>/paper/${checked.id}">${checked.pname}</a>
                                </td>
                                <td>${checked.tag}</td>
                                <td>${checked.maxQuestion}</td>
                                <td>${checked.time}</td>
                                <td class="text-primary">已审核待发布</td>
                                <td><a href="javascript:void(0)" onclick="$(this).parent().parent().fadeTo(900,0.2,function(){$('#content').load('<%=request.getContextPath()%>/paper/releasePaper/${checked.id}')}).hide(900)" class="btn btn-default">发布试卷</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="6" style="text-align:right;margin-right:10px;">
                                <jsp:include page="/resources/jsp/pager.jsp">
                                    <jsp:param value="${checked_papers.total }" name="totalRecord"/>
                                    <jsp:param value="showUnReleasedPaper" name="url"/>
                                </jsp:include>
                            </td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
                <div id="password" class="tab-pane">
                    <table class="col-md-12 text-center">
                        <thead>
                        <tr style="font-size: 20px;border: 1px solid rgba(255, 52, 25, 0.38);" class="text-primary">
                            <td>编号</td>
                            <td>试卷名称</td>
                            <td>试卷简介</td>
                            <td>试卷题数</td>
                            <td>所需时间</td>
                            <td>状态</td>
                            <td>用户操作</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${unchecked_papers.datas}" var="unchecked" varStatus="vs">
                            <c:set var="count" value="${vs.count}"/>
                            <tr style="border: 1px solid rgba(255, 52, 25, 0.38);">
                                <td>${count}</td>
                                <td><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/paper/${unchecked.id}')">${unchecked.pname}</a>
                                </td>
                                <td>${unchecked.tag}</td>
                                <td>${unchecked.maxQuestion}</td>
                                <td>${unchecked.time}</td>
                                <td  class="text-danger">未审核待发布</td>
                                <td>
                                    <a class="btn btn-primary rounded"  href="<%=request.getContextPath()%>/paper/${unchecked.id}">查看试卷信息</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="6" style="text-align:right;margin-right:10px;">
                                <jsp:include page="/resources/jsp/pager.jsp">
                                    <jsp:param value="${unchecked_papers.total }" name="totalRecord"/>
                                    <jsp:param value="showUnReleasedPaper" name="url"/>
                                </jsp:include>
                            </td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
            </div>
        </div>
    </div>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
</body>
</html>
