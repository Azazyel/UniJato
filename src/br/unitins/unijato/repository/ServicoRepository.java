package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Servico;

public class ServicoRepository extends Repository<Servico>{

	public ServicoRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Servico> getServico() {
		List<Servico> Lista = getEntityManager().createQuery("Select p From Servico p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Servico>();
		return Lista;
	}
	
}
