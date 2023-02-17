package org.tnsindia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	//static block is used to initialize static variable
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	//static method
	public static EntityManager getEntityManager1()
	{
		
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
		
	}

	public static EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
