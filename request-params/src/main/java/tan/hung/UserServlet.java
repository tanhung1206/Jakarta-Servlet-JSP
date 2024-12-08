package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("In doGet()........<br>");
        out.println("First Name: " + req.getParameter("firstname") + "<br>");
        out.println("Last Name: " + req.getParameter("lastname") + "<br>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("In doPOST()*********<br>");
        System.out.println("First name: "+req.getAttribute("firstname"));
        out.println("First Name: " + req.getParameter("firstname")+ "<br>");
        out.println("Last Name: " + req.getParameter("lastname")+ "<br>");
    }
}
