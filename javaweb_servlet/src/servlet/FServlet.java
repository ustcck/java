package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示从ServletContext中获取数据
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "FServlet", urlPatterns = {"/FServlet"})
public class FServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet(F) running");
        ServletContext application = this.getServletContext();
        String name = (String) application.getAttribute("name");
        System.out.println(name);
    }
}

