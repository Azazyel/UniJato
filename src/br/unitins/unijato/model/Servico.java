package br.unitins.unijato.model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Servico extends DefaultEntity<Servico>{
	
	private static final long serialVersionUID = -5367935915343728731L;
	
	@Transient
	private String nome;
	private String descricao;
	private double valor;
	
	public Servico() {
		//Default
	}
	
	public Servico(String nome, String descricao, double valor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
