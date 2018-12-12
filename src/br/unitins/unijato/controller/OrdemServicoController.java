package br.unitins.unijato.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import br.unitins.unijato.model.OrdemServico;
import br.unitins.unijato.repository.OrdemServicoRepository;

@Named
@ViewScoped
public class OrdemServicoController extends Controller<OrdemServico> {

	public OrdemServicoController() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 4961007223933510368L;

	private List<OrdemServico> listaOrdemServico = null;
	
	private boolean skip;

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
	
	public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

}
