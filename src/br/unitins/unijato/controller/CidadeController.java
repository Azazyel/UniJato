package br.unitins.unijato.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unijato.model.Cidade;

@Named
@ViewScoped
public class CidadeController extends Controller<Cidade> {

	private static final long serialVersionUID = -5444401421994038881L;

	public Cidade getEntity() {
		if (entity == null)
			entity = new Cidade();
		return entity;
	}

	public void limpar() {
		setEntity(null);
	}

}
