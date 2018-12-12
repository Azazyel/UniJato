package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.unijato.application.Util;
import br.unitins.unijato.model.Funcionario;

public class FuncionarioRepository extends Repository<Funcionario> {

	public FuncionarioRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public Funcionario getFuncionarioLogin(String cpf, String senha) {
		
		Query query = getEntityManager().
				createQuery("Select "
						  + "  f "
						  + "From "
						  + "  Funcionario f "
						  + "WHERE "
						  + "  f.cpf = :cpf AND "
						  + "  f.senha = :senha ");
		
		query.setParameter("cpf", cpf);
		query.setParameter("senha", Util.encrypt(senha));
		
		List<Funcionario> lista = query.getResultList();
		
		if (lista == null || lista.isEmpty())
			return null;
		
		return lista.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> getFuncionarios(String nome) {
		Query query = getEntityManager().
				createQuery("Select p From Funcionario p WHERE LOWER(p.nome) LIKE LOWER(:nome) Order by p.nome");
		query.setParameter("nome", "%" + nome + "%");
		List<Funcionario> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Funcionario>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> getFuncionarios() {
		List<Funcionario> lista = getEntityManager().
				createQuery("Select p From Funcionario p Order by p.id desc").getResultList();
			if (lista == null)
				lista = new ArrayList<Funcionario>();
		return lista;
	}

}
