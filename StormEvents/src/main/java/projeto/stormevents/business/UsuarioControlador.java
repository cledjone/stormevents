package projeto.stormevents.business;

import java.util.List;
import projeto.stormevents.persistence.UsuarioDAO;
import projeto.stormevents.persistence.UsuarioIDAO;

public class UsuarioControlador {

	private UsuarioIDAO usuarioDAO;

	public UsuarioControlador (){
		usuarioDAO = new UsuarioDAO();
	}

	public void inserirUsuario (Usuario usuario){
		usuarioDAO.inserir(usuario);	
	}
	public List<Usuario> consultarTodos(){
		return usuarioDAO.consultarTodos();	
	}
	public void alterarUsuario (Usuario usuario){
		usuarioDAO.alterar(usuario);	
	}
	public void removerUsuario (Usuario usuario){
		usuarioDAO.remover(usuario);
	}
}
