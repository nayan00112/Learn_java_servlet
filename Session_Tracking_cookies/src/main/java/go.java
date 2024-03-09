

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class go
 */
public class go extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Cookie[] ck = request.getCookies();
		
		short a = 0;
		if(ck != null)
		{
			for (Cookie c: ck) {
				if (c.getName().equals("username")) {
				a = 1;
				out.println(c.getName() + " : " + c.getValue() +" | Max Age: "+ c.getMaxAge()+ "<br>");
				}
			}
		}
		else  {
			out.print("not session on (No cookies avaliable)");
		}
		if (a == 0) {
			out.print("not found username in cookies ");
		}
		else {
			out.print("<br>Click here for expire session: <a href='terminateSession'>Click</a>");
		}
		out.close();
	}

}
