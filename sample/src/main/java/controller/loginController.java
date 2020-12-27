package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		HttpSession session = request.getSession();

		if (username.equals("abc")) {
			session.setAttribute("USER", username);

			response.sendRedirect("member/success.jsp");
		} else {
			response.sendRedirect("error.html");
		}

	}

}
