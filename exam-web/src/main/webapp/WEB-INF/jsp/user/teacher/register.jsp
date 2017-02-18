<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>教师注册页面</title>
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
<div id="header">
    <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
</div>
<div class="container-fluid">
    <div class="col-md-offset-3 col-md-6 text-center  panel bg-light">
        <form method="post" id="TeacherRegister" action="" enctype="multipart/form-data">
            <%--客户端验证还没做--%>
            <fieldset>
                <legend class="text-muted"><span>就在这里注册啦!</span></legend>
                <p >
                    <label for="susername">用&nbsp;&nbsp;户&nbsp;&nbsp;名</label><em>*</em>
                    <input id="susername" type="text" autocomplete="off" name="username" placeholder="Enter username" class="required"
                           minlength="3"/>
                </p>

                <p>
                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</label><em>*</em>
                    <input id="password" type="password" name="password" placeholder="Enter password"/>
                </p>

                <p >
                    <label for="repassword">确认密码</label><em>*</em>
                    <input id="repassword" type="password" name="confirmPwd" placeholder="Confirm password"/>
                </p>

                <p >
                    <label for="realname">真实姓名</label><em>*</em>
                    <input id="realname" autocomplete="off" type="text" name="realname"/>
                </p>

                <p >
                    <label for="email">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱</label><em>&nbsp;</em>
                    <input id="email" autocomplete="off" type="text" name="email"/>
                </p>

                <p >
                    <label for="phone">电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话</label><em>&nbsp;</em>
                    <input id="phone" autocomplete="off" type="text" name="phone"/>
                </p>

                <p >
                    <label for="school">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;校</label>
                    <input id="school" autocomplete="off" type="text" name="school"/>
                </p>

                <p >
                    <label for="address">地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址</label>
                    <input id="address" autocomplete="off" type="text" name="address"/>
                </p>

                <p>
                    <label for="pic_path" style="border: 1px solid lemonchiffon;">---------------上传头像---------------</label>
                    <input type="file"  id="pic_path" class="center-block" style="width:206px;border: 1px solid lemonchiffon;" name="myfile"/>
                </p>

                <p >
                    <input type="submit" class="btn btn-warning" value="立即注册"/>
                </p>
            </fieldset>
        </form>
    </div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<%--jQuery验证插件--%>
<script src="<%=request.getContextPath()%>/resources/js/jquery.validate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.cms.validate.js"></script>
<script type="text/javascript">
    $(function(){
        $("#TeacherRegister").examvalidate();
    })
</script>
</body>
</html>
