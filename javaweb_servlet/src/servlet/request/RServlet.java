package servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request获取请求协议、服务器名称、服务器端口号、项目名称、servlet路径、参数部分、请求URI、请求URL
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "RServlet", urlPatterns = {"/RServlet"})
public class RServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        System.out.println(request.getScheme()); //请求协议：http
        System.out.println(request.getServerName());//服务器名称：localhost
        System.out.println(request.getServerPort());//：服务器端口号：8080
        System.out.println(request.getContextPath()); //  项目名称： /ustcck
        System.out.println(request.getServletPath());//  servlet路径：/RServlet
        System.out.println(request.getQueryString());//参数部分：null
        System.out.println(request.getRequestURI());//  请求URI： /ustcck/RServlet
        System.out.println(request.getRequestURL());// 请求URL： http://localhost:8080/ustcck/RServlet

        response.getWriter().print(request.getScheme() + "<br/>"); //请求协议：http
        response.getWriter().print(request.getServerName() + "<br/>");//服务器名称：localhost
        response.getWriter().print(request.getServerPort() + "<br/>");//：服务器端口号：8080
        response.getWriter().print(request.getContextPath() + "<br/>"); //  项目名称： /ustcck
        response.getWriter().print(request.getServletPath() + "<br/>");//  servlet路径：/RServlet
        response.getWriter().print(request.getQueryString() + "<br/>");//参数部分：null
        response.getWriter().print(request.getRequestURI() + "<br/>");//  请求URI： /ustcck/RServlet
        response.getWriter().print(request.getRequestURL() + "<br/>");// 请求URL： http://localhost:8080/ustcck/RServlet

    }
}

