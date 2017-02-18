<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<footer>
    <div class="bg-white-only" style="height: 170px">
        <div class="container">
            <div id="bottom-panel" class=" col-md-12 col-xs-12"
                 style="padding-left: 0px;padding-right:0px;margin-bottom:0px;margin-outside:0px">
                <div class="col-md-offset-1 col-md-4 " id="logopic" style="cursor: pointer">
                    <a  href="<%=request.getContextPath()%>/index">
                        <img id="logo_pic" src="<%=request.getContextPath()%>/resources/image/logo_noback.png"
                            height="100" width="220" alt="logo"/>
                    </a>

                    <div>
                        <p class="text-muted font-semibold col-md-offset-1 text-capitalize" id="logoword">
                            better exam , better life!
                        </p>
                    </div>
                </div>
                <div class="link">
                    <div class="col-md-offset-1 col-md-2  col-xs-offset-1 col-xs-2">
                        <h3>Company</h3>
                        <ul>
                            <li class="list-unstyled"><a href="<%=request.getContextPath()%>/FAQ">FAQ</a></li>
                            <li class="list-unstyled"><a href="http://www.zjut.edu.cn">ZJUT</a></li>
                            <li class="list-unstyled"><a href="<%=request.getContextPath()%>/login/admin">管理员登陆</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 col-xs-2">
                        <h3>SOCIAL</h3>
                        <ul>
                            <li class="list-unstyled"><a href="http://www.facebook.com">Facebook</a></li>
                            <li class="list-unstyled"><a href="http://im.qq.com">QQ</a></li>
                            <li class="list-unstyled"><a href="http://weibo.com">Sina微博</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 col-xs-2">
                        <h3>CONTACT US</h3>
                    <span id="email">
                        Send us an email at
                        <a href="mailto:370576322@qq.com" id="emailto">370576322@qq.com</a>
                        We'll reply within 24 hours.
                    </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.rotate.min.js"></script>
<script type="text/javascript">
    $(function () {
        $('#logopic').mouseenter(function () {
            if (!($(this).is(":animated"))) {
                $('#logo_pic').animate({height:"110px",width:"235px"},500);
                $('#logoword').css("color", "black").fadeTo(900, 0.4).show();
            }
        });
        $('#logopic').mouseleave(function () {
            $('#logo_pic').animate({height:"100px",width:"220px"},500);
            $('#logoword').fadeTo(900, 1).css("color", "#af04ff");
        });
        $('.link ul>li').mouseenter(function () {
            if (!($(this).is(":animated"))) {
                $(this).fadeTo(500, 0.4).css("color","white");
            }
        })
        $('.link ul>li').mouseleave(function () {
            $(this).fadeTo(500, 1).css("color", "#ff9b67");
        })
        $('#emailto').mouseenter(function () {
            $(this).fadeTo(500,0.5).css("color","#ffc6f3");
        })
        $('#emailto').mouseleave(function () {
            $(this).fadeTo(500,1).css("color","#7764e6");
        })
    })
</script>
</body>
</html>
