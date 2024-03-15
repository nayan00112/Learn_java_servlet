

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String client_browser = request.getHeader("user-agent");
		String client_ip = request.getRemoteAddr();
		int client_port = request.getRemotePort();
		int server_port = request.getServerPort();
		int local_port = request.getLocalPort();
		String method = request.getMethod();
		String query_string = request.getQueryString();
		
		out.print("<ul>");
		out.println("<li>String client_browser = " + client_browser + "</li>"); 
				out.println("<li>String client_ip = " + client_ip + "</li>"); 
				out.println("<li>int client_port = " + client_port + "</li>"); 
				out.println("<li>int server_port = " + server_port + "</li>");
				out.println("<li>int local_port = " + local_port + "</li>");
				out.println("<li>String method = " + method + "</li>"); 
				out.println("<li>String query_string = " + query_string +  "</li>"); 
		out.print("</ul>");
		out.close();
		
	}

}
