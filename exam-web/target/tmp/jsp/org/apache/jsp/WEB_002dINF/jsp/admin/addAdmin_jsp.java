package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>添加管理员页面</title>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/main.css\"/>-->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("        href=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/font.css\"/>\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"panel\" style=\"margin-top: 15px;\">\r\n");
      out.write("  <form method=\"post\" id=\"addadmin\" action=\"");
      out.print(request.getContextPath());
      out.write("/admin/addAdmin\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <legend>添加管理员</legend>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"ausername\">用户名</label><em>*</em>\r\n");
      out.write("        <input id=\"ausername\" type=\"text\" autocomplete=\"off\" name=\"username\" placeholder=\"Enter username\" class=\"required\" minlength=\"3\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"password\">密码</label><em>*</em>\r\n");
      out.write("        <input id=\"password\" type=\"password\" name=\"password\" placeholder=\"Enter password\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"repassword\">确认密码</label><em>*</em>\r\n");
      out.write("        <input id=\"repassword\" type=\"password\" name=\"confirmPwd\" placeholder=\"Confirm password\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"email\">邮箱</label><em>&nbsp;</em>\r\n");
      out.write("        <input id=\"email\" type=\"text\" autocomplete=\"off\" name=\"email\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <input type=\"submit\" class=\"btn btn-warning\" value=\"立即注册\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("  </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cms.validate.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("    $(\"#addadmin\").examvalidate();\r\n");
      out.write("  })\r\n");
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
