package br.unitins.unijato.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.unijato.application.Util;
import br.unitins.unijato.factory.JPAFactory;
import br.unitins.unijato.model.Usuario;
import br.unitins.unijato.repository.UsuarioRepository;

@Named
@RequestScoped
public class LoginController extends DefaultController{
	
	private static final long serialVersionUID = 1627534002529974345L;
	
private Usuario usuario;
	
	public String entrar() {
		UsuarioRepository repository = 
				new UsuarioRepository(JPAFactory.getEntityManager());
		Usuario usuarioValidado = repository
				.getUsuario(getUsuario().getEmail(), getUsuario().getSenha());
		
		if (usuarioValidado == null) {
			Util.addErroMessage("Usuário ou Senha inválido.");
			return null;
		}
		// setando o usuario na sessao
		setUsuarioLogado(usuarioValidado);
		
		return "cadastropessoa4.xhtml";
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
