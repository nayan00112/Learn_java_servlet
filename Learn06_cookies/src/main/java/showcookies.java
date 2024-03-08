

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class showcookies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie ck[] = request.getCookies();
		if (ck!= null) {
		
		out.print("<table border='1px'>");
		out.println("<tr><th>Cookie title</th><th>Cookie data</th></tr>");
		for (Cookie c : ck) {
			out.println("<tr><td>"+c.getName()+"</td><td>"+ c.getValue() + "</td></tr>");
		}
		out.println("</table>");
		}
		else {
			out.print("No cookies avaliavle!!!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
