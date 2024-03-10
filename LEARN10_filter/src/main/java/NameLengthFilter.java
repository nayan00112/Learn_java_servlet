

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;

public class NameLengthFilter extends HttpFilter implements Filter {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		int len = request.getParameter("name").length();
		
		if (len > 2 ) {
			
			chain.doFilter(request, response);
		}
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("ErrorServlet");
			rd.forward(request, response);
			
		}
		out.close();
	}
}
