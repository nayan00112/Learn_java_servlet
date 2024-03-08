

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class servlet_config2
 */
public class servlet_config2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig sc = getServletConfig();
		String page1 = sc.getInitParameter("page1");
		String servletauthor = sc.getInitParameter("servletauthor");
		
		
		out.println("<b> page1: " + page1 + "</b>");
		out.println("<b> servletauthor: " + servletauthor + "</b>");
		out.println("<br><hr><hr>");
		
		Enumeration<String> en = sc.getInitParameterNames();
		while (en.hasMoreElements()) {
			String param = (String) en.nextElement();
			String value = sc.getInitParameter(param);
			out.println("<b>"+ param + " : " + value + "</b><br>");
		}
		out.close();
	}

}
