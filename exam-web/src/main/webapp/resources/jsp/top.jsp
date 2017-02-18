<%@ page import="zjut.sy.model.Student" %>
<%@ page import="zjut.sy.model.Teacher" %>
<%@ page import="zjut.sy.model.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<nav class="navbar-default">
    <div data-spy="scroll" data-target="#header" class="landing" id="home">
        <!-- header -->
        <header id="header" class="navbar-fixed-top bg-white affix-top" data-spy="affix" data-offset-top="1">
            <div class="container">
                <div class="col-md-12 col-xs-12">
                <a class="navbar-brand font-fantasy " href="<%=request.getContextPath()%>/index">E-exam</a>

                <p class="navbar-text pull-left text-muted hidden-xs hidden-sm">
                    <small class="text-muted text-sm font-thin">
                        <em>在线英语考试平台</em>
                    </small>
                </p>
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#nav">
                    <i class="fa fa-reorder"></i>
                </button>
                <div class="collapse navbar-collapse" id="nav">
                    <ul class="nav navbar-nav navbar-right">
                        <%
                            Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
                            Student student = (Student) session.getAttribute("loginStudent");
                            Admin admin = (Admin) session.getAttribute("loginAdmin");
                            if (student != null) {
                        %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                               <%--<c:if test="${loginStudent.picpath ne null}">--%>
                                <%----%>
                               <%--</c:if>--%>
                                <%--<c:if test="">--%>
                                    <%--<img src="<%=request.getContextPath()%>/resources/image/defaut.jpg"--%>
                                         <%--alt="${loginStudent.username}" class="img-circle" height="25" width="25">--%>
                                <%--</c:if>--%>
                                <c:choose>
                                    <c:when test="${loginStudent.picpath ne 'upload/'}">
                                        <img src="<%=request.getContextPath()%>/${loginStudent.picpath}"
                                             alt="${loginStudent.username}" class="img-circle" height="25" width="25">
                                    </c:when>
                                    <c:when test="${loginStudent.picpath eq 'upload/'}">
                                        <img src="<%=request.getContextPath()%>/resources/image/defaut.jpg"
                                             alt="${loginStudent.username}" class="img-circle" height="25" width="25">
                                    </c:when>
                                </c:choose>
                                <span class="font-thin color-square">${loginStudent.username}</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu animated fadeInDown">

                                <li><a href="<%=request.getContextPath()%>/student/infocenter" class="user">
                                    个人信息
                                </a></li>
                                <%--<li><a href="<%=request.getContextPath()%>/student/updateself/${loginStudent.id}" class="user">--%>
                                    <%--设置--%>
                                <%--</a></li>--%>

                                <li><a href="<%=request.getContextPath()%>/logout" class="user">
                                    登出
                                </a></li>
                            </ul>
                        </li>
                        <%
                        } else if (teacher != null) {
                        %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <c:if test="${loginTeacher.pic_path ne 'upload/'}">
                                    <img src="<%=request.getContextPath()%>/${loginTeacher.pic_path}"
                                         alt="${loginTeacher.username}" class="img-circle" height="25" width="25">
                                </c:if>
                                <c:if test="${loginTeacher.pic_path eq 'upload/'}">
                                    <img src="<%=request.getContextPath()%>/resources/image/defaut.jpg"
                                         alt="${loginTeacher.username}" class="img-circle" height="25" width="25">
                                </c:if>
                                <span class="font-thin color-square">${loginTeacher.username}</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu animated fadeInDown bg-light">

                                <li><a href="<%=request.getContextPath()%>/teacher/infocenter" class="user">
                                    个人信息
                                </a></li>
                                <%--<li><a href="<%=request.getContextPath()%>/teacher/update/${loginTeacher.id}" class="user">--%>
                                    <%--设置--%>
                                <%--</a></li>--%>

                                <li><a href="<%=request.getContextPath()%>/logout" class="user">
                                    登出
                                </a></li>
                            </ul>
                        </li>
                        <%
                            }
                            else
                            if
                            (
                            admin
                            !=
                            null
                            )
                            {
                        %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <%--<img src="<%=request.getContextPath()%>/${loginAdmin.pic_path}"--%>
                                <%--alt="${loginAdmin.username}" class="img-circle" height="25" width="25">--%>
                                <span class="font-thin color-square">管理员:${loginAdmin.username}</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu animated fadeInDown bg-light">

                                <li><a href="<%=request.getContextPath()%>/teacher/infocenter" class="user">
                                    个人信息
                                </a></li>
                                <%--<li><a href="<%=request.getContextPath()%>/admin/update/${loginAdmin.id}" class="user">--%>
                                    <%--设置--%>
                                <%--</a></li>--%>

                                <li><a href="<%=request.getContextPath()%>/logout" class="user">
                                    登出
                                </a></li>
                            </ul>
                        </li>
                        <%
                            }
                            else
                            {
                        %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="font-thin color-square">注册</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li><a href="<%=request.getContextPath()%>/teacher/register" class="register">
                                    教师注册入口
                                </a></li>
                                <li><a href="<%=request.getContextPath()%>/student/register" class="register">
                                    学生注册入口
                                </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="font-thin color-square">登陆</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li><a href="<%=request.getContextPath()%>/login/teacher" class="login">
                                    教师登陆入口
                                </a></li>
                                <li><a href="<%=request.getContextPath()%>/login/student" class="login">
                                    学生登陆入口
                                </a></li>
                            </ul>
                        </li>
                        <%
                            }
                        %>
                        <li><a href="<%=request.getContextPath()%>/morepaper">更多试题</a></li>
                        <li><a href="<%=request.getContextPath()%>/FAQ">FAQ</a></li>
                    </ul>
                </div>
            </div>
            </div>
        </header>
    </div>
</nav>
</body>
</html>
