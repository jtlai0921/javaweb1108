package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ex1")
public class ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ex1() {
        super();
       
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("do GET");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();    	
    	out.println("<h1>hello servlet</h1>");
    	out.println("<a href=\"http://www.google.com\" target=_blank>goole</a>");
    	out.println("<h1>���K�q��</h1>");
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("do GET");
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("do POST");
//	}

}
