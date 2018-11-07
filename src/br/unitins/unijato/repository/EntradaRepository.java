package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Entrada;

public class EntradaRepository extends Repository<Entrada> {

	public EntradaRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Entrada> getEntrada() {
		List<Entrada> Lista = getEntityManager().createQuery("Select p From Entrada p Order by p.id").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Entrada>();
		return Lista;
	}
}
