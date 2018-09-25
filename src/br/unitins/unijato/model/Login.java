package br.unitins.unijato.model;

import javax.persistence.Entity;
import javax.persistence.Transient;


@Entity
public class Login extends DefaultEntity<Login> {

	private static final long serialVersionUID = -1021289129125523516L;
	
	@Transient
	private String nome;
	private String senha;
	
	public Login() {
		//default
	}
	
	public Login(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
