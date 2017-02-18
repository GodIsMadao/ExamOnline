package org.apache.jsp.WEB_002dINF.jsp.user.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showExamScore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title>成绩单</title>\r\n");
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
      out.write("<div>\r\n");
      out.write("    <div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top_inside.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"resultado\" class=\"container\">\r\n");
      out.write("        <section class=\"panel wrapper-md\">\r\n");
      out.write("            <header class=\"panel-heading text-center bg bg-success\"> 成绩单</header>\r\n");
      out.write("            <div class=\"text-center col-md-12\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score<=60}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        <div class=\"col-md-12\" style=\"font-size: 20px\">\r\n");
              out.write("                            <label class=\"text-muted\" x>要加把劲啦！");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("同学!你的成绩只有这么点儿：</label>\r\n");
              out.write("                            <strong class=\"text-danger\"  >");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</strong><span class=\"text-muted font-semibold\">分(总分100分)</span>\r\n");
              out.write("                        </div>\r\n");
              out.write("                        <div>\r\n");
              out.write("                            <img src=\"");
              out.print(request.getContextPath());
              out.write("/resources/image/fighting1.jpg\" alt=\"加油！\">\r\n");
              out.write("                        </div>\r\n");
              out.write("                    ");
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
          out.write("                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score>60 and studentpaper.score<=80}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        <div class=\"col-md-12\" style=\"font-size: 20px\">\r\n");
              out.write("                            <label class=\"text-muted\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("同学，这次考试成绩马马虎虎嘛：</label>\r\n");
              out.write("                            <strong class=\"text-danger\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</strong><span class=\"text-muted\">分(总分100分)</span>\r\n");
              out.write("                        </div>\r\n");
              out.write("                        <img src=\"");
              out.print(request.getContextPath());
              out.write("/resources/image/fighting2.jpg\" alt=\"加油！\">\r\n");
              out.write("                    ");
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
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score>80 and studentpaper.score<=100}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        <div class=\"col-md-12\" style=\"font-size: 20px\">\r\n");
              out.write("                            <label class=\"text-muted\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("同学！牛！：</label>\r\n");
              out.write("                            <strong class=\"text-danger\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${studentpaper.score}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</strong><span class=\"text-muted\">分(总分100分)</span>\r\n");
              out.write("                        </div>\r\n");
              out.write("                        <img src=\"");
              out.print(request.getContextPath());
              out.write("/resources/image/fighting3.jpg\" alt=\"加油！\">\r\n");
              out.write("                    ");
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
      out.write("            </div>\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/student/infocenter\" class=\"btn btn-success\">返回个人中心</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
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
