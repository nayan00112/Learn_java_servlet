

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if (pass.equals("admin123")) {
			Cookie ck = new Cookie("status", "loggedin");
			response.addCookie(ck);
			out.print("Logged in");
		}
		else {
			Cookie ck = new Cookie("status", "Not loggedin");
			response.addCookie(ck);
			out.print("Wrong input!");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("status");
		rd.include(request, response);	
	}

}
