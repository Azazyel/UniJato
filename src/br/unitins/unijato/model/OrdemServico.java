package br.unitins.unijato.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OrdemServico extends DefaultEntity<OrdemServico>{

	private static final long serialVersionUID = 1832053982196339845L;
	
	private String status;
	
	@Temporal(TemporalType.DATE)
	private Date dataEntrada;
	
	@Temporal(TemporalType.DATE)
	private Date dataSaida;
	
	private double total;
	private double desconto;
	
	@ManyToOne
	@JoinColumn(name="idClienteFisico")
	private ClienteFisico clienteFisico;
	
	@ManyToOne
	@JoinColumn(name="idCarro")
	private Carro carro;
	
	@ManyToOne
	@JoinColumn(name="idServico")
	private Servico servico;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idPagamento", unique=true)
	private Pagamento pagamento;
	
	public Carro getCarro() {
		if(carro == null)
			carro = new Carro();
		return carro;
	}
	
	public Pagamento getPagamento() {
		if(pagamento == null)
			pagamento = new Pagamento();
		return pagamento;
	}
	
	
	public Servico getServico() {
		if(servico == null)
			servico = new Servico();
		return servico;
	}

	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public ClienteFisico getClienteFisico() {
		if(clienteFisico == null)
			clienteFisico = new ClienteFisico();
		return clienteFisico;
	}

	public void setClienteFisico(ClienteFisico clienteFisico) {
		this.clienteFisico = clienteFisico;
	}
	
	


}
