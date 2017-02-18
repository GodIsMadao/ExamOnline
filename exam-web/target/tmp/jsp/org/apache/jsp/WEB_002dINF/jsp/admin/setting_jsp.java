package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("  <title>学生登陆页面</title>\r\n");
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
      out.write("<div class=\"container clearfix\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("    <div class=\"col-lg-9\">\r\n");
      out.write("      <section class=\"panel\">\r\n");
      out.write("        <header class=\"panel-heading bg-success\">\r\n");
      out.write("          <ul class=\"nav nav-tabs\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#profile\">\r\n");
      out.write("                <h6>个人信息</h6>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("          <div class=\"tab-content\">\r\n");
      out.write("            <div id=\"profile\" class=\"tab-pane active\">\r\n");
      out.write("              <form style=\"width:300px\" action=\"");
      out.print(request.getContextPath());
      out.write("/admin/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"updateadmin\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"username\">用户名</label>\r\n");
      out.write("                  <input id=\"username\" class=\"form-control\" type=\"text\" autocomplete=\"off\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\">当前密码</label>\r\n");
      out.write("                  <input id=\"id_password1\"  class=\"form-control\" placeholder=\"当前密码\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\" name=\"current_password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\">新密码</label>\r\n");
      out.write("                  <input id=\"password\" class=\"form-control\" type=\"password\" placeholder=\"新密码\" name=\"password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\">新密码确认</label>\r\n");
      out.write("                  <input id=\"confirmPwd\" class=\"form-control\" type=\"password\" placeholder=\"新密码确认\" name=\"confirmPwd\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_email\">邮箱</label>\r\n");
      out.write("                  <input id=\"id_email\" class=\"form-control\" type=\"email\" value=\"lalalalal@qq.com\" readonly=\"readonly\"\r\n");
      out.write("                         name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn-block btn-success\">\r\n");
      out.write("                  保存个人信息\r\n");
      out.write("                </button>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cms.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("    $(\"#updateadmin\").examvalidate();\r\n");
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
