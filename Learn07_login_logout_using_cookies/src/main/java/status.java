

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class status extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Cookie ck[] = request.getCookies();
		
		char s = '0';
		if (ck != null) {
			for (Cookie c : ck) {
				if(c.getName().equals("status") && c.getValue().equals("loggedin"))
				{
					s = '1';
					break;
				}
			}
		}
		out.print("Status:");
		if(s == '1') {
			out.print(" Loggedin");
			out.print("<br> <a href='logout'>logout</a>");
		}
		else {
			out.print(" not logged in");
			out.print("<br><a href='index.html'>Login</a>");
		}
	}

}
