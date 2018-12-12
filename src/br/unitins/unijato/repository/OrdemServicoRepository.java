package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.unitins.unijato.model.ClienteFisico;
import br.unitins.unijato.model.OrdemServico;

public class OrdemServicoRepository extends Repository<ClienteFisico>{

	public OrdemServicoRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<OrdemServico> getOrdemServico() {
		List<OrdemServico> Lista = getEntityManager().createQuery("Select p From OrdemServico p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<OrdemServico>();
		return Lista;
	}
	

}
