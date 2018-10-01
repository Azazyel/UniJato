package br.unitins.unijato.model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Cliente extends DefaultEntity<Cliente>{
	
	private static final long serialVersionUID = -8507170722133870368L;
	
	@Transient
	private String cpf;
	private String rg;
	private String nome;
	private String email;
	private String senha;
	private int vip;
	
	public Cliente() {
		//Default
	}
	
	public Cliente(String cpf, String rg, String nome, String email, String senha, int vip) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.vip = vip;
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

	public int getVip() {
		return vip;
	}

	public void setVip(int vip) {
		this.vip = vip;
	}
	
}
