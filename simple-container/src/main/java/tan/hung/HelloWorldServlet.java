package tan.hung;

import tan.hung.container.HttpServlet;

public class HelloWorldServlet extends HttpServlet{
    @Override
    public void init() {
        System.out.println("HelloWorldServlet init() called...");
    }

    @Override
    public void goGet() {
        System.out.println("HelloWorldSer doGet()...");
    }
}
