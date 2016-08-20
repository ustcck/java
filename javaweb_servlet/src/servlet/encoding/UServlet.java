package servlet.encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求编码
 * 在地址栏中直接给出U参数:(gbk)
 *          String name = request.getParameter("username");
 *          byte[] bytes = name.getBytes("iso-8859-1");
 *          name = new String(bytes, "utf-8");
 *
 * 在页面中点击表单或者链接:(utf-8)
 *         req.setCharacterEncoding("utf-8");
 *         String username = req.getParameter("username");
 * Created by ustcck on 2016/8/20.
 */
@WebServlet(name = "UServlet", urlPatterns = {"/UServlet"})
public class UServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");

        System.out.println(username);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        String name = request.getParameter("username");
        byte[] bytes = name.getBytes("iso-8859-1");
        name = new String(bytes, "utf-8");
        System.out.println(name);


    }
}

