import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieExampleServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// Create a new cookie
Cookie cookie = new Cookie("username", "JohnDoe");

// Set the expiry time of the cookie to 1 hour (3600 seconds)
cookie.setMaxAge(3600);

// Add the cookie to the response
response.addCookie(cookie);

// Set the response content type
response.setContentType("text/html");

// Write a response message
response.getWriter().println("Cookie has been set with an expiry time of 1 hour.");
}
}
