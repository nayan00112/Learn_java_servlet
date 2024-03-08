

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class disp_res_headers_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Cookie ck = new Cookie("username", "nayan123");
		response.addCookie(ck);
		response.addHeader("header1", "ValueOfHeader1");
		response.addHeader("header2", "HeaderOfvalue2");
		
		response.addIntHeader("headerint", 48);
		response.setStatus(0);
		response.setDateHeader("mydate", 8-03-2024);
		response.setContentLength(100);
		 // Set content type
        response.setContentType("text/html");
        
        // Set character encoding
        response.setCharacterEncoding("UTF-8");
        
        // Set cache control to no-cache
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        
        // Set pragma to no-cache for older browsers
        response.setHeader("Pragma", "no-cache");
        
        // Set expiration time to a past date
        response.setDateHeader("Expires", 0);
        
        // Set a custom header
        response.setHeader("My-Custom-Header", "Custom Value");
        
        // Redirect the client to another URL
        response.sendRedirect("https://www.example.com");
        
        // Set a cookie
        response.addCookie(new Cookie("username", "JohnDoe"));
        
        // Other headers as needed
		RequestDispatcher rd = request.getRequestDispatcher("disp_res_headers");
		rd.include(request, response);
		
	}

}
