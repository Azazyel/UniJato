package br.unitins.unijato.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unitins.unijato.model.Pessoa;

@Entity
public class Telefone extends DefaultEntity<Telefone>{
	
	private static final long serialVersionUID = -153668723739742862L;
	
	private String codigoArea;
	private String numero;
	
	@ManyToOne
	@JoinColumn(name="idPessoa")
	private Pessoa pessoa;
	
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
