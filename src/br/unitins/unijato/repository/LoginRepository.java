package br.unitins.unijato.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.unitins.unijato.model.Login;

public class LoginRepository extends Repository<Login>{

	public LoginRepository(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Login> getLogin(){
		List<Login> Lista = getEntityManager().createQuery("Select p From Login p Order by p.id desc").getResultList();
		if (Lista == null)
			Lista = new ArrayList<Login>();
		return Lista;
	}
	
}
