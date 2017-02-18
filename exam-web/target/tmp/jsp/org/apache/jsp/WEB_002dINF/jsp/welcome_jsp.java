package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>welcome</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"panel\" style=\"margin-top: 15px\">\r\n");
      out.write("    <blockquote>\r\n");
      out.write("        <p> What doesn't kill you makes you stronger.</p>\r\n");
      out.write("        <footer><cite title=\"Nietzsche\">Nietzsche</cite></footer>\r\n");
      out.write("    </blockquote>\r\n");
      out.write("\r\n");
      out.write("    <!-- Large modal -->\r\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\".bs-example-modal-lg\">Welcome\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade bs-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\">\r\n");
      out.write("        <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                <img id=\"modal_img\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/image/logo_panel.jpg\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <blockquote>\r\n");
      out.write("                    <p>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: rgba(255, 174, 18, 0.57)\">Welcome to the Exam-online system!</span></p>\r\n");
      out.write("                    <p>&nbsp;&nbsp;&nbsp;&nbsp;This examination system is my maiden work and I spent a month to completed it almost independently.</p>\r\n");
      out.write("                    <p>&nbsp;&nbsp;&nbsp;&nbsp;I just have a try for deploying my web site on Peanut Shell (a Dynamic DNS software),but I just\r\n");
      out.write("                        use my jetty plugin in maven as whole system’s server,I think you can enter\r\n");
      out.write("                        godismadao.vicp.io:21577/exam/index to visit my web project if my server was opening. </p>\r\n");
      out.write("                    <p> &nbsp;&nbsp;&nbsp;&nbsp;I hope you could enjoy the happiness what our system bring to you and enjoy the process of\r\n");
      out.write("                        learning.</p>\r\n");
      out.write("                    <p>&nbsp;&nbsp;&nbsp;&nbsp;If you hav <span style=\"color: lawngreen;\">SOME PROBLEM</span> or <span style=\"color: rgba(3, 0, 255, 0.57);\">SOME AWESOME SUGGESTION</span> about this system,<span style=\"color: rgba(255, 12, 21, 0.57)\">PLEASE CONNECT ME</span>.My WeChat is '<span>GodIsMadao</span>' and my email is '<span>370576322@qq.com'</span>.</p>\r\n");
      out.write("                    <footer><cite title=\"Neo.Song\" style=\"font-size: large\">Neo.song</cite></footer>\r\n");
      out.write("                </blockquote>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("            $('#modal_img').hover(function(){\r\n");
      out.write("                //防止动画堆积\r\n");
      out.write("                if (!($(this).is(\":animated\"))) {\r\n");
      out.write("                    $(this).animate({marginLeft: \"300px\"}, 1000);\r\n");
      out.write("                }\r\n");
      out.write("            },function(){\r\n");
      out.write("//                if (!($(this).is(\":animated\"))) {\r\n");
      out.write("                    $(this).animate({marginLeft: \"0px\"}, 1000);\r\n");
      out.write("//                }\r\n");
      out.write("            });\r\n");
      out.write("    })\r\n");
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
