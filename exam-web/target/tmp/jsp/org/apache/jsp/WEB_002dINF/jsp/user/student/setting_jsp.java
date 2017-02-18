package org.apache.jsp.WEB_002dINF.jsp.user.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>学生登陆页面</title>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container clearfix\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("    <div class=\"col-lg-9\">\r\n");
      out.write("      <section class=\"panel\">\r\n");
      out.write("        <header class=\"panel-heading bg-success\">\r\n");
      out.write("          <ul class=\"nav nav-tabs\">\r\n");
      out.write("            <li class=\"active\">\r\n");
      out.write("              <a href=\"#profile\" data-toggle=\"tab\">\r\n");
      out.write("                <h6>个人信息</h6>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("          <div class=\"tab-content\">\r\n");
      out.write("            <div id=\"profile\" class=\"tab-pane active\">\r\n");
      out.write("              <form style=\"width:300px\" id=\"studentSetting\" action=\"");
      out.print(request.getContextPath());
      out.write("/student/updateself/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_username\">用户名</label>\r\n");
      out.write("                  <input id=\"id_username\" class=\"form-control\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                         maxlength=\"16\" name=\"username\" readonly=\"readonly\">\r\n");
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
      out.write("                  <label class=\"control-label\" for=\"id_realname\">姓名</label>\r\n");
      out.write("                  <input id=\"id_realname\" class=\"form-control\" name=\"realname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_email\">邮箱</label>\r\n");
      out.write("                  <input id=\"id_email\" class=\"form-control\" type=\"email\"\r\n");
      out.write("                         name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_school\">学校</label>\r\n");
      out.write("                  <input id=\"id_school\" class=\"form-control\" name=\"school\" type=\"text\" value=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_teacher\">老师</label>\r\n");
      out.write("                  <select id=\"id_teacher\" class=\"form-control\" name=\"teacher_name\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_address\" >地址</label>\r\n");
      out.write("                  <input id=\"id_address\" class=\"form-control\" type=\"text\" name=\"address\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label class=\"control-label\" for=\"id_head\" >头像</label>\r\n");
      out.write("                  <input id=\"id_head\" class=\"form-control\" type=\"file\" name=\"myfile\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-block btn-success\" value=\"保存个人信息\">\r\n");
      out.write("                </input>\r\n");
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
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cms.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("    $(\"#studentSetting\").examvalidate();\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teachers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("teacher");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                      <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
