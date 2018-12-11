package br.unitins.unijato.controller;

import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.Servico;
import br.unitins.unijato.repository.ServicoRepository;
import br.unitins.unijato.validation.Validation;

@Named
@ViewScoped
public class ServicoController extends Controller<Servico>{
	
	public ServicoController() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -4542704290674238983L;
	
	private List<Servico> listaLogin = null;
	
	public Servico getEntity() {
		if (entity == null)
			entity = new Servico();
		return entity;
	}

	public void limpar() {
		setEntity(null);
		listaLogin = null;	
	}
	
	public List<Servico> getListaServico() {
		ServicoRepository repository = new ServicoRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getServico();
		return listaLogin;
	}
	
}
