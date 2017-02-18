package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import zjut.sy.basic.model.SystemContext;

public final class pager1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_first;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_pages;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_prev;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_pager_url_maxPageItems_items_export;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_next;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_param_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_pg_last;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_pg_first = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_pages = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_prev = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_pager_url_maxPageItems_items_export = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_next = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_param_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_pg_last = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_pg_first.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_pg_pages.release();
    _jspx_tagPool_pg_prev.release();
    _jspx_tagPool_pg_pager_url_maxPageItems_items_export.release();
    _jspx_tagPool_pg_next.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_pg_param_name_nobody.release();
    _jspx_tagPool_pg_last.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  pg:pager
      com.jsptags.navigation.pager.PagerTag _jspx_th_pg_pager_0 = (com.jsptags.navigation.pager.PagerTag) _jspx_tagPool_pg_pager_url_maxPageItems_items_export.get(com.jsptags.navigation.pager.PagerTag.class);
      _jspx_th_pg_pager_0.setPageContext(_jspx_page_context);
      _jspx_th_pg_pager_0.setParent(null);
      _jspx_th_pg_pager_0.setExport("curPage=pageNumber");
      _jspx_th_pg_pager_0.setItems(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.totalRecord }", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
      _jspx_th_pg_pager_0.setMaxPageItems(SystemContext.getPageSize() );
      _jspx_th_pg_pager_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.url }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int _jspx_eval_pg_pager_0 = _jspx_th_pg_pager_0.doStartTag();
      if (_jspx_eval_pg_pager_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer curPage = null;
        curPage = (java.lang.Integer) _jspx_page_context.findAttribute("curPage");
        do {
          out.write("\r\n");
          out.write("  <span style=\"float:right;padding:6px;\">\r\n");
          out.write("  共\r\n");
          out.write("  ");
          //  pg:last
          com.jsptags.navigation.pager.LastTag _jspx_th_pg_last_0 = (com.jsptags.navigation.pager.LastTag) _jspx_tagPool_pg_last.get(com.jsptags.navigation.pager.LastTag.class);
          _jspx_th_pg_last_0.setPageContext(_jspx_page_context);
          _jspx_th_pg_last_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_last_0 = _jspx_th_pg_last_0.doStartTag();
          if (_jspx_eval_pg_last_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write(" 页[");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.totalRecord }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("条记录],每页显示");
              out.print(SystemContext.getPageSize() );
              out.write("条,\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_last_0.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_pg_last_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_last.reuse(_jspx_th_pg_last_0);
            return;
          }
          _jspx_tagPool_pg_last.reuse(_jspx_th_pg_last_0);
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_pg_pager_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
          //  pg:first
          com.jsptags.navigation.pager.FirstTag _jspx_th_pg_first_0 = (com.jsptags.navigation.pager.FirstTag) _jspx_tagPool_pg_first.get(com.jsptags.navigation.pager.FirstTag.class);
          _jspx_th_pg_first_0.setPageContext(_jspx_page_context);
          _jspx_th_pg_first_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_first_0 = _jspx_th_pg_first_0.doStartTag();
          if (_jspx_eval_pg_first_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    <a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"pager_link\">首页</a>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_first_0.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_pg_first_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_first.reuse(_jspx_th_pg_first_0);
            return;
          }
          _jspx_tagPool_pg_first.reuse(_jspx_th_pg_first_0);
          out.write("\r\n");
          out.write("  ");
          //  pg:prev
          com.jsptags.navigation.pager.PrevTag _jspx_th_pg_prev_0 = (com.jsptags.navigation.pager.PrevTag) _jspx_tagPool_pg_prev.get(com.jsptags.navigation.pager.PrevTag.class);
          _jspx_th_pg_prev_0.setPageContext(_jspx_page_context);
          _jspx_th_pg_prev_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_prev_0 = _jspx_th_pg_prev_0.doStartTag();
          if (_jspx_eval_pg_prev_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    <a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"pager_link\">上一页</a>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_prev_0.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_pg_prev_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_prev.reuse(_jspx_th_pg_prev_0);
            return;
          }
          _jspx_tagPool_pg_prev.reuse(_jspx_th_pg_prev_0);
          out.write("\r\n");
          out.write("  ");
          //  pg:pages
          com.jsptags.navigation.pager.PagesTag _jspx_th_pg_pages_0 = (com.jsptags.navigation.pager.PagesTag) _jspx_tagPool_pg_pages.get(com.jsptags.navigation.pager.PagesTag.class);
          _jspx_th_pg_pages_0.setPageContext(_jspx_page_context);
          _jspx_th_pg_pages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_pages_0 = _jspx_th_pg_pages_0.doStartTag();
          if (_jspx_eval_pg_pages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            if (_jspx_eval_pg_pages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_pg_pages_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_pg_pages_0.doInitBody();
            }
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_pg_pages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    ");
              if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_pg_pages_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_pages_0.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_pg_pages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_pg_pages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_pages.reuse(_jspx_th_pg_pages_0);
            return;
          }
          _jspx_tagPool_pg_pages.reuse(_jspx_th_pg_pages_0);
          out.write("\r\n");
          out.write("  ");
          //  pg:next
          com.jsptags.navigation.pager.NextTag _jspx_th_pg_next_0 = (com.jsptags.navigation.pager.NextTag) _jspx_tagPool_pg_next.get(com.jsptags.navigation.pager.NextTag.class);
          _jspx_th_pg_next_0.setPageContext(_jspx_page_context);
          _jspx_th_pg_next_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_next_0 = _jspx_th_pg_next_0.doStartTag();
          if (_jspx_eval_pg_next_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    <a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"pager_link\">下一页</a>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_next_0.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_pg_next_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_next.reuse(_jspx_th_pg_next_0);
            return;
          }
          _jspx_tagPool_pg_next.reuse(_jspx_th_pg_next_0);
          out.write("\r\n");
          out.write("  ");
          //  pg:last
          com.jsptags.navigation.pager.LastTag _jspx_th_pg_last_1 = (com.jsptags.navigation.pager.LastTag) _jspx_tagPool_pg_last.get(com.jsptags.navigation.pager.LastTag.class);
          _jspx_th_pg_last_1.setPageContext(_jspx_page_context);
          _jspx_th_pg_last_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
          int _jspx_eval_pg_last_1 = _jspx_th_pg_last_1.doStartTag();
          if (_jspx_eval_pg_last_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String pageUrl = null;
            java.lang.Integer pageNumber = null;
            pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
            pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
            do {
              out.write("\r\n");
              out.write("    <a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" class=\"pager_link\">尾页</a>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_pg_last_1.doAfterBody();
              pageUrl = (java.lang.String) _jspx_page_context.findAttribute("pageUrl");
              pageNumber = (java.lang.Integer) _jspx_page_context.findAttribute("pageNumber");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_pg_last_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_pg_last.reuse(_jspx_th_pg_last_1);
            return;
          }
          _jspx_tagPool_pg_last.reuse(_jspx_th_pg_last_1);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_pg_pager_0.doAfterBody();
          curPage = (java.lang.Integer) _jspx_page_context.findAttribute("curPage");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_pg_pager_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_pg_pager_url_maxPageItems_items_export.reuse(_jspx_th_pg_pager_0);
        return;
      }
      _jspx_tagPool_pg_pager_url_maxPageItems_items_export.reuse(_jspx_th_pg_pager_0);
      out.write("\r\n");
      out.write("</span>");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pg_pager_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pager_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.params }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_pg_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("  ");
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

  private boolean _jspx_meth_pg_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pg:param
    com.jsptags.navigation.pager.ParamTag _jspx_th_pg_param_0 = (com.jsptags.navigation.pager.ParamTag) _jspx_tagPool_pg_param_name_nobody.get(com.jsptags.navigation.pager.ParamTag.class);
    _jspx_th_pg_param_0.setPageContext(_jspx_page_context);
    _jspx_th_pg_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_pg_param_0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_pg_param_0 = _jspx_th_pg_param_0.doStartTag();
    if (_jspx_th_pg_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_pg_param_name_nobody.reuse(_jspx_th_pg_param_0);
      return true;
    }
    _jspx_tagPool_pg_param_name_nobody.reuse(_jspx_th_pg_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_pg_pages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pages_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curPage eq pageNumber }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      [");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("]\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_pg_pages_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_pg_pages_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curPage != pageNumber }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"pager_link\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
