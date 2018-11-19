package br.unitins.unijato.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Usuario extends DefaultEntity<Usuario>{
	
	private static final long serialVersionUID = -1021289129125523516L;
	
	private String nome;
	@Column(unique=true)
	private String email;
	private String senha;
	private TipoUsuario tipoUsuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
