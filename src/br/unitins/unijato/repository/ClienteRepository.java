package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.ClienteFisico;

public class ClienteRepository extends Repository<ClienteFisico>{

	public ClienteRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<ClienteFisico> getCliente() {
		List<ClienteFisico> Lista = getEntityManager().createQuery("Select p From Cliente p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<ClienteFisico>();
		return Lista;
	}

}
