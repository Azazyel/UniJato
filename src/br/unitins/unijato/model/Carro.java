package br.unitins.unijato.model;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Carro extends DefaultEntity<Carro>{
	
	private static final long serialVersionUID = 5020670419551155114L;
	
	@Transient
	private String placa;
	private String modelo;
	
	public Carro() {
		//Default
	}
	
	public Carro(String placa, String modelo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
