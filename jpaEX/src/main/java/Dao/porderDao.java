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

		System.out.println(p1.getId() + "\t" + p1.getDesk() + "\t" + p1.getSum());

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

}