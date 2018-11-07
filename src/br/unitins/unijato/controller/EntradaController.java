package br.unitins.unijato.controller;

import java.util.List;
import java.util.Random;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.Entrada;
import br.unitins.unijato.repository.EntradaRepository;

@Named
@ViewScoped
public class EntradaController extends Controller<Entrada> {

	private static final long serialVersionUID = -6378541616489228055L;
	
	private List<Entrada> listaEntrada;
	
	public Entrada getEntity() {
		if (entity == null)
			entity = new Entrada();
		return entity;
	}
	
	public void limpar() {
		setEntity(null);
		listaEntrada = null;		
	}
	
	 
	
	public List<Entrada> getListaEntrada() {
		EntradaRepository repository = new EntradaRepository(getEntityManager());
		if (listaEntrada == null)
			listaEntrada = repository.getEntrada();
		return listaEntrada;
	}
	
}
