

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Hello: getinitparametername data fatch in bottom to up!<hr>");
		
		ServletContext sc = getServletContext();
		String pagename = sc.getInitParameter("page");
		out.print(pagename +"<hr>");
	
		
		Enumeration<String> en = sc.getInitParameterNames();
		while(en.hasMoreElements()) {
			String param = (String) en.nextElement();
			String name = sc.getInitParameter(param);
			out.print(param + " : " +name + "<br>");
		}
		out.close();
	}
}
