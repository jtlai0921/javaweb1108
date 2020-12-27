package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employee;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updateServlet() {
        super();
        
    }
    PrintWriter out;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out=response.getWriter();
		
		String name=request.getParameter("name");
		
		employee e=new employee();
		e.setName(name);
		
		
		out.println("GET update employee name="+e.getName());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		out=response.getWriter();
		
		String name=request.getParameter("name");
		
		employee e=new employee();
		e.setName(name);
		
		
		out.println("POST update employee name="+e.getName());
	
	}

}
