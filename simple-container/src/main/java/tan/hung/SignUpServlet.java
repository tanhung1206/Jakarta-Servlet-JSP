package tan.hung;

import tan.hung.container.HttpServlet;

public class SignUpServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("SignUpServlet init() called....");
    }

    @Override
    public void goGet() {
        super.goGet();
    }
}
