package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import Model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		//System.out.println(implDao.get());
		
		porder p=new porder("你很帥",4,4,4);
		
		new porderDao().add(p);

	}

	@Override
	public void add(Object o) {		
		porder p=(porder)o;
		EntityManager em=implDao.get();		
		EntityTransaction t=em.getTransaction();
		
		t.begin();
		em.persist(p);
		t.commit();
		
		em.close();
		
		
		
	}

}