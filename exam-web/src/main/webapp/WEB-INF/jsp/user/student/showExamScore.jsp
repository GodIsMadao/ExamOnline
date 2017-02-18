<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>成绩单</title>
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
<div>
    <div>
        <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
    </div>
    <div id="resultado" class="container">
        <section class="panel wrapper-md">
            <header class="panel-heading text-center bg bg-success"> 成绩单</header>
            <div class="text-center col-md-12">
            <%--<c:if test="${studentpaper.score<60}">--%>
                <%----%>
            <%--</c:if>--%>
            <%--<c:if test="${studentpaper.score>60&&studentpaper.score<80}">--%>
                <%--<div class="col-md-12" style="font-size: 20px">--%>
                <%--<label class="text-muted">${loginStudent.realname}同学，这次考试成绩马马虎虎嘛：</label>--%>
                <%--<strong class="text-danger">${studentpaper.score}</strong><span class="text-muted">分(总分100分)</span>--%>
                <%--</div>--%>
                <%--<img src="<%=request.getContextPath()%>/resources/image/fighting2.jpg" alt="加油！">--%>
            <%--</c:if>--%>
            <%--<c:if test="${studentpaper.score>80&&studentpaper.score<100}">--%>
                <%--<div class="col-md-12" style="font-size: 20px">--%>
                <%--<label class="text-muted">${loginStudent.realname}同学！牛！：</label>--%>
                <%--<strong class="text-danger">${studentpaper.score}</strong><span class="text-muted">分(总分100分)</span>--%>
                <%--</div>--%>
                <%--<img src="<%=request.getContextPath()%>/resources/image/fighting3.jpg" alt="加油！">--%>
            <%--</c:if>--%>
                <c:choose>
                    <c:when test="${studentpaper.score<=60}">
                        <div class="col-md-12" style="font-size: 20px">
                            <label class="text-muted" x>要加把劲啦！${loginStudent.realname}同学!你的成绩只有这么点儿：</label>
                            <strong class="text-danger"  >${studentpaper.score}</strong><span class="text-muted font-semibold">分(总分100分)</span>
                        </div>
                        <div>
                            <img src="<%=request.getContextPath()%>/resources/image/fighting1.jpg" alt="加油！">
                        </div>
                    </c:when>
                    <c:when test="${studentpaper.score>60 and studentpaper.score<=80}">
                        <div class="col-md-12" style="font-size: 20px">
                            <label class="text-muted">${loginStudent.realname}同学，这次考试成绩马马虎虎嘛：</label>
                            <strong class="text-danger">${studentpaper.score}</strong><span class="text-muted">分(总分100分)</span>
                        </div>
                        <img src="<%=request.getContextPath()%>/resources/image/fighting2.jpg" alt="加油！">
                    </c:when>
                    <c:when test="${studentpaper.score>80 and studentpaper.score<=100}">
                        <div class="col-md-12" style="font-size: 20px">
                            <label class="text-muted">${loginStudent.realname}同学！牛！：</label>
                            <strong class="text-danger">${studentpaper.score}</strong><span class="text-muted">分(总分100分)</span>
                        </div>
                        <img src="<%=request.getContextPath()%>/resources/image/fighting3.jpg" alt="加油！">
                    </c:when>
                </c:choose>
            </div>
            <div class="text-center">
                <a href="<%=request.getContextPath()%>/student/infocenter" class="btn btn-success">返回个人中心</a>
            </div>
        </section>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>

</body>
</html>
