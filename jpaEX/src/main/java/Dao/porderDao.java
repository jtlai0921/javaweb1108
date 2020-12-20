package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import Model.porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
//		 System.out.println(implDao.get());
//
//		 porder p = new porder("你很帥", 4, 4, 4);
//
//		// new porderDao().add(p);
//		// 增
//		 porder p1 = (porder) new porderDao().get(10);
//
//		 System.out.println(p1.getId() + "\t" + p1.getDesk() + "\t" + p1.getSum() +
//		 p1.getA());
//		// 查
//		porder p2=new porder();
//		p2.setDesk("很帥");
//		p2.setA(50);
//		p2.setB(30);
////		
////		new porderDao().update(2, p2);
//		// 修
//		// new porderDao().deleteId(36);
//		// 刪

//
//		for (Object o : l) {
//			porder p3 = (porder) o;
//			System.out.println(p3.getId() + "\t" + p3.getDesk() + "\t" + p3.getSum());
//		}
//		// 查表單
//		List<Object> l = new porderDao().queryAll();
//		Object[] p = l.toArray();
//		porder[] p2 = new porder[p.length];
//
//		for (int i = 0; i < p.length; i++) {
//			p2[i] = (porder) p[i];
//		}
//		System.out.println(p2[10].getDesk());
		//Array 第幾筆
		List l = new porderDao().querySum(5000, 140000);

		for (Object o : l) {
			porder p = (porder) o;
			System.out.println(p.getId() + "\t" + p.getDesk() + "\t" + p.getSum());
		}
		//總額區間查詢

	}

	@Override
	public void add(Object o) {
		porder p = (porder) o;
		EntityManager em = implDao.get();
		EntityTransaction t = em.getTransaction();

		t.begin();
		em.persist(p);
		t.commit();

		em.close();

	}

	@Override
	public Object get(Integer id) {
		EntityManager em = implDao.get();
		porder p = em.find(porder.class, id);

		return p;
	}

	@Override
	public void update(Integer id, Object o) {
		EntityManager em = implDao.get();

		porder p1 = (porder) o;
		porder p2 = (porder) new porderDao().get(id);

		if (p1.getDesk() != null)
			p2.setDesk(p1.getDesk());
		if (p1.getA() != null)
			p2.setA(p1.getA());
		if (p1.getB() != null)
			p2.setB(p1.getB());
		if (p1.getC() != null)
			p2.setC(p1.getC());

		p2.setSum(p2.getSum());

		EntityTransaction t = em.getTransaction();

		t.begin();
		em.merge(p2);
		t.commit();
		em.close();

	}

	@Override
	public void deleteId(Integer id) {
		EntityManager em = implDao.get();
		porder p = em.find(porder.class, id);

		EntityTransaction t = em.getTransaction();
		t.begin();
		em.remove(p);
		t.commit();
		em.close();

	}

	@Override
	public List<Object> queryAll() {
		String Jpql = "select p from porder p";
		EntityManager em = implDao.get();

		Query q = em.createQuery(Jpql);
		List l = q.getResultList();

		return l;
	}

	@Override
	public List<Object> querySum(Integer start, Integer end) {
		EntityManager em = implDao.get();
		String Jpql = "select p from porder p where p.sum>=?1 and p.sum<=?2";
		Query q = em.createQuery(Jpql);
		q.setParameter(1, start);
		q.setParameter(2, end);

		List l = q.getResultList();

		return l;
	}

}