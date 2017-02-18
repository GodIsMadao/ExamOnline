<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>学生信息中心</title>
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
<div class="container-fluid clearfix">
    <div class="col-md-12" style="float:left">
        <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
    </div>
    <div class="col-md-3" id="left" style="float:left">
        <jsp:include page="/resources/jsp/aside.jsp"></jsp:include>
    </div>
    <div id="content" class="col-md-9" style="float:left">
        <jsp:include page="welcome.jsp"></jsp:include>
    </div>
</div>
<div class="footer col-md-12 col-xs-12" style="float:left;clear:both">
    <jsp:include page="/resources/jsp/bottom.jsp"></jsp:include>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/unfold.js"></script>
<script type="text/javascript">
    $(function () {
        $("#left").unfold();
        $('#selected1').addClass("text-success");
        $('#selected2').addClass("text-success");
        $('#selected3').addClass("text-success");

        $('ul>h3').click(function () {
            if($(this).hasClass("text-success")){
                $(this).removeClass("text-success");
            }else {
                $(this).addClass("text-success");
            }
        })
    });
</script>
</body>
</html>
