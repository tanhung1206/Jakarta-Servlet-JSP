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
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            Request request=new Request(in);
            if(!request.parse()){
                out.println("HTTP/1.1 505 Internal Server Error");
                out.println("Content-Type: text/plain");

                out.println();

                out.println("<html><body>");
                out.println("Can't process your request");
                out.println("</body></html>");
                out.flush();
            }
            System.out.println("Method: "+request.getMethod());
            System.out.println("Path: "+request.getPath());
            request.getRequestParameters().forEach((key,value)-> System.out.println("Param Name: "+key+",param value: "+value));
            request.getHeaders().forEach((key,value)-> System.out.println("Header Name: "+key+",header value: "+value));
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println();

            out.println("<html><body>");
            out.println("Current Time: " + LocalDateTime.now());
            out.println("</body></html>");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
