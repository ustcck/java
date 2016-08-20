package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 网站访问量统计
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "IServlet", urlPatterns = {"/IServlet"})
public class IServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet(I) running");

        ServletContext application = this.getServletContext();
        Integer count = (Integer) application.getAttribute("count");

        if (count == null) {
            application.setAttribute("count", 1);
        } else {
            application.setAttribute("count", count + 1);
        }

        System.out.println();

        PrintWriter pw =  response.getWriter();
        pw.print("<h1>"+count+"</h1>");

    }
}

