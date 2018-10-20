package br.unitins.unijato.listcontroller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.eclipse.persistence.internal.descriptors.PersistenceObjectAttributeAccessor;

import br.unitins.unijato.model.Cidade;
import br.unitins.unijato.repository.CidadeRepository;

@Named
@ViewScoped
public class CidadeListController extends ListController {

	private static final long serialVersionUID = -5679781584019187918L;

	private List<Cidade> listaCidade;
	private String nome;

	public List<Cidade> getListaCidade() {
		if (listaCidade == null) {
			listaCidade = new ArrayList<Cidade>();
		}
		return listaCidade;
	}

	public void setListaCidade(List<Cidade> listaCidade) {
		this.listaCidade = listaCidade;
	}

	public void pesquisar() {
		CidadeRepository repository = new CidadeRepository(getEntityManager());
		listaCidade = repository.getCidades(nome);
				
	}

}
