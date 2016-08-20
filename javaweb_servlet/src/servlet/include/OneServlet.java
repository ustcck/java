package servlet.include;

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
@WebServlet(name = "one2", urlPatterns = {"/one2"})
public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        System.out.println("OneServlet........");
        response.setHeader("aaa","AAA");
        response.getWriter().print("hello OneServlet");

        request.getRequestDispatcher("/two").include(request,response);

    }
}

