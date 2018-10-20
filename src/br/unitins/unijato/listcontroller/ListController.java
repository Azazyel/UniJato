package br.unitins.unijato.listcontroller;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.unitins.unijato.factory.JPAFactory;

public class ListController implements Serializable{

	private static final long serialVersionUID = -8314117805432784568L;
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		if(entityManager == null) 
			entityManager = JPAFactory.getEntityManager();
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	

}
