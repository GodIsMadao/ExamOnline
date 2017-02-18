<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title></title>
    <!--<link rel="stylesheet" type="text/css" href="../css/main.css"/>-->
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <%--学生查看已做试卷的情况--%>
</head>
<body>
<div>
    <jsp:include page="/resources/jsp/top.jsp"></jsp:include>
</div>
<div class="container bg-white-only" style="margin-top: 80px;" id="content">
    <div>
        <h3 class="text-center" style="background-color:rgba(135, 255, 115, 0.13)">本题取自于试卷 ${show_question.exampaper.pname}</h3>
        <div class="col-md-6 col-md-offset-2" style="border-right: 1px dashed rgba(77, 52, 180, 0.40)">
            <label id="q_comment" style="font-size: large" class="text-primary"><span
                    class="text-danger">*</span>${show_question.content}</label>
            <p class="qchoice"><span>A:</span>${show_question.choice1}</p>
            <p class="qchoice"><span>B:</span>${show_question.choice2}</p>
            <p class="qchoice"><span>C:</span>${show_question.choice3}</p>
            <p class="qchoice"><span>D:</span>${show_question.choice4}</p>
            <p class="qchoice">你的答案是:&nbsp;&nbsp;&nbsp;<span style="color:rgba(255, 5, 0, 0.60);">${s_answer.stu_answer}</span></p>
            <p>
                <c:if test="${s_answer.stu_answer eq show_question.answer}">
                    <span style="color:rgba(9, 255, 2, 0.60);">正确</span>
                </c:if>
                <c:if test="${s_answer.stu_answer ne show_question.answer}">
                    <span style="color:rgba(255, 5, 0, 0.60);">错误</span>
                </c:if>
            </p>
            </div>
            <div id="answer" class="col-md-2">
                <h5 style="cursor:pointer">
                    <span class="btn btn-rounded btn-facebook">答案解析</span>
                </h5>
                <ul class="list-unstyled qchoice" id="comment">
                    <li>正确答案:&nbsp;&nbsp;&nbsp;<strong style="color:rgba(255, 65, 62, 0.60)">${show_question.answer}</strong></li>
                    <li >解析如下:<span style="color: rgba(255, 65, 62, 0.60)">${show_question.comment}</span></li>
                </ul>
            </div>
    </div>
</div>
<div class="col-md-12 text-center">
    <c:if test="${s_answer.stu_answer eq show_question.answer}">
        <a href="<%=request.getContextPath()%>/student/infocenter" class="btn btn-success">返回个人中心</a>
    </c:if>
    <c:if test="${s_answer.stu_answer ne show_question.answer}">
        <a id="check_wrong_question" class="btn btn-success" href="<%=request.getContextPath()%>/student/infocenter">返回个人中心</a>
        <p id="check_note" style="color: rgba(255, 31, 63, 0.60)">确认不会在错了么?</p>
    </c:if>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#content").find("h5").each(function () {
            $(this).click(function () {
                $(this).nextAll().slideToggle();
            });
        });
        $('#check_wrong_question').mouseenter(function(){
            $(this).next().show();
        })
        $('#check_wrong_question').mouseleave(function(){
            $(this).next().hide();
        })
    })
</script>
</body>
</html>
