package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final String myusername = "admin";
    private final String mypassword = "tanhung12061206";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String _username =(String)session.getAttribute("username");
        if (_username != null) {
            resp.sendRedirect("success.html");
            return;
        }
        req.getRequestDispatcher("login.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals(myusername) && password.equals(mypassword)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("success.html");
        } else {
            resp.sendRedirect("/login");
        }
    }
}
