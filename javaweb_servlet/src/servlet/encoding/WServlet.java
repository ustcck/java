package servlet.encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * URL编码
 * 1. get请求中没有中文URL编码，可能会丢失字节
 * 2. 使用的是表单，表单自动使用URL编码
 *
 * Created by ustcck on 2016/8/20.
 */
@WebServlet(name = "WServlet", urlPatterns = {"/WServlet"})
public class WServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {


    }
}

