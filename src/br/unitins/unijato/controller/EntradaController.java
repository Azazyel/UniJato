package br.unitins.unijato.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.unitins.unijato.model.Entrada;
import br.unitins.unijato.repository.EntradaRepository;

@Named
@ViewScoped
public class EntradaController extends Controller<Entrada> {

	private static final long serialVersionUID = -6378541616489228055L;
	
	private List<Entrada> listaEntrada;
	
	public Entrada getEntity() {
		if (entity == null)
			entity = new Entrada();
		return entity;
	}
	
	public void limpar() {
		setEntity(null);
		listaEntrada = null;		
	}
	
	public void gerarCodigo() {
		Random random = new Random();
		Calendar cal = Calendar.getInstance();
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);;
		int ano = cal.get(Calendar.YEAR);
		String rand = "" + ano + min + sec + random.nextInt(9)*2; //criar em forma de string para concatenar
		int cod = Integer.parseInt(rand); //converte o valor gerado que antes era String para INT
		entity.setCodigo(cod);
	}
		
	public List<Entrada> getListaEntrada() {
		EntradaRepository repository = new EntradaRepository(getEntityManager());
		if (listaEntrada == null)
			listaEntrada = repository.getEntrada();
		return listaEntrada;
	}
	
}
