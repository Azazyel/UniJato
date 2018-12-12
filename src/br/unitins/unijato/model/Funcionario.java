package br.unitins.unijato.model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends PessoaFisica {

	private static final long serialVersionUID = 2313966160767732895L;

	private String senha;
	private String cargo;
	private TipoUsuario tipoUsuario;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
