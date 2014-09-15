package projeto.stormevents.fachada;

import java.util.List;

import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.seguranca.LoginInvalidoException;

public interface IFachada {
	
	//Usu�rio
	
	public void inserirUsuario(Usuario usuario);

	public List<Usuario> consultarTodosUsuarios();

	public void removerUsuario(Usuario usuario);

	public void alterarUsuario(Usuario usuario) throws Exception;

	void logarUsuario(Usuario usuario) throws LoginInvalidoException;

}
