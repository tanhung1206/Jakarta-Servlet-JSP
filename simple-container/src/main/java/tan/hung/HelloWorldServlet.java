package tan.hung;

import tan.hung.container.HttpServlet;

public class HelloWorldServlet extends HttpServlet{
    @Override
    public void goGet() {
        System.out.println("HelloWorldSer doGet()...");
    }
}
