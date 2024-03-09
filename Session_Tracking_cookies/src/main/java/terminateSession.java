

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class terminateSession
 */
public class terminateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie[] ck = request.getCookies();
		
		short a = 0; 
		if (ck != null) {
			for (Cookie c: ck) {
				if (c.getName().equals("username")) {
				a = 1;
					c.setValue("");
					c.setMaxAge(0);
				}
			}
		}
		else {
			out.print("Not avaliable cookies");
		}
		if (a == 0) {
			out.print("username is not found in cookie.");
		}
		else {
			out.println("session expired");
		}
		out.close();
	}

}
