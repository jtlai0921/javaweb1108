package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employee;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public addServlet() {
        super();
        
    }
    PrintWriter out;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		
		String name=request.getParameter("name");
		
		employee e=new employee();
		e.setName(name);
		
		
		out.println("GET add employee name="+e.getName());
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
out=response.getWriter();
		
		String name=request.getParameter("name");
		
		employee e=new employee();
		e.setName(name);
		
		
		out.println("Post add employee name="+e.getName());
	
	
	}

}
