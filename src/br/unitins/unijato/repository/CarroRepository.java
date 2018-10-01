package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Carro;

public class CarroRepository extends Repository<Carro>{

	public CarroRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Carro> getCarro() {
		List<Carro> Lista = getEntityManager().createQuery("Select p From Carro p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Carro>();
		return Lista;
	}
	
}
