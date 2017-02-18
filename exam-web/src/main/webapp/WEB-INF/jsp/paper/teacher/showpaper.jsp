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
    <%--预览试卷的情况--%>
</head>
<body>
<div class="container-fluid" style="margin-top: 15px">
    <div class="header">
        <jsp:include page="/resources/jsp/top_inside.jsp"/>
    </div>
    <div class="col-md-12 text-center panel">
        <h3>${paper.pname}</h3>
        <h4>${paper.tag}</h4>
        <h5>所需时间：${paper.time}</h5>
        <h5>题量：${paper.maxQuestion}</h5>
    </div>
    <div class="col-md-8 panel" style="border: 1px solid blue" id="content">
        <c:forEach items="${questions.datas}" var="question" varStatus="vs">
            <c:set var="count" value="${vs.count}"/>
            <div style="border: 1px solid cadetblue">
                <label>第<span class="text-danger">${count}</span>题:</label><br>
                <label>${question.content}</label><br>
                <label>A:<span>${question.choice1}</span></label>
                <label>B:<span>${question.choice2}</span></label>
                <label>C:<span>${question.choice3}</span></label>
                <label>D:<span>${question.choice4}</span></label>
            </div>
            <div id="answer" style="border: 1px solid orangered">
                    <h5 style="cursor:pointer">
                        <span>答案解析</span>
                    </h5>
                <ul class="list-unstyled " id="comment">
                <li>正确答案:<strong>${question.answer}</strong></li>
                    <li>解析如下:${question.comment}</li>
                </ul>
            </div>
        </c:forEach>
    </div>
    <div class="col-md-3 col-md-offset-1  panel" style="height:auto; border:1px solid red">
        <img src="<%=request.getContextPath()%>/resources/image/logo_panel.jpg" height="110" width="270">
        <span>（考试时）剩余时间，考生信息</span>
        <span>（老师查看时，显示试卷有多少学生写过，正确率如何）</span>

        <c:if test="${paper.check_status eq 3}">
        <div id="charts"></div>
        </c:if>
        <span>（学生查看时，显示试卷的正确题数与错误题数比例图）</span>
        <span>（老师预览时），好像没什么好显示的了，<strong class="label-danger text-success">贴贴广告也好</strong></span>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/unfold.js"></script>
<%--// Highcharts--%>
<script src="<%=request.getContextPath()%>/resources/js/highcharts.js"></script>
<script type="text/javascript">
    $(function () {
        $(function () {
            $("#content").find("h5").each(function () {
                $(this).click(function () {
//                    $(this).nextAll().css("display","block");
                    $(this).nextAll().slideToggle();
                });
            });
        });
        $(function () {
            var chart;
            $(document).ready(function () {
                // Build the chart
                $('#charts').highcharts({
                    chart: {
                        plotBackgroundColor: null,
                        plotBorderWidth: null,
                        plotShadow: false
                    },
                    title: {
                        text: ''
                    },
                    tooltip: {
//                        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                        formatter: function () {
                            return '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1) + '% (' +
                                    Highcharts.numberFormat(this.y *${total_stu} / 100, 0, ',') + ' 个)';
                        }
                    },
                    plotOptions: {
                        pie: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: false
                            },
                            showInLegend: true
                        }
                    },
                    series: [{
                        type: 'pie',
                        name: 'Writen Proportion',
                        data: [
                            ['已做学生', ${writen_prop}],
                            ['未做学生', ${unwriten_prop}]
                        ]
                    }]
                });
            });

        });
    })
</script>
</body>
</html>
