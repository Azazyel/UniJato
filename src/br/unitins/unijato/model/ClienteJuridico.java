package br.unitins.unijato.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ClienteJuridico extends PessoaJuridica{

	private static final long serialVersionUID = 5961694088276471309L;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="clienteJuridico", orphanRemoval=true)
	private List<OrdemServico2> listaOrdemServico2;
 
	public List<OrdemServico2> getListaOrdemServico2() {
		return listaOrdemServico2;
	}

	public void setListaOrdemServico(List<OrdemServico2> listaOrdemServico2) {
		this.listaOrdemServico2 = listaOrdemServico2;
	}
	
}
