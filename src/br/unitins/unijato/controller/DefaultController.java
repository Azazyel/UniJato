package br.unitins.unijato.controller;

import java.io.Serializable;

import br.unitins.unijato.application.Session;
import br.unitins.unijato.model.Funcionario;

public class DefaultController implements Serializable{
	
	private static final long serialVersionUID = 3116079503362566310L;
	
	private static final String userKey = "usuarioLogado";
	
	public Funcionario getUsuarioLogado() {
		return (Funcionario) Session.getInstance().getAttribute(userKey);
	}

	public void setUsuarioLogado(Funcionario fusuario) {
		Session.getInstance().setAttribute(userKey, fusuario);
	}
	
	public void encerrarSessao() {
		Session.getInstance().invalidateSession();
	}
	
}
