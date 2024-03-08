

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class mainpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<h1>Welcome</h1>");
		try {
		HttpSession mysession = request.getSession(false);
		if (mysession != null) {
			String uname = (String)mysession.getAttribute("uname");
			out.print("<h1 style='color:blue;'>Hello " + uname + "</h1>");
			out.print("<p>Welcome to the main page!</p>");
			out.print("Click for invalidate session: <a href='invalidate_session'>Click Here </a>");
		}
		}
		catch(Exception e){
			out.print("Login again: <a href='login.html'>Click here</a>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}
}
