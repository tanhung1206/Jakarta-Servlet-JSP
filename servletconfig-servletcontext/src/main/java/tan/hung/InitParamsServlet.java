package tan.hung;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class InitParamsServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("title: " + config.getInitParameter("title"));
        System.out.println("configStyle: " + config.getInitParameter("configStyle"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("title: " + getServletConfig().getInitParameter("title"));
        out.println("<br>");
        out.println("config style: " + getInitParameter("configStyle"));
        out.println("<br>Context<br>");
        out.println("Author: "+getServletContext().getInitParameter("author"));
        out.println("<br>");
        out.println("Country: "+getServletContext().getInitParameter("country"));
        out.println("</body></html>");
    }
}
