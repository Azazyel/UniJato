package br.unitins.unijato.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
private JPAFactory() {}
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("unijato");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
