package org.apache.jsp.WEB_002dINF.jsp.user.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exam_005fsituation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("正在考试</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("    <div id=\"top\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top_inside.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container-fluid clearfix \">\r\n");
      out.write("        <div class=\"text-center\" style=\"color:#717171\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"bg-light form-control text-white\">试卷:<span\r\n");
      out.write("                            style=\"color: rgba(255, 65, 0, 0.74)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"bg-light form-control\">出题人：<span\r\n");
      out.write("                            style=\"color: rgba(255, 65, 0, 0.74)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.teacher.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"bg-light form-control\">题目数：<span\r\n");
      out.write("                            style=\"color: rgba(255, 65, 0, 0.74)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.maxQuestion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"bg-light form-control\">规定时间：<span\r\n");
      out.write("                            style=\"color: rgba(255, 65, 0, 0.74)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-7 text-center\" style=\"background-color: #f4ffd1;\">\r\n");
      out.write("            <form method=\"post\"  onsubmit=\"return subform();\" action=\"");
      out.print(request.getContextPath());
      out.write("/paper/exam/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                  id=\"exam_situation\" name=\"exam_situation\" >\r\n");
      out.write("                <table id=\"table1\" class=\"col-md-offset-1 panel col-md-10\">\r\n");
      out.write("                    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <input type=\"submit\" value=\"提交\" class=\"btn btn-success\"   id=\"subform\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"rounded col-md-offset-9\"\r\n");
      out.write("             style=\"position:fixed;height: 450px;background-color: rgba(164, 255, 233, 0.38)\">\r\n");
      out.write("            <div style=\"font-size: 20px;color:rgba(0, 11, 255, 0.51)\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-offset-2\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>考生头像:</label>\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.picpath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                             height=\"70\" width=\"70\" class=\"img-rounded\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>考生名:</label>\r\n");
      out.write("                        <label class=\"text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.realname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label>考生号:</label>\r\n");
      out.write("                        <label class=\"text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginStudent.sno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <label id=\"writen_questions\"></label>\r\n");
      out.write("                        <label>共<span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.maxQuestion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("题</span></label>\r\n");
      out.write("                        <label id=\"left_questions\"></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"count_refresh\" style=\"font-size: 20px;\">\r\n");
      out.write("                        <label style=\"color: rgba(255, 0, 3, 0.51);\">考试计时器：</label>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"time_count\"\r\n");
      out.write("                             style=\"font-size:25px ;width: 200px;height: 50px;border:1px solid blue\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
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
      out.write("            ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    if(!sessionStorage.count");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\r\n");
      out.write("        sessionStorage.count");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("=0;\r\n");
      out.write("    }\r\n");
      out.write("    if (!sessionStorage.entertime");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\r\n");
      out.write("        sessionStorage.entertime");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" = new Date().getTime();\r\n");
      out.write("    }\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    var retime = new Date().getTime();\r\n");
      out.write("    //    alert(retime/1000);\r\n");
      out.write("\r\n");
      out.write("    var time11 = parseInt(retime / 1000 - sessionStorage.entertime");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" / 1000);//单位秒\r\n");
      out.write("    //    alert(\"已经花去\"+time11+\"S\");\r\n");
      out.write("    total =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("*60 - time11;\r\n");
      out.write("\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var timeCounter = function () {\r\n");
      out.write("            $('#table1').find('input').each(function(){\r\n");
      out.write("                if($('input').is('checked')){\r\n");
      out.write("                    sessionStorage.count");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("++;\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            if (!total || total <= 0) {\r\n");
      out.write("            }\r\n");
      out.write("            var s = (total % 60) < 10 ? ('0' + total % 60) : total % 60;\r\n");
      out.write("            var h = (total / 3600) < 10 ? ('0' + parseInt(total / 3600))\r\n");
      out.write("                    : parseInt(total / 3600);\r\n");
      out.write("            var m = (total - h * 3600) / 60 < 10 ? ('0' + parseInt((total - h * 3600) / 60))\r\n");
      out.write("                    : parseInt((total - h * 3600) / 60);\r\n");
      out.write("            document.getElementById(\"time_count\").innerHTML = h + ' : ' + m + ' : ' + s;\r\n");
      out.write("            timerConverse = setTimeout(timeCounter, 1000);\r\n");
      out.write("            total--;\r\n");
      out.write("                if (total < 0) {\r\n");
      out.write("                    clearTimeout(timerConverse);\r\n");
      out.write("                    document.getElementById(\"time_count\").innerHTML = \"00:00:00\";\r\n");
      out.write("                    alert('考试时间已到，您无法继续答卷，点击确定提交试卷。');\r\n");
      out.write("                    document.exam_situation.submit();\r\n");
      out.write("                }\r\n");
      out.write("        }\r\n");
      out.write("        timeCounter();\r\n");
      out.write("    })\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${questions.datas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("question");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                        <tbody style=\"border:1px dotted rgba(127, 32, 60, 0.91)\">\r\n");
          out.write("                        <tr class=\"font-semibold text-white bg-success\" style=\"font-size: 20px;\">\r\n");
          out.write("                            <td>第<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>题</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr style=\"border-bottom: 1px solid gray;\">\r\n");
          out.write("                            <td></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr class=\"text-primary\" style=\"font-size: 19px;border-bottom: 1px solid gray;\">\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\"\r\n");
          out.write("                                       value=\"A\"><span\r\n");
          out.write("                                    style=\"font-size: 17px;color:#000000;\">A:&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\"\r\n");
          out.write("                                       value=\"B\" ><span\r\n");
          out.write("                                    style=\"font-size: 17px;color:#000000;\">B:&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\"\r\n");
          out.write("                                       value=\"C\"><span\r\n");
          out.write("                                    style=\"font-size: 17px;color:#000000;\">C:&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <input type=\"radio\" name=\"questions[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("].answer\" value=\"D\">\r\n");
          out.write("                                <span style=\"font-size: 17px;color:#000000;\">D:&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        </tbody>\r\n");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
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
