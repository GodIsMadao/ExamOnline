<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>管理员登陆页面</title>
    <!--<link rel="stylesheet" type="text/css" href="../css/main.css"/>-->
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        function reCheckcode(img) {
            img.src="drawCheckCode?"+Math.random();
        }
    </script>
</head>
<body>
<div id="header">
    <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
</div>
<div class="container">
    <div class="col-md-offset-3 col-md-6">
        <section class="panel wrapper-md">
            <header class="panel-heading text-center bg-warning bg"> 登入 </header>
            <form method="post" action="" id="loginForm" >
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Enter username" autocomplete="off" name="username"/>
                </div>
                <div class="form-group">
                    <input type="password" name="password" class="form-control" placeholder="Enter password"/>
                </div>
                <div class="form-group">
                    <input type="text" name="checkcode" id="validateCode"  class="form-control" autocomplete="off" placeholder="Enter checkcode" size="15"/>
                    ${error}
                </div>
                <div >
                    <img src="drawCheckCode" class="center-block" style="cursor: pointer" onclick="reCheckcode(this)"/></span>
                </div>
                <div>
                    <button type="submit" class="btn btn-warning center-block">管理员登陆</button>
                </div>
                </dl>
            </form>
        </section>
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
        $("#loginForm").examvalidate();
    })
</script>
</body>
</html>
