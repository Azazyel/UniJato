package br.unitins.unijato.controller;

import java.io.Serializable;

import br.unitins.unijato.application.Session;
import br.unitins.unijato.model.Usuario;

public class DefaultController implements Serializable{
	
	private static final long serialVersionUID = 3116079503362566310L;
	
	private static final String userKey = "usuarioLogado";
	
	public Usuario getUsuarioLogado() {
		return (Usuario) Session.getInstance().getAttribute(userKey);
	}

	public void setUsuarioLogado(Usuario usuario) {
		Session.getInstance().setAttribute(userKey, usuario);
	}
	
	public void encerrarSessao() {
		Session.getInstance().invalidateSession();
	}
	
}
