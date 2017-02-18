package org.apache.jsp.WEB_002dINF.jsp.user.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Teacher;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>教师可以给学生看的信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid panel\" id=\"show\" style=\"margin-top: 15px\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <div id=\"pic\" style=\"position: relative;\">\r\n");
      out.write("            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <a href=\"javascript:void(0)\" onmouseover=\"$('#setting').css('display','block')\"\r\n");
          out.write("               onmouseout=\"$('#setting').css('display','none')\"\r\n");
          out.write("               onclick=\"$('#content').load('");
          out.print(request.getContextPath());
          out.write("/teacher/update/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">\r\n");
          out.write("                <div>\r\n");
          out.write("                    ");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
          _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
          if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_when_0.setPageContext(_jspx_page_context);
              _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
              _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.pic_path eq 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
              int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
              if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                            <img src=\"");
                  out.print(request.getContextPath());
                  out.write("/resources/image/defaut.jpg\" class=\"img-circle\"\r\n");
                  out.write("                                 height=\"90\"\r\n");
                  out.write("                                 width=\"90\" alt=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\r\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
                return;
              }
              _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
              out.write("\r\n");
              out.write("                        ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_when_1.setPageContext(_jspx_page_context);
              _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
              _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.pic_path ne 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
              int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
              if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                            <img src=\"");
                  out.print(request.getContextPath());
                  out.write('/');
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.pic_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" class=\"img-circle\" height=\"90\"\r\n");
                  out.write("                                 width=\"90\" alt=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\r\n");
                  out.write("                        ");
                  int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
                return;
              }
              _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
              out.write("\r\n");
              out.write("                    ");
              int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
            return;
          }
          _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
          out.write("\r\n");
          out.write("                </div>\r\n");
          out.write("                <div id=\"setting\"\r\n");
          out.write("                     style=\"position: absolute;z-indent:2;left:0;top:0;padding:30px 15px;text-shadow:#fff 1px 0 0,#fff 0 1px 0,#fff -1px 0 0,#fff 0 -1px 0;font-weight: bolder;display: none;font-size: 16px;\">\r\n");
          out.write("                    编辑资料\r\n");
          out.write("                </div>\r\n");
          out.write("            </a>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

        Teacher teacher = (Teacher) session.getAttribute("loginTeacher");
        if (teacher != null) {
    
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary\" style=\"font-size: large\">用户名:</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary\" style=\"font-size: large\">地址:</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary\" style=\"font-size: large\">姓名</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary\" style=\"font-size: large\">学校:</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.school}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary \" style=\"font-size: large\">邮箱:</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <label class=\"text-primary \" style=\"font-size: large\">联系方式:</label>\r\n");
      out.write("        <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${teacher.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("    </div>\r\n");
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
