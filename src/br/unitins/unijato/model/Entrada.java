package br.unitins.unijato.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Entrada extends DefaultEntity<Entrada> {

	private static final long serialVersionUID = 7225204238619919004L;
	
	private Integer codigo;
	private Date dataEntrada;
	private String status;
	private String tipoCliente;
	ClienteFisico cliente = new ClienteFisico();
	Carro carro = new Carro();
	Servico servico = new Servico();
		
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ClienteFisico getCliente() {
		return cliente;
	}
	public void setCliente(ClienteFisico cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	
	
}
