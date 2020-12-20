package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class porderDao implements implDao{

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("company");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		System.out.println(em);

	}

}