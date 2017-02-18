<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<div class="panel" style="margin-top: 15px">
    <blockquote>
        <p> What doesn't kill you makes you stronger.</p>
        <footer><cite title="Nietzsche">Nietzsche</cite></footer>
    </blockquote>

    <!-- Large modal -->
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Welcome
    </button>

    <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="col-md-12">
                <img id="modal_img" src="<%=request.getContextPath()%>/resources/image/logo_panel.jpg"/>
                </div>
                <blockquote>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: rgba(255, 174, 18, 0.57)">Welcome to the Exam-online system!</span></p>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;This examination system is my maiden work and I spent a month to completed it almost independently.</p>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;I just have a try for deploying my web site on Peanut Shell (a Dynamic DNS software),but I just
                        use my jetty plugin in maven as whole system’s server,I think you can enter
                        godismadao.vicp.io:21577/exam/index to visit my web project if my server was opening. </p>
                    <p> &nbsp;&nbsp;&nbsp;&nbsp;I hope you could enjoy the happiness what our system bring to you and enjoy the process of
                        learning.</p>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;If you hav <span style="color: lawngreen;">SOME PROBLEM</span> or <span style="color: rgba(3, 0, 255, 0.57);">SOME AWESOME SUGGESTION</span> about this system,<span style="color: rgba(255, 12, 21, 0.57)">PLEASE CONNECT ME</span>.My WeChat is '<span>GodIsMadao</span>' and my email is '<span>370576322@qq.com'</span>.</p>
                    <footer><cite title="Neo.Song" style="font-size: large">Neo.song</cite></footer>
                </blockquote>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
<script type="text/javascript">
    $(function(){
            $('#modal_img').hover(function(){
                //防止动画堆积
                if (!($(this).is(":animated"))) {
                    $(this).animate({marginLeft: "300px"}, 1000);
                }
            },function(){
//                if (!($(this).is(":animated"))) {
                    $(this).animate({marginLeft: "0px"}, 1000);
//                }
            });
    })
</script>
</body>
</html>
