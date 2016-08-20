package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 演示从ServletContext中获取公共的初始化参数
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "GServlet", urlPatterns = {"/GServlet"}, initParams = @WebInitParam(name = "who", value = "ustcck"))
public class GServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet(G) running");

        ServletContext application = this.getServletContext();
        String value = application.getInitParameter("context-params");
        Enumeration<String> names = application.getInitParameterNames();
        System.out.println(value);
        while (names.hasMoreElements()) {
            String s =  names.nextElement();
            System.out.println(s);
        }

    }
}

