package servlet.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Refresh响应字节数据
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "PServlet", urlPatterns = {"/PServlet"})
public class PServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
//
//        String s = "Hello outputstream";
//        byte[] bytes = s.getBytes();
//
//        response.getOutputStream().write(bytes);

        String path = "F:/001.JPG";
        FileInputStream in = new FileInputStream(path);
        byte[] bytes1 = IOUtils.toByteArray(in);

        response.getOutputStream().write(bytes1);

    }
}

