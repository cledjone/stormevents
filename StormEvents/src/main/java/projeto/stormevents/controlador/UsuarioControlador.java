package projeto.stormevents.controlador;

import java.util.List;

import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.dados.UsuarioDAO;
import projeto.stormevents.dados.UsuarioIDAO;
import projeto.stormevents.seguranca.LoginInvalidoException;

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
	public void logarUsuario (Usuario usuario) throws LoginInvalidoException{
		usuarioDAO.efetuarLogin(usuario.getLogin(), usuario.getSenha());
	}
}
