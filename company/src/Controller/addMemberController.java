package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;

@WebServlet("/addMemberController")
public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("username");
		
		if(new memberDao().queryUser(userName))
		{
			response.sendRedirect("addMemberError.jsp");
		}
		else
		{
			String passWord=request.getParameter("password");
			String Name=request.getParameter("name");
			String Address=request.getParameter("address");
			String Phone=request.getParameter("phone");
			String Mobile=request.getParameter("mobile");
			
			
			member m=new member(userName,passWord,Name,Address,Phone,Mobile);
			
			new memberDao().add(m);
			
			response.sendRedirect("addMemberSuccess.jsp");
			
		}
	
	
	}

}