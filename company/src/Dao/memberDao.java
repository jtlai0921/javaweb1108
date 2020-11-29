package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.member;



public class memberDao implements implDao{

	public static void main(String[] args) {
		
		
		System.out.println(new memberDao().queryAll());

	}

	@Override
	public void add(Object o) {
		
		member m=(member)o;
		Connection conn=implDao.getDB();
		String sql="insert into member(username,password,name,address,phone,mobile) "+
				"values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, m.getUsername());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getName());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			ps.setString(6, m.getMobile());
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public Boolean queryUser(String username, String password) {
		Connection conn=implDao.getDB();
		String Sql="select * from member where username=? and password=?";
		Boolean check=false;
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, username);
			ps.setString(2, password);			
			ResultSet rs=ps.executeQuery();
			check=rs.next();			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public Boolean queryUser(String username) {
		Connection conn=implDao.getDB();
		String Sql="select * from member where username=? ";
		Boolean check=false;
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, username);					
			ResultSet rs=ps.executeQuery();
			check=rs.next();			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public String queryAll() {
		Connection conn=implDao.getDB();
		String all="";
		try {
			PreparedStatement ps=conn.prepareStatement("select * from member");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				all=all+
						"<tr><td>id:"+rs.getInt("id")+
						"<td>"+rs.getString("username")+
						"<td>"+rs.getString("password")+
						"<td>"+rs.getString("name")+
						"<td>"+rs.getString("address")+
						"<td>"+rs.getString("phone")+
						"<td>"+rs.getString("mobile")+"\n";
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
	}

	

}


/*
 * String sql="insert into member(username,password,name,address,phone,mobile) "+
				"values('abc','1234','ff','aa','012','11')";
				
				try {
					Statement st=conn.createStatement();
					st.executeUpdate(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 * 
 * 
 * 
 * 
 */