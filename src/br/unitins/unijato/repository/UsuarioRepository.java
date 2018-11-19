package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unitins.unijato.application.Util;
import br.unitins.unijato.model.Usuario;

public class UsuarioRepository extends Repository<Usuario>{
	
	public UsuarioRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios(String nome) {
		Query query = getEntityManager().
				createQuery("Select u From Usuario u WHERE LOWER(u.nome) LIKE LOWER(:nome) Order by u.nome");
		query.setParameter("nome", "%" + nome + "%");
		List<Usuario> lista = query.getResultList();
		
		if (lista == null)
			lista = new ArrayList<Usuario>();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public Usuario getUsuario(String email, String senha) {
		
		Query query = getEntityManager().
				createQuery("Select "
						  + "  u "
						  + "From "
						  + "  Usuario u "
						  + "WHERE "
						  + "  u.email = :email AND "
						  + "  u.senha = :senha ");
		
		query.setParameter("email", email);
		query.setParameter("senha", Util.encrypt(senha));
		
		List<Usuario> lista = query.getResultList();
		
		if (lista == null || lista.isEmpty())
			return null;
		
		return lista.get(0);
	}
	
}
