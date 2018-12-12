package br.unitins.unijato.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unijato.model.FormaPagamento;
import br.unitins.unijato.model.OrdemServico;
import br.unitins.unijato.model.Servico;
import br.unitins.unijato.model.TipoVeiculo;
import br.unitins.unijato.repository.ServicoRepository;

@Named
@ViewScoped
public class OrdemServicoController2 extends Controller<OrdemServico> {

	private static final long serialVersionUID = 4961007223933510368L;

	public OrdemServicoController2() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private List<OrdemServico> listaOrdemServico = null;
	private List<Servico> servico = null;
	
	public void limpar() {
		setEntity(null);
		listaOrdemServico = null;
	}

	public List<OrdemServico> getListaOrdemServico() {
		if (listaOrdemServico == null)
			listaOrdemServico = new ArrayList<OrdemServico>();
		return listaOrdemServico;
	}

	@Override
	public OrdemServico getEntity() {
		if (entity == null) {
			entity = new OrdemServico();
		}
		return entity;
	}
	
		
	public List<Servico> getListaServico() {
		if (servico == null)
			servico = new ArrayList<Servico>();
		return servico;
	}


	public TipoVeiculo[] getVetorTipoVeiculo() {
		return TipoVeiculo.values();
	}
	
	public FormaPagamento[] getVetorFormaPagamento() {
		return FormaPagamento.values();
	}


}
