package tan.hung;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoginServlet extends HttpServlet {
    public LoginServlet(){
        System.out.println("LoginServlet Constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() in LoginServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("Login Current Time: "+ LocalDateTime.now());
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() in LoginServlet");
    }
}
