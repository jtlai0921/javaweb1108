package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import model.member;


public class testListen implements ServletContextListener {

   
    public testListen() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        ServletContext application=sce.getServletContext();
        String X=application.getInitParameter("x");
        String Y=application.getInitParameter("y");
        
        int x=Integer.parseInt(X);
        int y=Integer.parseInt(Y);
        
        member m=new member(x,y);
        
        application.setAttribute("M",m);
        
    }
	
}