package br.unitins.unijato.controller;

import java.util.List;
import javax.inject.Named;
import br.unitins.unijato.model.Carro;
import br.unitins.unijato.repository.CarroRepository;

@Named
@javax.faces.view.ViewScoped
public class CarroController extends Controller<Carro>{
	
	private static final long serialVersionUID = 2285090812059600632L;
	
	private List<Carro> listaLogin = null;
	
	public Carro getEntity() {
		if (entity == null)
			entity = new Carro();
		return entity;
	}

	public void limpar() {
		setEntity(null);
		listaLogin = null;		
	}
	
	public List<Carro> getListaCarro() {
		CarroRepository repository = new CarroRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getCarro();
		return listaLogin;
	}
	
}
