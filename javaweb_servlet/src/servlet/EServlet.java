package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *向ServletContext中保存数据
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "EServlet",urlPatterns = {"/EServlet"})
public class EServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet(E) running");
        ServletContext application = this.getServletContext();
        application.setAttribute("name","张三");
    }
}

