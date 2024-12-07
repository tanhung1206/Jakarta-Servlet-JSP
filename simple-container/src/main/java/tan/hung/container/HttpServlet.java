package tan.hung.container;

public class HttpServlet {
    public void init(){
        System.out.println("HttpServlet init default");
    }
    public void service(Request request,Response response){
        String method=request.getMethod();
        if("GET".equals(method)){
            this.doGet(request,response);
        }
        else if("POST".equals(method)){
            this.doPost(request,response);
        }
        else{
            throw new RuntimeException("Method not Supported!");
        }
    }
    public void doGet(Request request,Response response){
        System.out.println("HttpServlet doGet Default Impl...");
    }
    public void doPost(Request request,Response response){
        System.out.println("HttpServlet doPost Default Impl...");
    }

    public void destroy(){
        System.out.println("HttpServlet destroy default impl...");
    }

}
