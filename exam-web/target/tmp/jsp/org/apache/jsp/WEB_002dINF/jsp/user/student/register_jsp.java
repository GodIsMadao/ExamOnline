package org.apache.jsp.WEB_002dINF.jsp.user.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>学生注册页面</title>\r\n");
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
      out.write("<div id=\"header\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top_inside.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"col-md-offset-3 col-md-6 text-center panel bg-light\">\r\n");
      out.write("  <form method=\"post\" id=\"StudentRegister\" action=\"\" enctype=\"multipart/form-data\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <fieldset>\r\n");
      out.write("      <legend class=\"bg-light\">就在这里注册啦!</legend>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"susername\">用&nbsp;&nbsp;户&nbsp;&nbsp;名</label><em>*</em>\r\n");
      out.write("        <input id=\"susername\" type=\"text\" autocomplete=\"off\" name=\"username\" placeholder=\"Enter username\" class=\"required\" minlength=\"3\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"password\">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</label><em>*</em>\r\n");
      out.write("        <input id=\"password\" type=\"password\" name=\"password\" placeholder=\"Enter password\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"repassword\">确认密码</label><em>*</em>\r\n");
      out.write("        <input id=\"repassword\" type=\"password\" name=\"confirmPwd\" placeholder=\"Confirm password\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"realname\">真实姓名</label><em>*</em>\r\n");
      out.write("        <input id=\"realname\" type=\"text\" autocomplete=\"off\" name=\"realname\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"sno\">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号</label><em>*</em>\r\n");
      out.write("        <input id=\"sno\" type=\"text\" autocomplete=\"off\" name=\"sno\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"teacher\">教&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;师</label><em>*</em>\r\n");
      out.write("        <select id=\"teacher\" style=\"width: 156px;\" name=\"teacher_name\">\r\n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"email\">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱</label><em>&nbsp;</em>\r\n");
      out.write("        <input id=\"email\" type=\"text\" autocomplete=\"off\" name=\"email\" style=\"padding: 0px\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"school\">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;校</label>\r\n");
      out.write("        <input id=\"school\" type=\"text\" autocomplete=\"off\" name=\"school\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"address\">地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址</label>\r\n");
      out.write("        <input id=\"address\" type=\"text\" autocomplete=\"off\" name=\"address\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <label for=\"pic_path\" style=\"border: 1px solid lemonchiffon;\">---------------上传头像---------------</label>\r\n");
      out.write("        <input type=\"file\" id=\"pic_path\"  class=\"center-block\" style=\"width:206px;border: 1px solid lemonchiffon;\" name=\"myfile\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p>\r\n");
      out.write("        <input type=\"submit\" class=\"btn btn-warning\" value=\"立即注册\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("  </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("    $(\"#StudentRegister\").examvalidate();\r\n");
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
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("          ");
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
