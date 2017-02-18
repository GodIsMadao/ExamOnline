<%@ page import="zjut.sy.model.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>教师可以给学生看的信息</title>
</head>
<body>
<div class="container-fluid panel" id="show" style="margin-top: 15px">
    <div>
        <div id="pic" style="position: relative;">
            <c:if test="${loginTeacher ne null}">
            <a href="javascript:void(0)" onmouseover="$('#setting').css('display','block')"
               onmouseout="$('#setting').css('display','none')"
               onclick="$('#content').load('<%=request.getContextPath()%>/teacher/update/${teacher.id}')">
                <div>
                    <c:choose>
                        <c:when test="${teacher.pic_path eq 'upload/'}">
                            <img src="<%=request.getContextPath()%>/resources/image/defaut.jpg" class="img-circle"
                                 height="90"
                                 width="90" alt="${teacher.realname}">
                        </c:when>
                        <c:when test="${teacher.pic_path ne 'upload/'}">
                            <img src="<%=request.getContextPath()%>/${teacher.pic_path}" class="img-circle" height="90"
                                 width="90" alt="${teacher.realname}">
                        </c:when>
                    </c:choose>
                </div>
                <div id="setting"
                     style="position: absolute;z-indent:2;left:0;top:0;padding:30px 15px;text-shadow:#fff 1px 0 0,#fff 0 1px 0,#fff -1px 0 0,#fff 0 -1px 0;font-weight: bolder;display: none;font-size: 16px;">
                    编辑资料
                </div>
            </a>
            </c:if>
        </div>
    </div>
    <%
        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        if (teacher != null) {
    %>
    <div>
        <label class="text-primary" style="font-size: large">用户名:</label>
        <label>${teacher.username}</label>
    </div>
    <div>
        <label class="text-primary" style="font-size: large">地址:</label>
        <label>${teacher.address}</label>
    </div>
    <%
        }
    %>

    <div>
        <label class="text-primary" style="font-size: large">姓名</label>
        <label>${teacher.realname}</label>
    </div>
    <div>
        <label class="text-primary" style="font-size: large">学校:</label>
        <label>${teacher.school}</label>
    </div>
    <div>
        <label class="text-primary " style="font-size: large">邮箱:</label>
        <label>${teacher.email}</label>
    </div>
    <div>
        <label class="text-primary " style="font-size: large">联系方式:</label>
        <label>${teacher.phone}</label>
    </div>
</div>
</body>
</html>
