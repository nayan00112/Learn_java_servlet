

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		Student s1 = new Student("nayan", 48);
		Student s2 = new Student("jignesh", 49);
		
		request.setAttribute("student1", s1);
		request.setAttribute("student2", s2);
		RequestDispatcher rd= request.getRequestDispatcher("jsppage.jsp");
		rd.forward(request, response);
		out.close();
	
	}

}
