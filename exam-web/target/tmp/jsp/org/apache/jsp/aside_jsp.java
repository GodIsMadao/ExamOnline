package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.model.Teacher;
import zjut.sy.model.Student;
import zjut.sy.model.Admin;

public final class aside_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"banner\" style=\"width:300px;height: auto\">\r\n");
      out.write("  <div class=\"panel\" style=\"margin-top:15px \">\r\n");
      out.write("    ");

      Teacher t= (Teacher) session.getAttribute("loginTeacher");
      Student s=(Student)session.getAttribute("loginStudent");
      Admin a=(Admin)session.getAttribute("loginAdmin");
      pageContext.setAttribute("t1",t);
      pageContext.setAttribute("s1",s);
      pageContext.setAttribute("a1",a);
    
      out.write("\r\n");
      out.write("  <div class=\"panel-body\">\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title \" style=\"cursor:pointer\">\r\n");
      out.write("      <a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/welcome')\">欢迎</a>\r\n");
      out.write("    </h3>\r\n");
      out.write("  </ul>\r\n");
      out.write("  ");

    if(s!=null){
  
      out.write("\r\n");
      out.write("  <ul class=\"columnMenu selected\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>试卷</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/student/papers/writen')\">已做试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/student/papers/unwriten')\">待做试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a target=\"_blank\" href=\"");
      out.print(request.getContextPath());
      out.write("/student/listScore/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">历次得分走向</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span class=\"text-success\">问题</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/question/student/questions/writen')\">已做问题</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/question/student/questions/right')\">已做对问题</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/question/student/questions/wrong')\">错题集</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>个人信息</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/student/setting')\">更新个人信息</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/student/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\">查看个人信息</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"colmnMenu\">\r\n");
      out.write("    <h3><a href=\"#\">私信</a></h3>\r\n");
      out.write("  </ul>\r\n");
      out.write("  ");

    }else if(t!=null){
  
      out.write("\r\n");
      out.write("  <ul class=\"columnMenu selected\">\r\n");
      out.write("    <h3 class=\"column-title\">\r\n");
      out.write("      <span>试卷</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/showReleasedPaper')\">已发布试卷</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/showUnReleasedPaper')\">待发布试卷</a><br></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/showUnpassPaper')\">审核未通过试卷</a><br></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/paper/add')\">新增试卷</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\">\r\n");
      out.write("      <span>学生</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/student/students')\">学生列表</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"#\">平均分排名学生列表</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"columnMenu\">\r\n");
      out.write("    <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("      <span>个人信息</span>\r\n");
      out.write("    </h3>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/teacher/setting')\">更新个人信息</a></li>\r\n");
      out.write("    <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/teacher/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\">查看个人信息</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"colmnMenu\">\r\n");
      out.write("    <h3><a href=\"#\">私信</a></h3>\r\n");
      out.write("  </ul>\r\n");
      out.write("  ");

    }else if(a!=null){
  
      out.write("\r\n");
      out.write("    <ul class=\"columnMenu selected\">\r\n");
      out.write("      <h3 class=\"column-title\">\r\n");
      out.write("        <span>用户管理</span>\r\n");
      out.write("      </h3>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/teacher/list')\">教师列表</a></li>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/student/list')\">学生列表</a><br></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"columnMenu\">\r\n");
      out.write("      <h3 class=\"column-title\">\r\n");
      out.write("        <span>试卷管理</span>\r\n");
      out.write("      </h3>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/paper/showUncheck')\">待审核试卷</a></li>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/paper/showChecked')\">已审核试卷</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"columnMenu\">\r\n");
      out.write("      <h3 class=\"column-title\" style=\"cursor:pointer\">\r\n");
      out.write("        <span>管理员信息</span>\r\n");
      out.write("      </h3>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\">查看个人信息</a></li>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/setting')\">更新个人信息</a></li>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/showAdmins')\">管理员列表</a></li>\r\n");
      out.write("      <li class=\"column\"><a href=\"javascript:void(0)\" onclick=\"$('#content').load('");
      out.print(request.getContextPath());
      out.write("/admin/addAdmin')\">添加管理员</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  ");

    }
  
      out.write("\r\n");
      out.write("  </div>\r\n");
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
