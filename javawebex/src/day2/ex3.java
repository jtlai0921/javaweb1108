package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex3")
public class ex3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ex3() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("password="+request.getParameter("password"));
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		out.println("<h1>你的資料為</h1>");
		out.println("姓名="+Name+"<br>");
		out.println("密碼="+"*****");
	}

	

}
