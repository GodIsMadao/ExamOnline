package org.apache.jsp.WEB_002dINF.jsp.paper.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resubmit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid clearfix\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("    <div class=\"col-md-12\">\r\n");
      out.write("      <section class=\"panel\">\r\n");
      out.write("        <header class=\"panel-heading bg-success\">\r\n");
      out.write("          <ul class=\"nav nav-tabs\">\r\n");
      out.write("            <li class=\"active\">\r\n");
      out.write("              <a href=\"#profile\" data-toggle=\"tab\">\r\n");
      out.write("                <h6>试卷基本信息</h6>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("          <div class=\"tab-content\">\r\n");
      out.write("            <div id=\"profile\" class=\"tab-pane active\">\r\n");
      out.write("              <form style=\"width:300px\" action=\"");
      out.print(request.getContextPath());
      out.write("/paper/updatepaper/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${unpasspaper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" target=\"_self\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_pname\">试卷名</label>\r\n");
      out.write("                  <input id=\"id_pname\" class=\"form-control\" type=\"text\"\r\n");
      out.write("                         placeholder=\"Enter exampaper's name\" name=\"pname\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_tag\">试卷简介</label>\r\n");
      out.write("                  <input id=\"id_tag\" class=\"form-control\" type=\"text\" maxlength=\"16\"\r\n");
      out.write("                         placeholder=\"Enter introduction of exampaper\" name=\"tag\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_time\">考试时间</label>\r\n");
      out.write("                  <input id=\"id_time\" class=\"form-control\" type=\"text\" placeholder=\"minutes\"\r\n");
      out.write("                         name=\"time\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_maxquestion\">题量</label>\r\n");
      out.write("                  <input id=\"id_maxquestion\" class=\"form-control\" step=\"5\" type=\"number\" name=\"maxQuestion\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-block btn-success\" value=\"重新提交\" />\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
