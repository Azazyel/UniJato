package br.unitins.unijato.model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends DefaultEntity<Funcionario>{
	
	private static final long serialVersionUID = 2313966160767732895L;
	
	private String cpf;
	private String rg;
	private String nome;
	private String email;
	private String senha;
	private String cargo;
	
	public Funcionario() {
		//Default
	}
	
	public Funcionario(String cpf, String rg, String nome, String email, String senha, String cargo) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
