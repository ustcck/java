package servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * servlet接口
 * Created by ustcck on 2016/8/19.
 */
public class AServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()......");

        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));

        Enumeration e = servletConfig.getInitParameterNames();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig()......");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()......");

    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()......");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy()......");

    }
}
