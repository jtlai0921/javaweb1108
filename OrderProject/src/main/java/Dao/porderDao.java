package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		//System.out.println(implDao.getDB());
		Porder p=new Porder("aaa",2,1,1);
		
		new porderDao().add(p);

	}

	@Override
	public void add(Object o) {
		Porder p=(Porder)o;
		Connection conn=implDao.getDB();
		
		String Sql="insert into Porder(desk,A,B,C,sum) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String querySum(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}