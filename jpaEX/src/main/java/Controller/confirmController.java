package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.porder;

public class confirmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public confirmController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	request.setCharacterEncoding("BIG5");
	response.setContentType("text/html");
	response.setCharacterEncoding("BIG5");
	
	PrintWriter out=response.getWriter();
	
	String desk=request.getParameter("desk");
	String A=request.getParameter("A");
	String B=request.getParameter("B");
	String C=request.getParameter("C");
	porder p=null;
	HttpSession session=request.getSession();
	if(desk!="" && A!="" && B!="" && C!="" )
	{
		int a=Integer.parseInt(A);
		int b=Integer.parseInt(B);
		int c=Integer.parseInt(C);
		
		p=new porder(desk,a,b,c);
		
		session.setAttribute("P",p);
		
		response.sendRedirect("confirm.jsp");
		
	}
	else
	{
		out.println("不可空白<a href=index.jsp>回上一頁</a>");
	}
	
	}

}