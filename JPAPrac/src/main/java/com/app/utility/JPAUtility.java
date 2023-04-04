package com.app.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	private static EntityManagerFactory entityManagerFactory;
	private static void  buildEnitityManagerFactory() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		} catch (Throwable ex) {
			
			throw new RuntimeException(ex);
		}
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory == null)
			buildEnitityManagerFactory();
		return entityManagerFactory;
	}

}
