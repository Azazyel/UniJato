package br.unitins.unijato.controller;
import javax.persistence.EntityManager;
import javax.persistence.OptimisticLockException;

import br.unitins.unijato.factory.JPAFactory;
import br.unitins.unijato.model.DefaultEntity;
import br.unitins.unijato.repository.Repository;
import br.unitins.unijato.validation.Validation;
import br.unitins.unijato.application.Util;
import br.unitins.unijato.application.ValidationException;

public abstract class Controller<T extends DefaultEntity<? super T>> extends DefaultController {
	
	private Validation<T> validation = null;
	
	private static final long serialVersionUID = -4859697154833778954L;
	
	private EntityManager em = null;
	
	protected T entity = null;
	
	public abstract T getEntity();
	
	public Controller(Validation<T> validation) {
		this.validation = validation;
	}
	
	public Validation<T> getValidation() {
		return validation;
	}
	
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
		
		try {
			if (getValidation() !=null)
				getValidation().validate(getEntity());
		} catch (ValidationException e) {
			Util.addErroMessage(e.getMessage());
			return null;
		}
		
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		
		// incluir 
		T result = repository.save(getEntity());
		
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Inclusão realizada com sucesso!");
		return result;
	}
	
	public T alterar() {
		try {
			if (getValidation() !=null)
				getValidation().validate(getEntity());
	
			Repository<T> repository = new Repository<T>(getEntityManager());
			getEntityManager().getTransaction().begin();
			
			// alterar 
			T result = repository.save(getEntity());
			
			getEntityManager().getTransaction().commit();
			limpar();
			Util.addInfoMessage("Alteração realizada com sucesso!");
			return result;
		} catch (OptimisticLockException exception) {
			// capiturando a excecao do version
			Util.addInfoMessage("Erro de concorrencia.");
			return null;
		} catch (ValidationException e) {
			Util.addErroMessage(e.getMessage());
			return null;
		}
	}
	
	public void remover() {
		Repository<T> repository = new Repository<T>(getEntityManager());
		getEntityManager().getTransaction().begin();
		
		// remover 
		repository.save(getEntity());
		repository.remove(getEntity());
		
		getEntityManager().getTransaction().commit();
		limpar();
		Util.addInfoMessage("Remoção realizada com sucesso!");
	}
}