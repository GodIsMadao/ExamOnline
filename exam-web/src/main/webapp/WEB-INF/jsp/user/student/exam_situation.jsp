<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${loginUser}正在考试</title>
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
<div>
    <div id="top">
        <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
    </div>
    <div class="container-fluid clearfix ">
        <div class="text-center" style="color:#717171">
            <div>
                <div class="form-group">
                    <label class="bg-light form-control text-white">试卷:<span
                            style="color: rgba(255, 65, 0, 0.74)">${paper.pname}</span></label>
                </div>
                <div class="form-group">
                    <label class="bg-light form-control">出题人：<span
                            style="color: rgba(255, 65, 0, 0.74)">${paper.teacher.realname}</span></label>
                </div>
                <div class="form-group">
                    <label class="bg-light form-control">题目数：<span
                            style="color: rgba(255, 65, 0, 0.74)">${paper.maxQuestion}</span></label>
                </div>
                <div class="form-group">
                    <label class="bg-light form-control">规定时间：<span
                            style="color: rgba(255, 65, 0, 0.74)">${paper.time}</span></label>
                </div>
            </div>
        </div>
        <div class="col-md-7 text-center" style="background-color: #f4ffd1;">
            <form method="post"  onsubmit="return subform();" action="<%=request.getContextPath()%>/paper/exam/${paper.id}"
                  id="exam_situation" name="exam_situation" >
                <table id="table1" class="col-md-offset-1 panel col-md-10">
                    <title>${paper.pname}</title>

                    <c:forEach items="${questions.datas}" var="question" varStatus="vs">
                        <c:set var="count" value="${vs.count}"/>
                        <tbody style="border:1px dotted rgba(127, 32, 60, 0.91)">
                        <tr class="font-semibold text-white bg-success" style="font-size: 20px;">
                            <td>第<span>${count}</span>题</td>
                        </tr>
                        <tr style="border-bottom: 1px solid gray;">
                            <td></td>
                        </tr>
                        <tr class="text-primary" style="font-size: 19px;border-bottom: 1px solid gray;">
                            <td>${question.content}</td>
                        </tr>
                        <tr>
                            <td>
                                <input type="radio" name="questions[${count-1}].answer"
                                       value="A"><span
                                    style="font-size: 17px;color:#000000;">A:&nbsp;${question.choice1}</span>
                            </td>
                        <tr>
                            <td>
                                <input type="radio" name="questions[${count-1}].answer"
                                       value="B" ><span
                                    style="font-size: 17px;color:#000000;">B:&nbsp;${question.choice2}</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="radio" name="questions[${count-1}].answer"
                                       value="C"><span
                                    style="font-size: 17px;color:#000000;">C:&nbsp;${question.choice3}</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="radio" name="questions[${count-1}].answer" value="D">
                                <span style="font-size: 17px;color:#000000;">D:&nbsp;${question.choice4}</span>
                            </td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
                <div class="col-md-12">
                    <input type="submit" value="提交" class="btn btn-success"   id="subform"/>
                </div>
                <%--需要将firefox配置更改，不然无法关闭本页面--%>
            </form>
        </div>
        <div class="rounded col-md-offset-9"
             style="position:fixed;height: 450px;background-color: rgba(164, 255, 233, 0.38)">
            <div style="font-size: 20px;color:rgba(0, 11, 255, 0.51)">
                <br>
                <br>
                <br>

                <div class="col-md-offset-2">
                    <div>
                        <label>考生头像:</label>
                        <img src="<%=request.getContextPath()%>/${loginStudent.picpath}" alt="${loginStudent.realname}"
                             height="70" width="70" class="img-rounded"/>
                    </div>
                    <div>
                        <label>考生名:</label>
                        <label class="text-primary">${loginStudent.realname}</label>
                    </div>
                    <div>
                        <label>考生号:</label>
                        <label class="text-primary">${loginStudent.sno}</label>
                    </div>
                    <div>
                        <label id="writen_questions"></label>
                        <label>共<span class="text-danger">${paper.maxQuestion}题</span></label>
                        <label id="left_questions"></label>
                    </div>
                    <div id="count_refresh" style="font-size: 20px;">
                        <label style="color: rgba(255, 0, 3, 0.51);">考试计时器：</label>

                        <div id="time_count"
                             style="font-size:25px ;width: 200px;height: 50px;border:1px solid blue"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    <%--function subform(){--%>
        <%--alert("lalal");--%>
        <%--return false;--%>
        <%--for(var i=0;i<${paper.maxQuestion};i++) {--%>
            <%--if($('input:radio').is(':checked')){--%>
                <%--count1=count1+1;--%>
            <%--}--%>
            <%--else{--%>
                <%--alert('第'+count1+'题没写,点击取消去完成题目');--%>
                <%--return false;--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>

    if(!sessionStorage.count${paper.id}){
        sessionStorage.count${paper.id}=0;
    }
    if (!sessionStorage.entertime${paper.id}) {
        sessionStorage.entertime${paper.id} = new Date().getTime();
    }
    <%--alert("进入时间"+sessionStorage.entertime${paper.id}/1000);--%>
    var retime = new Date().getTime();
    //    alert(retime/1000);

    var time11 = parseInt(retime / 1000 - sessionStorage.entertime${paper.id} / 1000);//单位秒
    //    alert("已经花去"+time11+"S");
    total =${paper.time}*60 - time11;

    $(function () {
        var timeCounter = function () {
            $('#table1').find('input').each(function(){
                if($('input').is('checked')){
                    sessionStorage.count${paper.id}++;
                }
            })
            <%--document.getElementById('writen_questions').innerHTML="第"+sessionStorage.count${paper.id}+"题";--%>
            <%--document.getElementById('left_questions').innerHTML="剩"+ ${paper.maxQuestion}+"题";--%>
            if (!total || total <= 0) {
            }
            var s = (total % 60) < 10 ? ('0' + total % 60) : total % 60;
            var h = (total / 3600) < 10 ? ('0' + parseInt(total / 3600))
                    : parseInt(total / 3600);
            var m = (total - h * 3600) / 60 < 10 ? ('0' + parseInt((total - h * 3600) / 60))
                    : parseInt((total - h * 3600) / 60);
            document.getElementById("time_count").innerHTML = h + ' : ' + m + ' : ' + s;
            timerConverse = setTimeout(timeCounter, 1000);
            total--;
                if (total < 0) {
                    clearTimeout(timerConverse);
                    document.getElementById("time_count").innerHTML = "00:00:00";
                    alert('考试时间已到，您无法继续答卷，点击确定提交试卷。');
                    document.exam_situation.submit();
                }
        }
        timeCounter();
    })
</script>
</body>
</html>
