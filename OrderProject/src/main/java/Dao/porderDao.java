package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
		// System.out.println(implDao.getDB());

		Porder p = new Porder("aaa", 2, 1, 1);

		new porderDao().add(p);

	}

	@Override
	public void add(Object o) {
		Porder p = (Porder) o;
		Connection conn = implDao.getDB();

		String Sql = "insert into Porder(desk,A,B,C,sum) values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(Sql);
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
		Connection conn=implDao.getDB();
		String sql="select * from porder";
		String show="";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"<tr><td>"+rs.getInt("id")+
						"<td>"+rs.getString("desk")+
						"<td>"+rs.getInt("A")+
						"<td>"+rs.getInt("B")+
						"<td>"+rs.getInt("C")+
						"<td>"+rs.getInt("sum")+"\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public String querySum(int start, int end) {
		Connection conn=implDao.getDB();
		String sql="select * from porder where sum>=? and sum<=?";
		String show="";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"<tr><td>"+rs.getInt("id")+
						"<td>"+rs.getString("desk")+
						"<td>"+rs.getInt("A")+
						"<td>"+rs.getInt("B")+
						"<td>"+rs.getInt("C")+
						"<td>"+rs.getInt("sum")+"\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}
	

	@Override
	public void update(int id, Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public Object queryObject(int id)  {
		Connection conn=implDao.getDB();
		String SQL="select * from porder where id=?";
		Porder p=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				p=new Porder();
				
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
			
			}		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}