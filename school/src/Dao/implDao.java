package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
	//連線database方法
	static Connection getDB()
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		
		
		return conn;
		
	}
	
	//新增物件
	void add(Object o);
	
	//查詢物件
	Boolean queryUser(String username,String password);//判斷帳號密碼
	Boolean queryUser(String username);//判斷帳號
	
	
	//修改物件
	
	
	//刪除物件

}