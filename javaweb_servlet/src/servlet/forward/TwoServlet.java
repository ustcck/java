package servlet.forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发和请求包含
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "two", urlPatterns = {"/two"})
public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        System.out.println("TwoServlet........");
        response.getWriter().print("hello TwoServlet");


    }
}

