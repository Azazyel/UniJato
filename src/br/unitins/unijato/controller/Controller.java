package br.unitins.unijato.controller;

import java.io.Serializable;
import javax.persistence.EntityManager;
import br.unitins.unijato.application.Util;
import br.unitins.unijato.factory.JPAFactory;
import br.unitins.unijato.model.DefaultEntity;
import br.unitins.unijato.repository.Repository;

public abstract class Controller<T extends DefaultEntity<T>> implements Serializable{

	private static final long serialVersionUID = 6952529668476342827L;
	
private EntityManager em = null;
	
	protected T entity = null;
	
	public abstract T getEntity();
	
	public void setEntity(T entity) {
		this.entity = entity;
	}
	
	protected EntityManager getEntityManager() {
		if (em == null)
			em = JPAFactory.getEntityManager();
		return em;
	}
	
	public abstract void limpar();
	
	public T incluir() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		T result = repository.save(getEntity());
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Inclusão realizada com sucesso!");
		return result;
	}
	
	public T alterar() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		T result = repository.save(getEntity());
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Alteração realizada com sucesso!");
		return result;
	}
	
	public void remover() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		repository.remove(getEntity());
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Remoção realizada com sucesso!");
	}
	
}
