package tan.hung;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tan.hung.model.User;

import java.io.IOException;

@WebServlet("/attribute")
public class AttributeDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","Nguyen Tan Hung");
        String name=(String)req.getAttribute("name");
        req.removeAttribute("name");

        HttpSession session=req.getSession();
        session.setAttribute("user",new User("Tan","Hung"));
        User user=(User)session.getAttribute("user");

        ServletContext context=this.getServletContext();
        context.setAttribute("user2",new User("Quynh","Nhi"));
        User user2=(User)context.getAttribute("user2");
        context.removeAttribute("user2");
    }
}
