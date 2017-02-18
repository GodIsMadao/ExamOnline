<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="container">
</div>

<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="highcharts.js"></script>
<script type="text/javascript">
  $(function () {
    var chart;

    $(document).ready(function () {

      // Build the chart
      $('#container').highcharts({
        chart: {
          plotBackgroundColor: null,
          plotBorderWidth: null,
          plotShadow: false
        },
        title: {
          text: 'Browser market shares at a specific website, 2010'
        },
        tooltip: {
          pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
          pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: false
            },
            showInLegend: true
          },
          series: {
            cursor: 'pointer',
            point: {
              events: {
                click: function() {
                  location.href = this.options.url;
                }
              }
            }
          }
        },
        series: [{
          type: 'pie',
          name: 'Browser share',
          data: [
            ['Firefox',   45.0],
            ['IE',       26.8],
            {
              name: 'Chrome',
              y: 12.8,
              sliced: true,
              selected: true,
              url:'http://www.baidu.com'
            },
            ['Safari',    8.5],
            ['Opera',     6.2],
            ['Others',   0.7]
          ]
        }]
      });
    });

  });
</script>
</body>
</html>
