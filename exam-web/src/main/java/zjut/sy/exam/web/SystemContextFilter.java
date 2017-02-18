package zjut.sy.exam.web;

import zjut.sy.basic.model.SystemContext;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by dell on 2016/4/11.
 */
public class SystemContextFilter implements Filter {
    private Integer pageSize;
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        Integer offset = 0;
        try {
            offset = Integer.parseInt(req.getParameter("pager.offset"));
        } catch (NumberFormatException e) {}
        try {
            SystemContext.setOrder(req.getParameter("order"));
            SystemContext.setSort(req.getParameter("sort"));
            SystemContext.setPageOffset(offset);
            SystemContext.setPageSize(pageSize);
            chain.doFilter(req,resp);
        } finally {
            SystemContext.removeOrder();
            SystemContext.removeSort();
            SystemContext.removePageOffset();
            SystemContext.removePageSize();
        }
    }

    @Override
    public void init(FilterConfig cfg) throws ServletException {
        try {
            pageSize = Integer.parseInt(cfg.getInitParameter("pageSize"));
        } catch (NumberFormatException e) {
            pageSize = 10;
        }
    }

}
