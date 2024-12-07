package tan.hung;

import tan.hung.container.HttpServlet;
import tan.hung.container.Request;
import tan.hung.container.Response;

import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet{
    @Override
    public void init() {
        System.out.println("HelloWorldServlet init() called...");
    }

    @Override
    public void doGet(Request request, Response response) {
        PrintWriter out=response.getPrintWriter();
        out.println("<html><body>");
        out.println("doGet() in HelloWorldServlet");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Clean up resources in HelloWorldServlet destroy()...");
    }
}
