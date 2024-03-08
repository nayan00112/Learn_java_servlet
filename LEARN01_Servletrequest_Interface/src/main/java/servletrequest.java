to

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class servletrequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Title</title></head><body style='font-family:sans-serif; padding:10px;'>");
		out.println("<h1>Hello Nayan!</h1>");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String range = request.getParameter("range");
		
		String[] hobbies = request.getParameterValues("hobbies");
		
		out.println("<ol>");
		out.println("<li>Name: " + name + "</li>");
		out.println("<li>Email: " + email + "</li>");
		out.println("<li>Range: " + range + "</li>");
		out.println("<li>Hobbies: </li>");
		out.println("<ul>");
		
		for (String n : hobbies) {
			out.print("<li>" + n + "</li>");
		}
		out.println("</ul>");
		out.println("</ol>");
		
		out.println("<hr><ol>");
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String pr = en.nextElement().toString();
			String[] val = request.getParameterValues(pr);
			out.println("<li>" + pr + "</li><ul>");
			for (String i : val) {
				out.println("<li>"+i+"</li>");
			}
			out.println("</li></ul>");
		}
		out.println("</ol>");
		out.println("</body></html>");
	}

}
