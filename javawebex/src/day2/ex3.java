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
		//System.out.println("password="+request.getParameter("password"));
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("big5");
		
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		String Address=request.getParameter("address");
		String Sex=request.getParameter("sex");
		String Carrer=request.getParameter("carrer");//null
		String[] Interest=request.getParameterValues("interest");
		String Memery=request.getParameter("memery");
		
		String sum="";
		
		/*for(String o:Interest)
		{
			sum=sum+o+" ";
		}*/
		
		for(int i=0;i<Interest.length;i++)
		{
			sum=sum+Interest[i]+" ";
		}
		
		
		out.println("<h1>你的資料為</h1>"+
		"姓名:"+Name+
		"<br>密碼:"+Password+
		"<br>地址:"+Address+
		"<br>性別:"+Sex+
		"<br>職業:"+Carrer+
		"<br>興趣:"+sum+
		"<br>備註:"+Memery);
		
		
		/*out.println("<h1>你的資料為</h1>");
		out.println("姓名="+Name+"<br>");
		out.println("密碼="+Password);*/
		
	}

	

}
