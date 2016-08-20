package servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * request之获取请求参数
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "TServlet", urlPatterns = {"/TServlet"})
public class TServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println(username + "," + password + "," + Arrays.toString(hobby));


        /*
        * 获取所以请求参数的名称
        */
        Enumeration names = req.getParameterNames();
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());

        }

        /*
        * 获取所有请求参数，封装到map中
        */
        Map<String, String[]> map = req.getParameterMap();
        for (String name : map.keySet()) {
            String[] value = map.get(name);
            System.out.println(name+":"+Arrays.toString(value));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {


        System.out.println(request.getParameter("aaa"));
        System.out.println(request.getParameter("bbb"));

    }
}

