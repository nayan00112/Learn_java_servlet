

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("un");
		String password = request.getParameter("p");
		
		if (password.equals("admin123")) {
			HttpSession mysession = request.getSession();
			mysession.setAttribute("uname", username);
			RequestDispatcher rd = request.getRequestDispatcher("/mainpage");
			out.print("successfull login");
			rd.include(request, response);
		}
		else {
			out.print("<b style='color:red;'>Invalid input...</b>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
	}
}
