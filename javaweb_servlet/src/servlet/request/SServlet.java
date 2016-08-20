package servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "SServlet", urlPatterns = {"/SServlet"})
public class SServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        String referer = request.getHeader("Referer");
        System.out.println(referer);
        if (referer == null) {
            System.out.println("hello");
        } else if(referer.contains("localhost")) {
            response.sendRedirect("http://www.baidu.com");
        }
    }
}

