package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;


@WebServlet("/cookie")
public class CookieServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Cookie user=new Cookie("user", URLEncoder.encode("Nguyen Tan Hung", "UTF-8"));
        user.setMaxAge(10*60);
        resp.addCookie(user);

        Cookie playlist=new Cookie("playlist","ServletJSP");
        resp.addCookie(playlist);

        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<html><body>");
        out.println("<a href=\"/result\">Go to Result Servlet</a>");
        out.println("</body></html>");
    }
}
