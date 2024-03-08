


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class deletecook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
		String c_title = request.getParameter("cookietitle");
		if (request.getCookies() != null) {
		Cookie ck = new Cookie(c_title, "");
		ck.setMaxAge(0);
		response.addCookie(ck);
		out.print("<b>Cookies deleted</b>");
		}
		else {
			out.print("<b>Cookies not avaliable</b>");
		}
		}
		catch(Exception e) {
			out.print(e);
		}
		finally {
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request, response);
		}
		
	}

}
