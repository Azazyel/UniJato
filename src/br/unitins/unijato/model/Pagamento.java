package br.unitins.unijato.model;

import javax.persistence.Entity;

@Entity
public class Pagamento extends DefaultEntity<Pagamento>{
	
	private static final long serialVersionUID = 5020670419551155114L;
	
	private double valor;
	private FormaPagamento formaPagamento;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	

	 
}
