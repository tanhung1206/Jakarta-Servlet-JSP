package tan.hung.container;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SimpleWebContainer {
    private final int port;
    private final String configFileName;
    private Map<String, HttpServlet> handlers = new HashMap<>();

    public SimpleWebContainer(int port, String configFileName) {
        this.port = port;
        this.configFileName = configFileName;
    }

    private void start() throws IOException {
        ServerSocket server = new ServerSocket(port);
        while (true) {
            Socket socket = server.accept();
            Thread socketHandler = new SocketHandler(socket,handlers);
            socketHandler.start();
        }

    }

    public static void main(String[] args) throws IOException, Exception {
        SimpleWebContainer container = new SimpleWebContainer(8888, "config.properties");
        container.loadPropertiesFile();
        for(Map.Entry<String,HttpServlet> tmp:container.handlers.entrySet()){
            System.out.println(tmp.getKey());
            tmp.getValue().goGet();
        }
        container.start();

    }

    private HttpServlet getServletInstance(String className) {
        try {
            return (HttpServlet) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadPropertiesFile() throws Exception {
        InputStream input = getClass().getClassLoader().getResourceAsStream(configFileName);
        if (input == null) {
            throw new Exception("Unable to find file: " + configFileName);
        }
        Properties properties = new Properties();
        properties.load(input);
        properties.forEach((key, value) -> handlers.put((String) key, getServletInstance((String) value)));
    }

    public static long fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
