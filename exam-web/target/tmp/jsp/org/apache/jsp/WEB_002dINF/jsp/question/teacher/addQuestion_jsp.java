package org.apache.jsp.WEB_002dINF.jsp.question.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Exampaper;

public final class addQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_end_begin.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>添加试题</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/font.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    Exampaper paper = (Exampaper) session.getAttribute("newpaper");
    pageContext.setAttribute("p1", paper);

      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top_inside.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"\">\r\n");
      out.write("    <form method=\"post\" id=\"form1\" action=\"\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <input  type=\"submit\" id=\"send\" class=\"pull-right-lg btn btn-success\" value=\"提&nbsp;&nbsp;&nbsp;交\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/json2.js\"></script>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p1.maxQuestion}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("            ");
          out.write("\r\n");
          out.write("            <fieldset id=\"field\" >\r\n");
          out.write("                <legend class=\"text-center\"><span>第");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("题</span></legend>\r\n");
          out.write("                <div class=\"col-md-offset-4\">\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label for=\"qcontent\">题干</label><em>*</em>\r\n");
          out.write("                    <textarea id=\"qcontent\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].content\"  placeholder=\"Enter content\" class=\"required\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label for=\"qchoice1\">A:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>\r\n");
          out.write("                    <textarea id=\"qchoice1\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].choice1\" placeholder=\"Enter choice1's content\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label for=\"qchoice2\">B:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>\r\n");
          out.write("                    <textarea id=\"qchoice2\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].choice2\" placeholder=\"Enter choice2's content\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label for=\"qchoice3\">C:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>\r\n");
          out.write("                    <textarea id=\"qchoice3\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].choice3\" placeholder=\"Enter choice3's content\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label for=\"qchoice4\">D:</label><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em>\r\n");
          out.write("                    <textarea id=\"qchoice4\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].choice4\" placeholder=\"Enter choice4's content\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("\r\n");
          out.write("                <p>\r\n");
          out.write("                    <label>答案:</label><em>*</em>\r\n");
          out.write("                        <label>A:</label><input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\" value=\"A\"><em>&nbsp;&nbsp;</em>\r\n");
          out.write("                        <label>B:</label><input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\" value=\"B\"><em>&nbsp;&nbsp;</em>\r\n");
          out.write("                        <label>C:</label><input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\" value=\"C\"><em>&nbsp;&nbsp;</em>\r\n");
          out.write("                        <label>D:</label><input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\" value=\"D\"><em>&nbsp;&nbsp;</em>\r\n");
          out.write("                </p>\r\n");
          out.write("                <p >\r\n");
          out.write("                    <label for=\"idcomment\">解析:</label><em>&nbsp;</em>\r\n");
          out.write("                    <textarea id=\"idcomment\" cols=\"50\" autocomplete=\"off\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].comment\" placeholder=\"Enter comment\"></textarea>\r\n");
          out.write("                </p>\r\n");
          out.write("                </div>\r\n");
          out.write("            </fieldset>\r\n");
          out.write("        ");
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
      _jspx_tagPool_c_forEach_varStatus_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
