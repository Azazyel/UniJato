package br.unitins.unijato.model;

public enum FormaPagamento {
	DINHEIRO(0, "Dinheiro"),
	CARTAO_DEBITO(1, "Cartão - Débito"),
	CARTAO_CREDITO(2, "Cartão - Crédito");

	private int id;
	private String label;

	private FormaPagamento(int id, String label) {
		this.id = id;
		this.label = label;
	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}


}
