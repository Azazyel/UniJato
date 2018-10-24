package br.unitins.unijato.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import br.unitins.unijato.model.Telefone;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends DefaultEntity<Pessoa>{
	
	private static final long serialVersionUID = -1010108135666780063L;
	
	private String nome;
	private String endereco;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="pessoa", orphanRemoval=true)
	private List<Telefone> listaTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}
	
	
	
}
