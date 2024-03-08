

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servletpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String sct = request.getContentType();
		int gsp = request.getServerPort();
		out.print("<h1>Hello Servletpage</h1>");
		out.print(sct);
		out.println("<br>");
		out.print(gsp);
		out.println("<br>");
		out.print(request.getContextPath());
		
		out.println("<br>");
		out.close();
		
	}

}
