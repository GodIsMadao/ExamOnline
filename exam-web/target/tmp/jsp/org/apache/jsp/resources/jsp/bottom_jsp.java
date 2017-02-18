package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bottom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"bg-white-only\" style=\"height: 170px\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"bottom-panel\" class=\" col-md-12 col-xs-12\"\r\n");
      out.write("                 style=\"padding-left: 0px;padding-right:0px;margin-bottom:0px;margin-outside:0px\">\r\n");
      out.write("                <div class=\"col-md-offset-1 col-md-4 \" id=\"logopic\" style=\"cursor: pointer\">\r\n");
      out.write("                    <a  href=\"");
      out.print(request.getContextPath());
      out.write("/index\">\r\n");
      out.write("                        <img id=\"logo_pic\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/image/logo_noback.png\"\r\n");
      out.write("                            height=\"100\" width=\"220\" alt=\"logo\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <p class=\"text-muted font-semibold col-md-offset-1 text-capitalize\" id=\"logoword\">\r\n");
      out.write("                            better exam , better life!\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"link\">\r\n");
      out.write("                    <div class=\"col-md-offset-1 col-md-2  col-xs-offset-1 col-xs-2\">\r\n");
      out.write("                        <h3>Company</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/FAQ\">FAQ</a></li>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"http://www.zjut.edu.cn\">ZJUT</a></li>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/login/admin\">管理员登陆</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2 col-xs-2\">\r\n");
      out.write("                        <h3>SOCIAL</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"http://www.facebook.com\">Facebook</a></li>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"http://im.qq.com\">QQ</a></li>\r\n");
      out.write("                            <li class=\"list-unstyled\"><a href=\"http://weibo.com\">Sina微博</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-2 col-xs-2\">\r\n");
      out.write("                        <h3>CONTACT US</h3>\r\n");
      out.write("                    <span id=\"email\">\r\n");
      out.write("                        Send us an email at\r\n");
      out.write("                        <a href=\"mailto:370576322@qq.com\" id=\"emailto\">370576322@qq.com</a>\r\n");
      out.write("                        We'll reply within 24 hours.\r\n");
      out.write("                    </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.rotate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('#logopic').mouseenter(function () {\r\n");
      out.write("            if (!($(this).is(\":animated\"))) {\r\n");
      out.write("                $('#logo_pic').animate({height:\"110px\",width:\"235px\"},500);\r\n");
      out.write("                $('#logoword').css(\"color\", \"black\").fadeTo(900, 0.4).show();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $('#logopic').mouseleave(function () {\r\n");
      out.write("            $('#logo_pic').animate({height:\"100px\",width:\"220px\"},500);\r\n");
      out.write("            $('#logoword').fadeTo(900, 1).css(\"color\", \"#af04ff\");\r\n");
      out.write("        });\r\n");
      out.write("        $('.link ul>li').mouseenter(function () {\r\n");
      out.write("            if (!($(this).is(\":animated\"))) {\r\n");
      out.write("                $(this).fadeTo(500, 0.4).css(\"color\",\"white\");\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("        $('.link ul>li').mouseleave(function () {\r\n");
      out.write("            $(this).fadeTo(500, 1).css(\"color\", \"#ff9b67\");\r\n");
      out.write("        })\r\n");
      out.write("        $('#emailto').mouseenter(function () {\r\n");
      out.write("            $(this).fadeTo(500,0.5).css(\"color\",\"#ffc6f3\");\r\n");
      out.write("        })\r\n");
      out.write("        $('#emailto').mouseleave(function () {\r\n");
      out.write("            $(this).fadeTo(500,1).css(\"color\",\"#7764e6\");\r\n");
      out.write("        })\r\n");
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
