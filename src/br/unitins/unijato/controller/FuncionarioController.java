package br.unitins.unijato.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unijato.application.Util;
import br.unitins.unijato.model.Funcionario;
import br.unitins.unijato.model.TipoUsuario;
import br.unitins.unijato.repository.FuncionarioRepository;

@Named
@ViewScoped
public class FuncionarioController extends Controller<Funcionario> {

	public FuncionarioController() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 4961007223933510368L;

	private String pesquisa;

	private List<Funcionario> listaFuncionario = null;

	@Override
	public Funcionario incluir() {
		String senhaEncriptada = Util.encrypt(getEntity().getSenha());
		getEntity().setSenha(senhaEncriptada);
		
		return super.incluir();
	}
	
	@Override
	public Funcionario alterar() {
		String senhaEncriptada = Util.encrypt(getEntity().getSenha());
		getEntity().setSenha(senhaEncriptada);
		
		return super.alterar();
	}
	
	public void limpar() {
		setEntity(null);
		listaFuncionario = null;
	}

	public void pesquisar() {
		FuncionarioRepository repository = new FuncionarioRepository(getEntityManager());
		listaFuncionario = repository.getFuncionarios(pesquisa);
	}

	public List<Funcionario> getListaFuncionario() {
		if (listaFuncionario == null)
			listaFuncionario = new ArrayList<Funcionario>();
		return listaFuncionario;
	}

	@Override
	public Funcionario getEntity() {
		if (entity == null) {
			entity = new Funcionario();
		}
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	public TipoUsuario[] getVetorTipoUsuario() {
		return TipoUsuario.values();
	}

}
