package servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * 获取类路径下的资源
 * Created by ustcck on 2016/8/19.
 */
@WebServlet(name = "JServlet", urlPatterns = {"/JServlet"})
public class JServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        /*
        1.得到ClassLoader，这个要先得到Class，再得到ClassLoader
        2.调用其getResourceAsStream(),得到一个InputStream
        3.
        */

        /*
        ClassLoader classLoader = this.getClass().getClassLoader();
        //相对于/classes
        InputStream inputStream = classLoader.getResourceAsStream("servlet/a.txt");
        */

        Class c = this.getClass();
        //相对于.class文件躲在的目录
        InputStream inputStream = c.getResourceAsStream("a.txt");
        String a = IOUtils.toString(inputStream);
        System.out.println(a);


    }
}

