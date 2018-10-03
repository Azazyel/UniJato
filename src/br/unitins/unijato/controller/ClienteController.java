package br.unitins.unijato.controller;

import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.Cliente;
import br.unitins.unijato.repository.ClienteRepository;

@Named
@ViewScoped
public class ClienteController extends Controller<Cliente>{
	
	private static final long serialVersionUID = -7505803932181465866L;
	
	private List<Cliente> listaLogin = null;
	
	public void limpar() {
		setEntity(null);
		listaLogin = null;
	}
	
	public List<Cliente> getListaCliente() {
		ClienteRepository repository = new ClienteRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getCliente();
		return listaLogin;
	}
	
	public Cliente getEntity() {
		if (entity == null)
			entity = new Cliente();
		return entity;
	}
	
}
