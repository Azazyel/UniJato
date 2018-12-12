package br.unitins.unijato.model;

import java.util.Arrays;
import java.util.List;

public enum TipoUsuario {

	ADMINSTRADOR(0, "Adminstrador",
			Arrays.asList("entrada.xhtml", "entradaPF.xhtml", "entradaPJ.xhtml", "funcionario.xhtml", "cliente.xhtml",
					"servico.xhtml", "relatorio.xhtml")),
	USUARIO_COMUM(1, "Usuário Comum", Arrays.asList("entrada.xhtml", "entradaPF.xhtml", "entradaPJ.xhtml", "cliente.xhtml",
			"servico.xhtml", "relatorio.xhtml"));

	private int id;
	private String label;
	private List<String> pages;

	private TipoUsuario(int id, String label, List<String> pages) {
		this.id = id;
		this.label = label;
		this.pages = pages;

	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public List<String> getPages() {
		return pages;
	}
}