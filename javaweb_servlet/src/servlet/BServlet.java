package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 *
 * Created by ustcck on 2016/8/19.
 */
public class BServlet extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("哈哈哈——我来也");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("destroy()......");
    }
}
