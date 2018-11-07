package br.unitins.unijato.model;

import javax.persistence.Entity;

@Entity
public class Carro extends DefaultEntity<Carro>{
	
	private static final long serialVersionUID = 5020670419551155114L;
	
	private String placa;
	private String modelo;
	private String marca;
	private TipoVeiculo tipoVeiculo;
	
	public Carro() {
		//default
	}

	public Carro(String placa, String modelo, String marca, TipoVeiculo tipoVeiculo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.tipoVeiculo = tipoVeiculo;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
}
