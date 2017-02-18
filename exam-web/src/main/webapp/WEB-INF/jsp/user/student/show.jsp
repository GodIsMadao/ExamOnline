<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="zjut.sy.model.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid panel" style="margin-top: 15px">
    <div>
        <div style="position: relative;">
            <c:if test="${loginStudent ne null}">
            <a href="javascript:void(0)" onmouseover="$('#setting').css('display','block')" onmouseout="$('#setting').css('display','none')" onclick="$('#content').load('<%=request.getContextPath()%>/student/updateself/${student.id}')">
                <%--null的话不会报错，而路径不存在的话回报错--%>
                <div>
                    <c:choose>
                        <c:when test="${loginStudent.picpath ne 'upload/'}">
                            <img src="<%=request.getContextPath()%>/${student.picpath}" class="img-circle" height="90" width="90"
                                 alt="${student.realname}">
                        </c:when>
                        <c:when test="${loginStudent.picpath eq 'upload/'}">
                            <img src="<%=request.getContextPath()%>/resources/image/defaut.jpg" class="img-circle" height="90" width="90"
                                 alt="${student.realname}">
                        </c:when>
                    </c:choose>
                </div>
                <div id="setting" style="position: absolute;z-indent:2;left:0;top:0;padding:30px 15px;text-shadow:#fff 1px 0 0,#fff 0 1px 0,#fff -1px 0 0,#fff 0 -1px 0;font-weight: bolder;display: none;font-size: 16px;">编辑资料</div>
            </a>
            </c:if>
        </div>
        <div>
            <label  class="text-primary " style="font-size: large">用户名:</label>
            <label>${student.username}</label>
        </div>

        <%
            Student s = (Student) session.getAttribute("loginStudent");
            if (s != null) {
        %>
        <div>
            <label class="text-primary " style="font-size: large">姓名:</label>
            <label>${student.realname}</label>
        </div>
        <div>
            <label class="text-primary " style="font-size: large">学校:</label>
            <label>${student.school}</label>
        </div>
        <div>
            <label class="text-primary " style="font-size: large">老师:</label>
            <label>${student.teacher.realname}</label>
        </div>
        <%
            }
        %>
        <div>
            <label class="text-primary " style="font-size: large">地址:</label>
            <label>${student.address}</label>
        </div>
        <div>
            <label class="text-primary " style="font-size: large">邮箱:</label>
            <label>${student.email}</label>
        </div>
        <div>
            <label class="text-primary " style="font-size: large">学号:</label>
            <label>${student.sno}</label>
        </div>
        </dl>
    </div>
</div>
</body>
</html>
