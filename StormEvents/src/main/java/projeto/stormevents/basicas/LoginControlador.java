package projeto.stormevents.basicas;

import projeto.stormevents.dados.LoginDAO;
import projeto.stormevents.dados.LoginIDAO;
import projeto.stormevents.dados.UsuarioDAO;

public class LoginControlador {

	private LoginDAO LoginDAO;
	

 public LoginControlador() {
	LoginDAO = new LoginDAO();
			}	
}
