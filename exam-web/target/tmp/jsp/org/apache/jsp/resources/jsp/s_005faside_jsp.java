package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Teacher;
import zjut.sy.model.Student;

public final class s_005faside_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"banner\" style=\"width:300px\">\r\n");
      out.write("  <ul class=\"columnMenu selected\">\r\n");
      out.write("    ");

      Teacher t= (Teacher) session.getAttribute("loginTeacher");
      Student s=(Student)session.getAttribute("loginStudent");
      if(s!=null){
    
      out.write("\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>试卷</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">已做试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">待做试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">历次得分走向</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>问题</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">已做问题</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">错题集</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  ");

    }else if(t!=null){
  
      out.write("\r\n");
      out.write("  <ul class=\"columnMenu selected\">\r\n");
      out.write("    <h3 class=\"column-title\">\r\n");
      out.write("      <span>试卷</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">已发布试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a herf=\"#\">待发布试卷</a><br></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">审核未通过试卷</a><br></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">新增试卷</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\">\r\n");
      out.write("      <span>学生</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">学生列表</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">平均分排名学生列表</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  ");

    }
  
      out.write("\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>个人信息</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">更新个人信息</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"colmnMenu\">\r\n");
      out.write("    <h3><a href=\"#\">私信</a></h3>\r\n");
      out.write("  </ul>\r\n");
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
