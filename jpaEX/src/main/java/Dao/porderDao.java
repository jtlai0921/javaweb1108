package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import Model.porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
		// System.out.println(implDao.get());

		porder p = new porder("你很帥", 4, 4, 4);

		new porderDao().add(p);
		porder p1 = (porder) new porderDao().get(10);

		System.out.println(p1.getId() + "\t" + p1.getDesk() + "\t" + p1.getSum() + p1.getA());

		porder p2=new porder();
		p2.setDesk("很帥");
		p2.setA(50);
		p2.setB(30);
		
		new porderDao().update(2, p2);
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
}