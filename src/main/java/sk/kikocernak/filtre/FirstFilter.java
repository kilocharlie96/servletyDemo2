package sk.kikocernak.filtre;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
@WebFilter(urlPatterns = "/*",
        filterName = "FirstFilter name",
        initParams = {@WebInitParam(name = "meno", value = "Kikusko Cernak")})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Som vo filtri");
        System.out.println(filterConfig.getFilterName());
        System.out.println(filterConfig.getInitParameter("meno"));
        filterConfig.getServletContext().setAttribute("filter", "First filter context upraveny");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
