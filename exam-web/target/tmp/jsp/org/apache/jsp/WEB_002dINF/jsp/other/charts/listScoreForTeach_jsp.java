package org.apache.jsp.WEB_002dINF.jsp.other.charts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Student;

public final class listScoreForTeach_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>成绩走向图</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"charts\" style=\"margin-top: 15px\"></div>\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/highcharts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function () {\r\n");
      out.write("    $('#charts').highcharts({\r\n");
      out.write("      title: {\r\n");
      out.write("        text: '历次得分走向',\r\n");
      out.write("        x: -20 //center\r\n");
      out.write("      },\r\n");
      out.write("      subtitle: {\r\n");
      out.write("        text: 'Source: exam.com',\r\n");
      out.write("        x: -20\r\n");
      out.write("      },\r\n");
      out.write("      xAxis: {\r\n");
      out.write("        categories: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pnamelist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("      },\r\n");
      out.write("      yAxis: {\r\n");
      out.write("        title: {\r\n");
      out.write("          text: '成绩（分）'\r\n");
      out.write("        },\r\n");
      out.write("        plotLines: [{\r\n");
      out.write("          value: 0,\r\n");
      out.write("          width: 1,\r\n");
      out.write("          color: '#808080'\r\n");
      out.write("        }]\r\n");
      out.write("      },\r\n");
      out.write("      tooltip: {\r\n");
      out.write("        valueSuffix: '分'\r\n");
      out.write("      },\r\n");
      out.write("      legend: {\r\n");
      out.write("        layout: 'vertical',\r\n");
      out.write("        align: 'right',\r\n");
      out.write("        verticalAlign: 'middle',\r\n");
      out.write("        borderWidth: 0\r\n");
      out.write("      },\r\n");
      out.write("      plotOptions:{\r\n");
      out.write("        series: {\r\n");
      out.write("          cursor: 'pointer'\r\n");
      out.write("        }\r\n");
      out.write("      },\r\n");
      out.write("      series: [{\r\n");
      out.write("        name: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("        data: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scorelist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("      }]\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
