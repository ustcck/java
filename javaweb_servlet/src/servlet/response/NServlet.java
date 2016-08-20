package servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response完成重定向
 * 浏览器会重定向到这里
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "NServlet", urlPatterns = {"/NServlet"})
public class NServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        System.out.println("NServlet");
        System.out.println("320重定向成功");

        PrintWriter pw =  response.getWriter();
        pw.print("<h1>320重定向成功</h1>");
    }
}

