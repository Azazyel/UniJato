package br.unitins.unijato.controller;

import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.unitins.unijato.model.Funcionario;
import br.unitins.unijato.repository.FuncionarioRepository;

@Named
@ViewScoped
public class FuncionarioController extends Controller<Funcionario>{

	private static final long serialVersionUID = 4961007223933510368L;
	
	
	private List<Funcionario> listaFuncionario = null;
	private String pesquisa;
	
	public void limpar() {
		setEntity(null);
		listaFuncionario = null;
	}
	
	public List<Funcionario> getListaFuncionario() {
		FuncionarioRepository repository = new FuncionarioRepository(getEntityManager());
		if (listaFuncionario == null)
			listaFuncionario = repository.getFuncionario();
		return listaFuncionario;
	}
	
	public void pesquisarCPF() {
		FuncionarioRepository repository = new FuncionarioRepository(getEntityManager());
		listaFuncionario = repository.getFuncionarioByCpf(getPesquisa());
		Funcionario busca = listaFuncionario.get(0);
		setEntity(busca);
	}
	
	public Funcionario getEntity() {
		if (entity == null)
			entity = new Funcionario();
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

	
	
}
