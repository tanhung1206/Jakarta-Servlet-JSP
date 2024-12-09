package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/publicprivate")
public class PublicPrivatePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("/public_page.jsp");
//        resp.sendRedirect("/WEB-INF/private_page.jsp");

        req.getRequestDispatcher("/WEB-INF/private_page.jsp").forward(req,resp);
    }
}
