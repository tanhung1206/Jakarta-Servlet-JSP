package tan.hung;

import tan.hung.container.HttpServlet;
import tan.hung.container.Request;
import tan.hung.container.Response;

import java.io.PrintWriter;

public class SignUpServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("SignUpServlet init() called....");
    }

    @Override
    public void doGet(Request request, Response response) {
        PrintWriter out=response.getPrintWriter();
        out.println("<html><body>");
        out.println("<form method=\"POST\">");
        out.println("First Name: <input type=\"text\" name=\"fName\"><br>");
        out.println("Last Name: <input type=\"text\" name=\"lName\"><br>");
        out.println("<input type=\"submit\" value=\"Sign Up\">");
        out.println("</body></html>");
    }

    @Override
    public void doPost(Request request, Response response) {
        PrintWriter out=response.getPrintWriter();
        out.println("<html><body>");
        out.println("Sign Up Successful: "+request.getRequestParameter("fName")+" "+request.getRequestParameter("lName"));
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Clean up resources in HelloWorldServlet destroy()...");
    }
}
