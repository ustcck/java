package servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * response完成重定向
 * 用户请求MServlet，然后MServlet响应302，给出Location头
 *
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "MServlet", urlPatterns = {"/MServlet"})
public class MServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        System.out.println("MServlet");

        /*
        *重定向
        * 1. 设置Location
        * 2. 发送302状态码
        *
        */

        response.setHeader("Location","/ustcck/NServlet");
        response.setStatus(302);



        /*
        * 快捷的重定向方法
        */

        //response.sendRedirect("http://www.baidu.com");
    }
}

