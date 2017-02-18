package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Student;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("    <div data-spy=\"scroll\" data-target=\"#header\" class=\"landing\" id=\"home\">\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <header id=\"header\" class=\"navbar navbar-fixed-top bg-white affix-top\" data-spy=\"affix\" data-offset-top=\"1\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand font-fantasy\" href=\"#header\">E-exam</a>\r\n");
      out.write("\r\n");
      out.write("                <p class=\"navbar-text pull-left text-muted hidden-xs hidden-sm\">\r\n");
      out.write("                    <small class=\"text-muted text-sm font-thin\">\r\n");
      out.write("                        <em>在线英语考试平台</em>\r\n");
      out.write("                    </small>\r\n");
      out.write("                </p>\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#nav\">\r\n");
      out.write("                    <i class=\"fa fa-reorder\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"nav\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        ");

                            Student student= (Student) session.getAttribute("loginStudent");
                            if(student!=null){
                        
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/image/flag.jpg\"\r\n");
      out.write("                                     alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginUser.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-circle\" height=\"25\" width=\"25\">\r\n");
      out.write("                                <span>[");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginUser.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("]</span>\r\n");
      out.write("                                <b class=\"caret\"></b>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu animated fadeInDown\">\r\n");
      out.write("\r\n");
      out.write("                                <li><a href=\"#\" class=\"user\">\r\n");
      out.write("                                    个人信息\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                                <li><a href=\"#\" class=\"user\">\r\n");
      out.write("                                    设置\r\n");
      out.write("                                </a></li>\r\n");
      out.write("\r\n");
      out.write("                                <li><a href=\"#\" class=\"user\">\r\n");
      out.write("                                    登出\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                            }else{
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/register\">注册</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/login\">登入</a></li>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"#\">更多试题</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/FAQ\">FAQ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
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
