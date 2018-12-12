package cn.zhangspace.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NotFoundServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();

        System.out.println(request.getAttribute("javax.servlet.error.status_code"));
        System.out.println(request.getAttribute("javax.servlet.error.exception_type"));
        System.out.println(request.getAttribute("javax.servlet.error.message"));
        System.out.println(request.getAttribute("javax.servlet.error.exception"));
        System.out.println(request.getAttribute("javax.servlet.error.request_uri"));
        System.out.println(request.getAttribute("javax.servlet.error.servlet_name"));

    }


}
