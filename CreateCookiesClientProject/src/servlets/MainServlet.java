package servlets;

import javax.ejb.EJB;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import facade.FacadeLocal;
import entity.ejb.*;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html; charset=ISO-8859-1";

	@EJB
	FacadeLocal facade;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("MainServlet-doGet");
		out.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType(CONTENT_TYPE);
		String url = null; // Get hidden field
		String operation = req.getParameter("operation");
		if (operation.equals("showemail")) {
			String cEmail = req.getParameter("txtEmail");
			facade.findBycEmail(cEmail);
			
			Customer c1 = new Customer();
			req.setAttribute("cEmail", c1);
			url = "/ShowEmail.jsp";
		} else if (operation.equals("searchemail")) {
			url = "/SearchEmail.jsp";
		} else {
			url = "/SearchEmail.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(req, resp);// req.getRequestDispatcher(url).forward(req,
										// resp);
	}
}