package servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request获取客户端的IP地址、获取请求方式、获取User-Agent，得到客户端信息（操作系统阅览器）。
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "QServlet", urlPatterns = {"/QServlet"})
public class QServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {


        String addr = request.getRemoteAddr();
        System.out.println("IP:" + addr);
        System.out.println("请求方式："+request.getMethod());
        System.out.println("获取User-Agent:"+request.getHeader("User-Agent"));

    }
}

