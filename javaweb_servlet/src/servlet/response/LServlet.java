package servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * response的响应头相关的方法
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "LServlet", urlPatterns = {"/LServlet"})
public class LServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        response.setHeader("aaa", "AAA");
//        response.addHeader("aaa","AA");
//        response.addHeader("aaa","A");
        response.setIntHeader("Content-Length",23);


    }
}

