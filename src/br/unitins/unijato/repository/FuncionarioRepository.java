package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Funcionario;

public class FuncionarioRepository extends Repository<Funcionario>{

	public FuncionarioRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> getFuncionario() {
		List<Funcionario> Lista = getEntityManager().createQuery("Select p From Funcionario p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Funcionario>();
		return Lista;
	}
	
}
