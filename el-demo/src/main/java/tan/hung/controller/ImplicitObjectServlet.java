package tan.hung.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/implicitObject")
public class ImplicitObjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("username","Hung");
        req.getSession().setAttribute("username","Quynh Nhi");
        getServletContext().setAttribute("username","Trung Hieu");
        req.getRequestDispatcher("dotoperatorimplicitobj.jsp").forward(req,resp);
    }
}

