package servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import facade.FacadeLocal;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	FacadeLocal facade;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String cEmail = request.getParameter("cEmail");
		String cPassword = request.getParameter("cPassword");

		boolean result = facade.authenticateCustomer(cEmail, cPassword);

		if (result == true) {
			Cookie customerCookie = new Cookie("cEmail", cEmail);
			request.getSession().setAttribute("cEmail", result);
			
			customerCookie.setMaxAge(60 * 60);
			customerCookie.setPath("/CreateCookiesClientProject");
			response.addCookie(customerCookie);
			response.sendRedirect("http://iis.infoteket.nu/CreateCookiesWeb/profilsida.html");
		} else {
			response.sendRedirect("http://iis.infoteket.nu/CreateCookiesWeb/error.html");
		}

	}

}
