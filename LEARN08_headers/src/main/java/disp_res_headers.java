

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class disp_res_headers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html> <head> <title>Headers</title></head> <body>");
		out.println("<b>");
		String host = response.getHeader("host");
		out.print("Host: " + host);
		out.println("</b>");
		out.println("<hr>");
		Enumeration en = (Enumeration) response.getHeaderNames();
		out.println("<table border='1' cellpadding='5px'>");
		out.print("<tr><th>Header Name</th><th>Header Value</th></tr>");
		while(en.hasMoreElements()) {
			String headerName = (String) en.nextElement();
			String headerValue = (String) response.getHeader(headerName);
			out.print("<tr><td>"+headerName+"</td><td>" + headerValue + "</td></tr>");
			}
		out.println("</table>");
		out.println("</body></head>");
		out.close();
	}

}
