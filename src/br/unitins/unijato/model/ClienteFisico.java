package br.unitins.unijato.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ClienteFisico extends PessoaFisica{

	private static final long serialVersionUID = -1575831688423813108L;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="clienteFisico", orphanRemoval=true)
	private List<OrdemServico> listaOrdemServico;

	public List<OrdemServico> getListaOrdemServico() {
		return listaOrdemServico;
	}

	public void setListaOrdemServico(List<OrdemServico> listaOrdemServico) {
		this.listaOrdemServico = listaOrdemServico;
	}
	
	
 
}
