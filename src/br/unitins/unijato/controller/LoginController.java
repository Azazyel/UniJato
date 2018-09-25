package br.unitins.unijato.controller;

import java.util.List;
import javax.inject.Named;
import br.unitins.unijato.model.Login;
import br.unitins.unijato.repository.LoginRepository;

@Named
@javax.faces.view.ViewScoped
public class LoginController extends Controller<Login> {

	private static final long serialVersionUID = -1865949396726049923L;
	
	private List<Login> listaLogin = null;
	
	public void limpar() {
		setEntity(null);
		listaLogin = null;
	}
	
	public List<Login> getListaLogin() {
		LoginRepository repository = new LoginRepository(getEntityManager());
		if (listaLogin == null)
			listaLogin = repository.getLogin();
		
		return listaLogin;
	}

	public Login getEntity() {
		if (entity == null)
			entity = new Login();
		return entity;
	}
	
}
