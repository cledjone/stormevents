package projeto.stormevents.controlador;

import java.util.List;

import projeto.stormevents.basicas.Login;
import projeto.stormevents.dados.LoginDAO;
import projeto.stormevents.dados.LoginIDAO;
import projeto.stormevents.dados.UsuarioDAO;

public class LoginControlador {

	private LoginDAO LoginDAO;
	

 public LoginControlador() {
	LoginDAO = new LoginDAO();
			}	
 public void inserirLogin (Login login){
		LoginDAO.inserir(login);	
	}
	public List<Login> consultarTodos(){
		return LoginDAO.consultarTodos();	
	}
	public void alterarLogin (Login login){
		LoginDAO.alterar(login);	
	}
	public void removerUsuario (Login login){
		LoginDAO.remover(login);
	}

}
