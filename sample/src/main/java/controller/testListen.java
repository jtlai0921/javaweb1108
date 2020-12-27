package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import Model.member;


public class testListen implements ServletContextListener {

    public testListen() {
       
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         
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
