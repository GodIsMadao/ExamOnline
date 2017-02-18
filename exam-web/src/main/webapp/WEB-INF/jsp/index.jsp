<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>E-exam主页面</title>
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
    <jsp:include page="/resources/jsp/top.jsp"></jsp:include>
</div>
<div class="container-fluid clearfix" style="padding-left: 0px;padding-right: 0px;">
    <!---->
    <div id="slidershow" class=" carousel slide" data-ride="carousel">
        <!-- 设置图片轮播的顺序 -->
        <ol class="carousel-indicators">
            <li data-target="#slidershow" data-slide-to="0" class="active"></li>
            <li data-target="#slidershow" data-slide-to="1"></li>
            <li data-target="#slidershow" data-slide-to="2"></li>
        </ol>
        <!-- 设置轮播图片 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="<%=request.getContextPath()%>/resources/image/books.jpg" class="center-block"
                     id="pic1" alt="books"/>

                <div class="carousel-caption">
                    <h3>书籍</h3>
                    <p>生命不息，读书不止</p>
                </div>
            </div>
            <div class="item">
                <img src="<%=request.getContextPath()%>/resources/image/flowers.jpg" width="1369" class="center-block"
                     alt="knowledge"/>
                <div class="carousel-caption">
                    <h3>知识</h3>
                    <p>沐浴知识，如嗅鲜花</p>
                </div>
            </div>
            <div class="item">
                <img src="<%=request.getContextPath()%>/resources/image/exam.jpg" width="1369" height="600" class="center-block"
                     alt="exam"/>

                <div class="carousel-caption">
                    <h3>快乐考试</h3>
                    <p>检验知识的手段</p>
                </div>
            </div>
        </div>
        <!-- Controls -->
        <a class="left carousel-control" href="#slidershow" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#slidershow" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<section>
    <div class="container bg-white" id="panel_pic1">
        <div class="col-md-offset-1 col-md-5 col-xs-12">
            <br>
            <br>
            <br>
            <br>
            <img src="<%=request.getContextPath()%>/resources/image/online.png" alt="online"/>

            <h1 class="col-md-12 col-sm-12">在线考试</h1>

            <p class="col-md-12 col-sm-12">lalsllalalalalalalallalala</p>

            <p class="col-md-12 col-sm-12">lalsllalalalalalalallalala</p>

            <p class="col-md-12 col-sm-12">lalsllalalalalalalallalala</p>

        </div>
        <div class="col-md-6  col-xs-6">
            <img src="<%=request.getContextPath()%>/resources/image/study.jpg" alt="study" data-animate-scroll='{"x": "0","y":"+90","alpha": "0","duration": "1.5"}'/>
        </div>
    </div>
</section>
<section>
    <div class="container bg-white" id="panel_pic2">
        <div class="col-md-6 col-xs-6">
            <img src="<%=request.getContextPath()%>/resources/image/convasation.jpg" data-animate-scroll='{"x": "-90","y":"0","alpha": "0","duration": "1.5"}' alt=""/>
        </div>
        <div class="col-md-offset-1 col-md-5 col-sm-12">
            <br>
            <br>
            <br>
            <br>
            <img src="<%=request.getContextPath()%>/resources/image/connect.png" alt="connect"/>

            <h1>师生互动</h1>

            <p>lalsllalalalalalalallalala</p>

            <p >lalsllalalalalalalallalala</p>

            <p>lalsllalalalalalalallalala</p>

        </div>
    </div>
</section>
<section>
    <div class="container bg-white" id="panel_pic3">
        <div class="col-md-offset-1 col-md-5 col-xs-12">
            <br>
            <br>
            <br>
            <br>
            <img src="<%=request.getContextPath()%>/resources/image/stairs.png" alt="stairs"/>

            <h1 class="">成绩曲线</h1>

            <p >lalsllalalalalalalallalala</p>

            <p >lalsllalalalalalalallalala</p>

            <p >lalsllalalalalalalallalala</p>

        </div>
        <div class="col-offset-1 col-md-6 col-xs-6">
            <img src="<%=request.getContextPath()%>/resources/image/score_list.jpg"  data-animate-scroll='{"x": "+90","y":"0","alpha": "0","duration": "1.5"}'  alt=""/>
        </div>
    </div>
</section>
<div class="container-fluid">
<div class="row bg-success">
    <div class="col-sm-4 wrapper-xl lter appear" data-ride="animated" data-animation="fadeInLeft">
        <p class="text-center">
           <img src="" alt="">
        </p>
        <div>
            <h3 class="text-center">在线考试</h3>
            <p class="text-center">
                实现无纸化考试 <br>
                良好的教学考试平台
            </p>
        </div>
    </div>
    <div class="col-sm-4 wrapper-xl appear" data-ride="animated" data-animation="fadeInUp" data-delay="250">
        <p class="text-center">
          <img src="" alt="">
        </p>
        <div>
            <h3 class="text-center">师生互动</h3>
            <p class="text-center">
                教师与学生<br>
                通过试卷交流，互动
            </p>
        </div>
    </div>
    <div class="col-sm-4 wrapper-xl dker appear" data-ride="animated" data-animation="fadeInRight" data-delay="500">
        <p class="text-center">
            <img src="" alt="">
        </p>
        <div>
            <h3 class="text-center">成绩分析</h3>
            <p class="text-center">
                考完自动改卷<br>
                配有答案解析，成绩趋势图
            </p>
        </div>
    </div>
</div>
</div>

<footer id="footer">
    <div>
        <jsp:include page="/resources/jsp/bottom.jsp"></jsp:include>
    </div>
</footer>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/slidershow.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/animate-scroll.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/1.16.1/TweenMax.min.js"></script>
<script type="text/javascript">
    $(document).animateScroll();
//    var doc = document.documentElement;
//    doc.setAttribute('data-useragent', navigator.userAgent);
</script>
</body>
</html>
