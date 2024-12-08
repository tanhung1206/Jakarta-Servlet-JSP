package tan.hung;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/applicationscope")
public class ApplicationScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();
        context.setAttribute("AppName","State Management Demo");
        context.setAttribute("Author","Nguyen Tan Hung");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("Application Scope Attributes set successfully");
    }
}
