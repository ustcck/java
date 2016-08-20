package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示从ServletContext中获取资源路径
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "HServlet", urlPatterns = {"/HServlet"}, initParams = @WebInitParam(name = "who", value = "ustcck"))
public class HServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet(H) running");

        String path = this.getServletContext().getRealPath("/index.jsp");
        System.out.println(path);


    }
}

