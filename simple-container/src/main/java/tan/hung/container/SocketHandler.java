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
    private Map<String,HttpServlet>handlers;

    public SocketHandler(Socket socket, Map<String,HttpServlet> handlers) {
        this.socket = socket;
        this.handlers=handlers;
    }

    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = in.readLine();
            while (!line.isEmpty()) {
                System.out.println(line);
                line = in.readLine();
            }
            out = new PrintWriter(socket.getOutputStream());
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
