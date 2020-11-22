package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.studentDao;
import Model.student;

@WebServlet("/addController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public addController() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		
		student s=new student();
		s.setName(name);
		s.setAdress(address);
		
		new studentDao().add(s);
		
		response.sendRedirect("addok.jsp");
	
	
	}

}