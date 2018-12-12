package br.unitins.unijato.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.unijato.application.Util;
import br.unitins.unijato.factory.JPAFactory;
import br.unitins.unijato.model.Funcionario;
import br.unitins.unijato.repository.FuncionarioRepository;

@Named
@RequestScoped
public class LoginController extends DefaultController{
	
	private static final long serialVersionUID = 1627534002529974345L;
	
	private Funcionario fusuario;
	
	public String entrar() {
		FuncionarioRepository repository = 
				new FuncionarioRepository(JPAFactory.getEntityManager());
		Funcionario usuarioValidado = repository
				.getFuncionarioLogin(getFuncionario().getCpf(), getFuncionario().getSenha());
		
		if (usuarioValidado == null) {
			Util.addErroMessage("CPF ou senha incorreto.");
			return null;
		}
		// setando o usuario na sessao
		setUsuarioLogado(usuarioValidado);
		
		return "entrada.xhtml";
	}

	public Funcionario getFuncionario() {
		if (fusuario == null)
			fusuario = new Funcionario();
		return fusuario;
	}

	public void setFuncionario(Funcionario fusuario) {
		this.fusuario = fusuario;
	}
	
}
