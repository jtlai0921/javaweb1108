package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface implDao {
	//連線entitymanager
	static EntityManager get()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("company");
		
		EntityManager em=emf.createEntityManager();
		
		return em;
	}
}