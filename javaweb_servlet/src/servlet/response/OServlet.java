package servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Refresh定时刷新
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "OServlet", urlPatterns = {"/OServlet"})
public class OServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        PrintWriter pw =  response.getWriter();
        pw.print("<h1>欢迎ustcck登录！5秒钟后之后自动转到主页</h1>");

        response.setHeader("Refresh","5;URL=/ustcck/NServlet");
        response.setStatus(302);


    }
}

