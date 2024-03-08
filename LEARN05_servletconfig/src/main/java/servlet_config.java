

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class servlet_config extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig sc = getServletConfig();
		String author = sc.getInitParameter("servletauthor");
		String clg = sc.getInitParameter("college");
		
		
		out.println("<b> Author: " + author + "</b>");
		out.println("<b> College: " + clg + "</b>");
		out.println("<br>");
		
		Enumeration<String> en = sc.getInitParameterNames();
		while (en.hasMoreElements()) {
			String param = (String) en.nextElement();
			String value = sc.getInitParameter(param);
			out.println("<b>"+ param + " : " + value + "</b><br>");
		}
		out.close();
	}

}
