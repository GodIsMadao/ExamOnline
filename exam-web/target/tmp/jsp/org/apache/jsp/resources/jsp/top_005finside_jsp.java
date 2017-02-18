package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Student;
import zjut.sy.model.Teacher;
import zjut.sy.model.Admin;

public final class top_005finside_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_choose.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div data-spy=\"scroll\" data-target=\"#header\" class=\"landing\" id=\"home\">\r\n");
      out.write("    <!-- header -->\r\n");
      out.write("    <header id=\"header\" class=\"navbar navbar-fixed-top navbar-inverse affix-top\" data-spy=\"affix\" data-offset-top=\"1\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"col-md-12 col-xs-12\">\r\n");
      out.write("        <a class=\"navbar-brand font-fantasy\" href=\"");
      out.print(request.getContextPath());
      out.write("/index\">E-exam</a>\r\n");
      out.write("\r\n");
      out.write("        <p class=\"navbar-text pull-left text-muted hidden-xs hidden-sm\">\r\n");
      out.write("          <small class=\"text-muted text-sm font-thin\">\r\n");
      out.write("            <em>在线英语考试平台</em>\r\n");
      out.write("          </small>\r\n");
      out.write("        </p>\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#nav\">\r\n");
      out.write("          <i class=\"fa fa-reorder\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"nav\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            ");

              Teacher teacher=(Teacher)session.getAttribute("loginTeacher");
              Student student= (Student) session.getAttribute("loginStudent");
              Admin admin=(Admin)session.getAttribute("loginAdmin");
              if(student!=null){
            
      out.write("\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.picpath ne 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                    <img src=\"");
              out.print(request.getContextPath());
              out.write('/');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.picpath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("                         alt=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"img-circle\" height=\"25\" width=\"25\">\r\n");
              out.write("                  ");
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
          out.write("                  ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.picpath eq 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                    <img src=\"");
              out.print(request.getContextPath());
              out.write("/resources/image/defaut.jpg\"\r\n");
              out.write("                         alt=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"img-circle\" height=\"25\" width=\"25\">\r\n");
              out.write("                  ");
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
          out.write("                ");
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
      out.write("                <span class=\"font-thin color-square\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                <b class=\"caret\"></b>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"dropdown-menu animated fadeInDown\">\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/student/infocenter\" class=\"user\">\r\n");
      out.write("                  个人信息\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/student/updateself/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\" class=\"user\">\r\n");
      out.write("                  设置\r\n");
      out.write("                </a></li>\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\" class=\"user\">\r\n");
      out.write("                  登出\r\n");
      out.write("                </a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");

            }else if(teacher!=null){
            
      out.write("\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_1.setParent(null);
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.pic_path ne 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                    <img src=\"");
              out.print(request.getContextPath());
              out.write('/');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.pic_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"\r\n");
              out.write("                         alt=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"img-circle\" height=\"25\" width=\"25\">\r\n");
              out.write("                  ");
              int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
          out.write("\r\n");
          out.write("                  ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.pic_path eq 'upload/'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                    <img src=\"");
              out.print(request.getContextPath());
              out.write("/resources/image/defaut.jpg\"\r\n");
              out.write("                         alt=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"img-circle\" height=\"25\" width=\"25\">\r\n");
              out.write("                  ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      out.write("\r\n");
      out.write("                <span class=\"font-thin color-square\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                <b class=\"caret\"></b>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"dropdown-menu animated fadeInDown bg-light\">\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/teacher/infocenter\" class=\"user\">\r\n");
      out.write("                  个人信息\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/teacher/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginTeacher.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\" class=\"user\">\r\n");
      out.write("                  设置\r\n");
      out.write("                </a></li>\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\" class=\"user\">\r\n");
      out.write("                  登出\r\n");
      out.write("                </a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");

            }else if(admin!=null){
            
      out.write("\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                <span class=\"font-thin color-square\">管理员:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                <b class=\"caret\"></b>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"dropdown-menu animated fadeInDown bg-light\">\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/infocenter\" class=\"user\">\r\n");
      out.write("                  个人信息\r\n");
      out.write("                </a></li>\r\n");
      out.write("                <li><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginAdmin.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\" class=\"user\">\r\n");
      out.write("                  设置\r\n");
      out.write("                </a></li>\r\n");
      out.write("\r\n");
      out.write("                <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\" class=\"user\">\r\n");
      out.write("                  登出\r\n");
      out.write("                </a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");

              }
            
      out.write("\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/morepaper\">更多试题</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/FAQ\">FAQ</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("  </div>\r\n");
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
