<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/5/10
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩走向图</title>
</head>
<body>
<div id="charts" style="margin-top: 15px"></div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<%--<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>--%>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<%--<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>--%>
<%--// Highcharts--%>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/highcharts.js"></script>
<script type="text/javascript">
  $(function () {
    $('#charts').highcharts({
      title: {
        text: '历次得分走向',
        x: -20 //center
      },
      subtitle: {
        text: 'Source: exam.com',
        x: -20
      },
      xAxis: {
        categories: ${pnamelist}
      },
      yAxis: {
        title: {
          text: '成绩（分）'
        },
        plotLines: [{
          value: 0,
          width: 1,
          color: '#808080'
        }]
      },
      tooltip: {
        valueSuffix: '分'
      },
      legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
      },
      plotOptions:{
        series: {
          cursor: 'pointer',
          point: {
            events: {
              click: function() {
                location.href = 'javascript:void(0)';
                $('#content').load('<%=request.getContextPath()%>/student/papers/writen');
              }
            }
          }
        }
      },
      series: [{
        name: '${loginStudent.username}',
        data: ${scorelist}
      }]
    });
  });
</script>
</body>
</html>
