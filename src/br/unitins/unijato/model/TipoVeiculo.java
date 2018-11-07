package br.unitins.unijato.model;

public enum TipoVeiculo {
	HAT(0, "Modelo Hat"),
	SEDAN(1, "Modelo Sedan"),
	CAMINHONETE(2, "Caminhonete"),
	MICROONIBUS(3, "Micro �nibus"),
	CARGA(4, "Ve�culos de Carga (Carretas, Caminh�es"),
	TRACAO(5, "Ve�culos de Tra��o (Trator)");

	private int id;
	private String label;

	private TipoVeiculo(int id, String label) {
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
