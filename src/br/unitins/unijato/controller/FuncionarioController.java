package br.unitins.unijato.controller;

import java.util.List;
import javax.inject.Named;
import br.unitins.unijato.model.Funcionario;
import br.unitins.unijato.repository.FuncionarioRepository;

@Named
@javax.faces.view.ViewScoped
public class FuncionarioController extends Controller<Funcionario>{

	private static final long serialVersionUID = 4961007223933510368L;
	
	private List<Funcionario> listaLogin = null;
	
	public void limpar() {
		setEntity(null);
		listaLogin = null;
	}
	
	public List<Funcionario> getListaFuncionario() {
		FuncionarioRepository repository = new FuncionarioRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getFuncionario();
		return listaLogin;
	}

	public Funcionario getEntity() {
		if (entity == null)
			entity = new Funcionario();
		return entity;
	}
	
}
