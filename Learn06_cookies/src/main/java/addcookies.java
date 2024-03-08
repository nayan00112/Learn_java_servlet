import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class addcookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
		String c_title = request.getParameter("cookietitle");
		String c_data = request.getParameter("cookiedata");
		
		Cookie ck = new Cookie(c_title, c_data);
		response.addCookie(ck);
		
		out.print("<b>Cookies added</b>");}
		catch(Exception e) {
			out.print(e);
		}
		finally {
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request, response);
		}
		
	}

}
