package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porderDao;
import Model.porder;

public class addPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		porder p=(porder)session.getAttribute("P");		
		new porderDao().add(p);
		session.removeAttribute("P");
		response.sendRedirect("finish.jsp");
	}

}