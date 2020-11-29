package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.student;

public class studentDao implements implDao{

	public static void main(String[] args) {
		student s=new student();
		s.setName("teacher");
		s.setAdress("taipei");
		
		new studentDao().add(s);

	}

	@Override
	public void add(Object o) {
		student s=(student)o;
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="1234";
		String SQL="insert into student(name,address) values(?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url, user, password);
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1, s.getName());
			ps.setString(2, s.getAdress());
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Boolean queryUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean queryUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}