package controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import model.employee;


@Path("employee")
public class employeeController {
	
	
	
	@Path("get")
	@GET
	public String get()
	{
		return "rest test use GET5555";
	}
	
	
	@Path("get2")
	@POST
	public String get2()
	{
		return "rest test use GET22222";
	}
	
	@Path("add/{name}")
	@GET
	public String add(@PathParam("name")String name)
	{
		employee e=new employee();
		
		e.setName(name);
		
		
		return "rest add name="+e.getName();
	}
	
	
	@Path("update/{name}")
	@GET
	public String update(@PathParam("name")String name)
	{
		employee e=new employee();
		
		e.setName(name);
		
		
		return "rest update name="+e.getName();
	}

}
