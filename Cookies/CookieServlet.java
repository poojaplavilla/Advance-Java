package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		out.println("<h1>Welcome user = " + username + "</h1>");
		Cookie[] cookies = request.getCookies();
		
		boolean flag = false;
		if(cookies!=null && cookies.length>0) {
			for(Cookie c : cookies) {
				System.out.println(c.getName() + "," + c.getValue());
				if(c.getValue().equals(username)) {
					out.println("<h2>Cookie found for user= " + username + "</h2>");
					flag = true;
					break;
				}
			}
		}
		if(!flag) {
			out.println("<h2>Cookie not found for user= " + username + "</h2>");
			Cookie c = new Cookie("username",username);
			c.setMaxAge(3600000);
			response.addCookie(c);
			out.println("<h2>Cookie set for user= " + username + "</h2>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
