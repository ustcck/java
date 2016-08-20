package servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * response发送状态码
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "KServlet", urlPatterns = {"/KServlet"})
public class KServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        response.sendError(404,"客户端错误");


    }
}

