package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello") // this is to set "hello" to value attributes
//@WebServlet(value="/hello") //this is the same as previous
//@WebServlet(urlPatterns = "/hello");
//@WebServlet({"/hello","/simple"})
@WebServlet(urlPatterns = {"/hello","/simple","/world"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("Hello from Nguyen Tan Hung");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
