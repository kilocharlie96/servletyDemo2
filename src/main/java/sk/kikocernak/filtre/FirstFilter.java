package sk.kikocernak.filtre;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/*"},
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
        PrintWriter out = servletResponse.getWriter();
//        out.println("Stránka nefunguje");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        req.getSession().setAttribute("filterAttribute", "presiel som cez first filter");
//        filterChain.doFilter(req, servletResponse);


        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        out.println("Ahoj z filtru");
        req.getRequestDispatcher("").include(req, servletResponse);
        out.println("Dovidenia z filtru");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
