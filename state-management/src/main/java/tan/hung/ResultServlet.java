package tan.hung;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tan.hung.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Optional;
import java.util.stream.Stream;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

//        String playlist = (String) req.getAttribute("playlist");
//        User user = (User) req.getAttribute("user");
//        out.println("Playlist: " + playlist + "<br>");
//        out.println("User: " + user);

//        Cookie[] cookies = req.getCookies();
//        out.println("User: "+this.getCookieValueByName(cookies,"user").get()+"<br>");
//        out.println("Playlist: "+this.getCookieValueByName(cookies,"playlist").get());

        out.println("App Name: "+getServletContext().getAttribute("AppName")+"<br>");
        out.println("Author: "+getServletContext().getAttribute("Author"));
    }

    private Optional<String> getCookieValueByName(Cookie[] cookies, String name) {
        return Stream.of(cookies)
                .filter(cookie -> name.equals(cookie.getName()))
                .map(cookie-> {
                    try {
                        return URLDecoder.decode(cookie.getValue(),"UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .findAny();
    }
}
