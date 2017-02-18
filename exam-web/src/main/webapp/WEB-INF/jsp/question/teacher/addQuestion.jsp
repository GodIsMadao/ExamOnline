<%@ page import="zjut.sy.model.Exampaper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加试题</title>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/font.css"/>
</head>
<body>
<%
    Exampaper paper = (Exampaper) session.getAttribute("newpaper");
    pageContext.setAttribute("p1", paper);
%>
<div class="container-fluid">
    <div id="header">
        <jsp:include page="/resources/jsp/top_inside.jsp"></jsp:include>
    </div>
    <div class="">
    <form method="post" id="form1" action="">
        <c:forEach begin="1" end="${p1.maxQuestion}" varStatus="vs">
            <c:set var="count" value="${vs.count}"/>
            <%--客户端验证还没做--%>
            <fieldset id="field" >
                <legend class="text-center"><span>第${count}题</span></legend>
                <div class="col-md-offset-4">
                <p>
                    <label for="qcontent">题干</label><em>*</em>
                    <textarea id="qcontent" cols="50" autocomplete="off" name="questions[${count-1}].content"  placeholder="Enter content" class="required"></textarea>
                </p>

                <p>
                    <label for="qchoice1">A:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>
                    <textarea id="qchoice1" cols="50" autocomplete="off" name="questions[${count-1}].choice1" placeholder="Enter choice1's content"></textarea>
                </p>

                <p>
                    <label for="qchoice2">B:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>
                    <textarea id="qchoice2" cols="50" autocomplete="off" name="questions[${count-1}].choice2" placeholder="Enter choice2's content"></textarea>
                </p>

                <p>
                    <label for="qchoice3">C:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>
                    <textarea id="qchoice3" cols="50" autocomplete="off" name="questions[${count-1}].choice3" placeholder="Enter choice3's content"></textarea>
                </p>

                <p>
                    <label for="qchoice4">D:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>
                    <textarea id="qchoice4" cols="50" autocomplete="off" name="questions[${count-1}].choice4" placeholder="Enter choice4's content"></textarea>
                </p>

                <p>
                    <label>答案:</label><em>*</em>
                        <label>A:</label><input type="radio" name="questions[${count-1}].answer" value="A"><em>&nbsp;&nbsp;</em>
                        <label>B:</label><input type="radio" name="questions[${count-1}].answer" value="B"><em>&nbsp;&nbsp;</em>
                        <label>C:</label><input type="radio" name="questions[${count-1}].answer" value="C"><em>&nbsp;&nbsp;</em>
                        <label>D:</label><input type="radio" name="questions[${count-1}].answer" value="D"><em>&nbsp;&nbsp;</em>
                </p>
                <p >
                    <label for="idcomment">解析:</label><em>&nbsp;</em>
                    <textarea id="idcomment" cols="50" autocomplete="off" name="questions[${count-1}].comment" placeholder="Enter comment"></textarea>
                </p>
                </div>
            </fieldset>
        </c:forEach>
        <input  type="submit" id="send" class="pull-right-lg btn btn-success" value="提&nbsp;&nbsp;&nbsp;交"/>
    </form>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/json2.js"></script>
<%--<script type="text/javascript">--%>
<%--$(function () {--%>
<%--var dataJson = "[";--%>
<%--var question = "";--%>
<%--//            var content = "";--%>
<%--//            var choice1 = "";--%>
<%--//            var choice2 = "";--%>
<%--//            var choice3 ="";--%>
<%--//            var choice4 = "";--%>
<%--//            var answer = "";--%>
<%--//            var comment ="";--%>

<%--$("#field").each(function () {--%>
<%--question='{"content":"' + $('#pcontent').val() + '","choice1":"'--%>
<%--+ $('#pchoice1').val() + '","choice2":"'--%>
<%--+ $('#pchoice2').val() +'","choice3":"'--%>
<%--+ $('#pchoice3').val() +'","choice4":"'--%>
<%--+ $('#pchoice4').val() +'","answer":"'--%>
<%--+ $('#answer').val() +--%>
<%--'","comment":"' + $('#comment').val() + '"}';--%>
<%--dataJson += "{" + "\"question\":\"" + question + "\"},";--%>
<%--});--%>
<%--if(dataJson.lastIndexOf(",")){--%>
<%--dataJson = dataJson.substring(0,dataJson.length -1);--%>
<%--dataJson += "]";--%>
<%--}--%>

<%--$('#send').click(function(){--%>
<%--$.ajax({--%>
<%--type:"POST",--%>
<%--dataType:"json",--%>
<%--url:"<%=request.getContextPath()%>/question/teacher/addQuestion",--%>
<%--contentType:"application/json",--%>
<%--data:{"question":dataJson},--%>
<%--success:function(data){--%>
<%--alert("content:"+data.answer);--%>
<%--}--%>
<%--});--%>
<%--});--%>
<%--})--%>
<%--</script>--%>
</body>
</html>
