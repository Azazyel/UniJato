package br.unitins.unijato.controller;

import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.ClienteFisico;
import br.unitins.unijato.repository.ClienteRepository;
import br.unitins.unijato.validation.Validation;

@Named
@ViewScoped
public class ClienteController extends Controller<ClienteFisico>{
	
	public ClienteController() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -7505803932181465866L;
	
	private List<ClienteFisico> listaLogin = null;
	
	public void limpar() {
		setEntity(null);
		listaLogin = null;
	}
	
	public List<ClienteFisico> getListaCliente() {
		ClienteRepository repository = new ClienteRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getCliente();
		return listaLogin;
	}
	
	public ClienteFisico getEntity() {
		if (entity == null)
			entity = new ClienteFisico();
		return entity;
	}
	
}
