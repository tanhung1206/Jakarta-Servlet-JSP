package tan.hung.container;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Map;

public class SocketHandler extends Thread {
    private Socket socket;
    private Map<String, HttpServlet> handlers;

    public SocketHandler(Socket socket, Map<String, HttpServlet> handlers) {
        this.socket = socket;
        this.handlers = handlers;
    }

    public void run() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Request request = new Request(in);
            if (!request.parse()) {
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                out.println("HTTP/1.1 505 Internal Server Error");
                out.println("Content-Type: text/plain");

                out.println();

                out.println("<html><body>");
                out.println("Can't process your request");
                out.println("</body></html>");
                out.flush();
            } else {
                HttpServlet servlet=handlers.get(request.getPath());
                if(servlet==null){
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    out.println("HTTP/1.1 404 Not Found");
                    out.println("Content-Type: text/html");
                    out.println();

                    out.println("<html><body>");
                    out.println("Not Servlet handle your request!!!");
                    out.println("</body></html>");
                    out.flush();
                }
                else{
                    Response response=new Response(socket.getOutputStream());
                    PrintWriter out = response.getPrintWriter();
                    out.println("HTTP/1.1 200 OK");
                    out.println("Content-Type: text/html");
                    out.println();
                    servlet.service(request,response);
                    out.flush();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
