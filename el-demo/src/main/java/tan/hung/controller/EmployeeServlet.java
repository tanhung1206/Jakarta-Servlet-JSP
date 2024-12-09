package tan.hung.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tan.hung.model.Address;
import tan.hung.model.Employee;

import java.io.IOException;


@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = new Employee("1001", "Tan", "Hung");
        Address address = new Address("Le xuyen", "Quang Tri", "Viet Nam");
        employee.setAddress(address);
        req.setAttribute("emp", employee);

        Employee employee2=new Employee("1002","Quynh","Nhi");
        req.getSession().setAttribute("emp2", employee2);
//        req.getRequestDispatcher("emp.jsp").forward(req, resp);
        req.getRequestDispatcher("employee.jsp").forward(req, resp);
    }
}
