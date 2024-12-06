package tan.hung.container;

public class HttpServlet {
    public void init(){
        System.out.println("HttpServlet init");
    }
    public void service(){ // TODO: Request,Response object as params

    }
    public void goGet(){
        System.out.println("HttpServlet doGet Default Impl...");
    }
    public void goPost(){
        System.out.println("HttpServlet doPost Default Impl...");
    }

}
