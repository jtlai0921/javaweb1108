package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
	//�s�udatabase��k
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
	
	//�s�W����
	void add(Object o);
	
	//�d�ߪ���
	Boolean queryUser(String username,String password);//�P�_�b���K�X
	Boolean queryUser(String username);//�P�_�b��
	
	
	//�ק磌��
	
	
	//�R������

}