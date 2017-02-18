<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <%--教师查看学生列表--%>
</head>
<body>
    <div class="container-fluid">
        <div style="margin-top: 15px">
            <table class="panel col-md-12 text-center"  style="border: 1px solid rgba(255, 52, 25, 0.38)" >
                <thead>
                <tr style="font-size: 20px;border:1px solid rgba(107, 57, 255, 0.38)">
                    <td>编号</td>
                    <td>头像</td>
                    <%--<td>用户名</td>--%>
                    <td>真实姓名</td>
                    <td>用户操作</td>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${students.datas}" var="student" varStatus="vs">
                        <tr style="border: 1px solid rgba(107, 57, 255, 0.38)">
                        <td>${vs.count}</td>
                        <td><a href="javascript:void(0)" onclick="$('#content').load('<%=request.getContextPath()%>/student/${student.id}')"><img src="<%=request.getContextPath()%>/${student.picpath}" alt="${student.realname}" class="img-circle" height="35" width="35"></a></td>
                        <td>${student.realname}</td>
                        <td><a href="javascript:void(0)" class="btn btn-primary rounded" onclick="$('#content').load('<%=request.getContextPath()%>/student/listScoreFT/${student.id}')">查看历次考试成绩</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
                <tfoot>
                <tr>
                    <td colspan="6" style="text-align:right;margin-right:10px;">
                        <jsp:include page="/resources/jsp/pager.jsp">
                            <jsp:param value="${students.total }" name="totalRecord"/>
                            <jsp:param value="students" name="url"/>
                        </jsp:include>
                    </td>
                </tr>
                </tfoot>
            </table>
        </div>
    </div>
</body>
</html>
