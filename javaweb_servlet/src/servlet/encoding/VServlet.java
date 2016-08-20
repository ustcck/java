package servlet.encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 响应编码问题
 * 想不乱码，在getWriter()方法之前，调用response.setContentType("text/html;charset=utf-8");
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "VServlet", urlPatterns = {"/VServlet"})
public class VServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        response.setContentType("text/html;charset=utf-8");
        //等价于上面一句代码response.setHeader("Content-Type","text/html;charset=utf-8");
        //上面一句包含了response.setCharacterEncoding("utf-8");

        response.getWriter().print("你好啊！");

        //想不乱码，在getWriter()方法之前，调用response.setContentType("text/html;charset=utf-8");


    }
}

