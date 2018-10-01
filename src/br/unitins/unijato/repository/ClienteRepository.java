package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Cliente;

public class ClienteRepository extends Repository<Cliente>{

	public ClienteRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> getCliente() {
		List<Cliente> Lista = getEntityManager().createQuery("Select p From Cliente p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Cliente>();
		return Lista;
	}

}
