package br.unitins.unijato.controller;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.Carro;
import br.unitins.unijato.repository.CarroRepository;
import br.unitins.unijato.validation.Validation;

@Named
@ViewScoped
public class CarroController extends Controller<Carro>{
	
	public CarroController() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 2285090812059600632L;
	
	private List<Carro> listaCarro = null;
	
	public Carro getEntity() {
		if (entity == null)
			entity = new Carro();
		return entity;
	}

	public void limpar() {
		setEntity(null);
		listaCarro = null;		
	}
	
	public List<Carro> getListaCarro() {
		CarroRepository repository = new CarroRepository(getEntityManager());
		if (listaCarro == null)
			listaCarro = repository.getCarro();
		return listaCarro;
	}
	
}
