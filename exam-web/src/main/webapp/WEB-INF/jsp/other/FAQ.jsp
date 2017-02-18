<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>FAQ</title>
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
<div class="container panel"  style="margin-top: 100px;">
    <div>
        <h1 class="faq-header col-md-12">Frequently asked questions</h1>
    </div>
    <div  class="col-md-12">
    <dl>
        <dd>
            <h4 class="faq-content-title">Question1:what ....</h4>
        </dd>
        <dt>bulabula</dt>
        <dd>
            <h4 class="faq-content-title">Question1:what ....</h4>
        </dd>
        <dt>bulabula</dt><dd>
        <h4 class="faq-content-title">Question1:what ....</h4>
    </dd>
        <dt>bulabula</dt><dd>
        <h4 class="faq-content-title">Question1:what ....</h4>
    </dd>
        <dt>bulabula</dt><dd>
        <h4 class="faq-content-title">Question1:what ....</h4>
    </dd>
        <dt>bulabula</dt><dd>
        <h4 class="faq-content-title">Question1:what ....</h4>
    </dd>
        <dt>bulabula</dt><dd>
        <h4 class="faq-content-title">Question1:what ....</h4>
    </dd>
        <dt>bulabula</dt>
        <dd>
            <h4 class="faq-content-title">Question2:why ...</h4>
        </dd>
        <dt>bulabula</dt>
        <dd>
            <h4 class="faq-content-title">Question3:why ...</h4>
        </dd>
        <dt>bulabula</dt>
        <dd>
            <h4 class="faq-content-title">Question4:why ...</h4>
        </dd>
        <dt>bulabula</dt>
    </dl>
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
</body>
</html>
