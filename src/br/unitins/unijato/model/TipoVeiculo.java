package br.unitins.unijato.model;

public enum TipoVeiculo {
	HAT(0, "Modelo Hat"),
	SEDAN(1, "Modelo Sedan"),
	CAMINHONETE(2, "Caminhonete"),
	MICROONIBUS(3, "Micro Ônibus"),
	CARGA(4, "Veículos de Carga (Carretas, Caminhões"),
	TRACAO(5, "Veículos de Tração (Trator)");

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
