package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
		// System.out.println(implDao.getDB());

		// Porder p = new Porder("aaa", 2, 1, 1);

		// new porderDao().add(p);
		// System.out.println(new porderDao().queryObject(1));
//	Porder p=(Porder)new porderDao().queryObject(1);
//	System.out.println(p.getId()+"\t"+p.getSum()+"\t"+p.getDesk());
//		Porder p = new Porder();
//		p.setA(10);
//		p.setDesk("乙");
//		p.setC(10);
//		new porderDao().update(2, p);
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
		Connection conn = implDao.getDB();
		String sql = "select * from porder";
		String show = "";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				show = show + "<tr><td>" + rs.getInt("id") + "<td>" + rs.getString("desk") + "<td>" + rs.getInt("A")
						+ "<td>" + rs.getInt("B") + "<td>" + rs.getInt("C") + "<td>" + rs.getInt("sum") + "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public String querySum(int start, int end) {
		Connection conn = implDao.getDB();
		String sql = "select * from porder where sum>=? and sum<=?";
		String show = "";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				show = show + "<tr><td>" + rs.getInt("id") + "<td>" + rs.getString("desk") + "<td>" + rs.getInt("A")
						+ "<td>" + rs.getInt("B") + "<td>" + rs.getInt("C") + "<td>" + rs.getInt("sum") + "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public void update(int id, Object o) {
		Porder p1 = (Porder) o;
		Porder p2 = (Porder) new porderDao().queryObject(id);
		String SQL = "update porder set desk=?,A=?,B=?,C=?,sum=? where id=?";
		Connection conn = implDao.getDB();

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			if (p1.getDesk() != null)
				p2.setDesk(p1.getDesk());
			if (p1.getA() != null)
				p2.setA(p1.getA());
			if (p1.getB() != null)
				p2.setB(p1.getB());
			if (p1.getC() != null)
				p2.setC(p1.getB());
			ps.setString(1, p2.getDesk());
			ps.setInt(2, p2.getA());
			ps.setInt(3, p2.getB());
			ps.setInt(4, p2.getC());
			ps.setInt(5, p2.getSum());
			ps.setInt(6, p2.getId());

			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		Connection conn = implDao.getDB();
		String sql = "delete from company.porder where id=?;";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override

	public Object queryObject(int id) {
		Connection conn = implDao.getDB();
		String SQL = "select * from porder where id=?";
		Porder p = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				p = new Porder();

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
