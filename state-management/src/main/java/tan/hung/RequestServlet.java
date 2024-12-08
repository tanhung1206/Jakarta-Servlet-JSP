package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tan.hung.model.User;

import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("playlist","Servlet & JSP");
        req.setAttribute("user",new User("Tan","Hung"));
        req.getRequestDispatcher("/result").forward(req,resp);
    }
}
