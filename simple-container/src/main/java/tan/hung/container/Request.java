package tan.hung.container;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private BufferedReader in;
    private String method;
    private String path;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> requestParameters = new HashMap<>();

    public Request(BufferedReader in) {
        this.in = in;
    }

    public String getRequestParameter(String key) {
        return requestParameters.get(key);
    }

    public String getPath() {
        return path;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    //     /hello?user=tanhung
    private void parseRequestParams(String queryString) {
        for (String pair : queryString.split("&")) {
            String[] pairArr = pair.split("=");
            requestParameters.put(pairArr[0], pairArr[1]);
        }
    }

    public boolean parse() throws IOException {
        String line = in.readLine(); // GET /hello?user=tanhung HTTP/1.1
        if (line == null) return false;
        String[] firstLineArray = line.split(" ");
        if (firstLineArray.length != 3) return false;
        method = firstLineArray[0];
        String url = firstLineArray[1];
        int queryStringIndex = url.indexOf('?');
        if (queryStringIndex > -1) {
            path = url.substring(0, queryStringIndex);
            parseRequestParams(url.substring(queryStringIndex + 1));
        } else {
            path = url;
        }
        while (!(line = in.readLine()).isEmpty()) {
            String[] headerPair = line.split(":");
            headers.put(headerPair[0], headerPair[1]);
        }

        if("POST".equals(method)){
            StringBuilder payload=new StringBuilder();
            while(in.ready()){
                payload.append((char)in.read());
            }
            parseRequestParams(payload.toString());

        }
        //TODO parse POST request body info requestParameters
        return true;
    }
}
