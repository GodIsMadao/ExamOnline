package org.apache.jsp.WEB_002dINF.jsp.other;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FAQ_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title>FAQ</title>\r\n");
      out.write("    <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\"/>-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/font.css\"/>\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container panel\"  style=\"margin-top: 100px;\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h1 class=\"faq-header col-md-12\">Frequently asked questions</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div  class=\"col-md-12\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>bulabula</dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>bulabula</dt><dd>\r\n");
      out.write("        <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("    </dd>\r\n");
      out.write("        <dt>bulabula</dt><dd>\r\n");
      out.write("        <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("    </dd>\r\n");
      out.write("        <dt>bulabula</dt><dd>\r\n");
      out.write("        <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("    </dd>\r\n");
      out.write("        <dt>bulabula</dt><dd>\r\n");
      out.write("        <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("    </dd>\r\n");
      out.write("        <dt>bulabula</dt><dd>\r\n");
      out.write("        <h4 class=\"faq-content-title\">Question1:what ....</h4>\r\n");
      out.write("    </dd>\r\n");
      out.write("        <dt>bulabula</dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <h4 class=\"faq-content-title\">Question2:why ...</h4>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>bulabula</dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <h4 class=\"faq-content-title\">Question3:why ...</h4>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>bulabula</dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <h4 class=\"faq-content-title\">Question4:why ...</h4>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>bulabula</dt>\r\n");
      out.write("    </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("    <div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/bottom.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/slidershow.js\"></script>\r\n");
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
