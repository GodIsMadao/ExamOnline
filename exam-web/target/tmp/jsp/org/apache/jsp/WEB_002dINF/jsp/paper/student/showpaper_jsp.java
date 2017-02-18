package org.apache.jsp.WEB_002dINF.jsp.paper.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.service.IPaperService;
import zjut.sy.service.IQuestionService;
import zjut.sy.model.StudentQuestion;

public final class showpaper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title></title>\r\n");
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
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/jsp/top_inside.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-12 text-center panel\">\r\n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("        <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.tag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("        <h5>所需时间：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("        <h5>题量：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paper.maxQuestion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-8 panel\"  id=\"content\">\r\n");
      out.write("        <span style=\"font-style: italic;font-weight: bolder;color:rgba(128, 0, 255, 0.39)\">你的答案：</span>\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-3 col-md-offset-1  panel\" style=\"height:auto; border:1px solid red\">\r\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath());
      out.write("/index\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/image/logo_panel.jpg\" height=\"110\" width=\"270\"></a>\r\n");
      out.write("        <span>（考试时）剩余时间，考生信息</span>\r\n");
      out.write("        <span>（老师查看时，显示试卷有多少学生写过，正确率如何）</span>\r\n");
      out.write("        <div id=\"charts\" class=\"center-block\" style=\"height: 300px;width:250px;\"></div>\r\n");
      out.write("        <span>（学生查看时，显示试卷的正确题数与错误题数比例图）</span>\r\n");
      out.write("        <span>（老师预览时），好像没什么好显示的了，<strong class=\"label-danger text-success\">贴贴广告也好</strong></span>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/resources/js/unfold.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/highcharts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#content\").find(\"h5\").each(function () {\r\n");
      out.write("                $(this).click(function () {\r\n");
      out.write("                    $(this).nextAll().slideToggle();\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        $(function () {\r\n");
      out.write("            var chart;\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                // Build the chart\r\n");
      out.write("                $('#charts').highcharts({\r\n");
      out.write("                    chart: {\r\n");
      out.write("                        plotBackgroundColor: null,\r\n");
      out.write("                        plotBorderWidth: null,\r\n");
      out.write("                        plotShadow: false\r\n");
      out.write("                    },\r\n");
      out.write("                    title: {\r\n");
      out.write("                        text: ''\r\n");
      out.write("                    },\r\n");
      out.write("                    tooltip: {\r\n");
      out.write("//                        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'\r\n");
      out.write("                        formatter: function () {\r\n");
      out.write("                            return '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1) + '% (' +\r\n");
      out.write("                                    Highcharts.numberFormat(this.y *");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" / 100, 0, ',') + ' 题)';\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    plotOptions: {\r\n");
      out.write("                        pie: {\r\n");
      out.write("                            allowPointSelect: true,\r\n");
      out.write("                            cursor: 'pointer',\r\n");
      out.write("                            dataLabels: {\r\n");
      out.write("                                enabled: false\r\n");
      out.write("                            },\r\n");
      out.write("                            showInLegend: true\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    series: [{\r\n");
      out.write("                        type: 'pie',\r\n");
      out.write("                        name: 'Currect Proportion',\r\n");
      out.write("                        data: [\r\n");
      out.write("                            ['Right', ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${right}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("],\r\n");
      out.write("                            ['Wrong', ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wrong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("]\r\n");
      out.write("                        ]\r\n");
      out.write("                    }]\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${answers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("answers");
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
          out.write("            <label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(":<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${answers}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></label>\r\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${questions}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("question");
    _jspx_th_c_forEach_1.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("            <div style=\"border-top: 1px dashed darkgrey;border-bottom:1px double rgba(255, 0, 150, 0.15);\">\r\n");
          out.write("            <div>\r\n");
          out.write("                <label>第<span class=\"text-danger\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>题:</label><br>\r\n");
          out.write("                <label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label><br>\r\n");
          out.write("                <label>A:<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></label>\r\n");
          out.write("                <label>B:<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></label>\r\n");
          out.write("                <label>C:<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></label>\r\n");
          out.write("                <label>D:<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.choice4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></label>\r\n");
          out.write("            </div>\r\n");
          out.write("            <div id=\"answer\">\r\n");
          out.write("                <h5 style=\"cursor:pointer\">\r\n");
          out.write("                    <span style=\"color:rgba(255, 0, 3, 0.66)\" class=\"btn btn-default\">答案解析</span>\r\n");
          out.write("                </h5>\r\n");
          out.write("                <ul class=\"list-unstyled \" id=\"comment\">\r\n");
          out.write("                    <li>正确答案:<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.answer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></li>\r\n");
          out.write("                    <li>解析如下:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${question.comment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\r\n");
          out.write("                </ul>\r\n");
          out.write("            </div>\r\n");
          out.write("            </div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vs.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
