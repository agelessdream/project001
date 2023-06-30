package servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username=req.getParameter("username");
//
//        if("atguigu".equals(username)){
//            //通过响应对象响应信息
//            resp.getWriter().write("NO");
//        }else{
//            resp.getWriter().write("YES");
//        }
        resp.getWriter().write("哈哈哈");
          System.out.println("嘿嘿嘿");
    }
}
