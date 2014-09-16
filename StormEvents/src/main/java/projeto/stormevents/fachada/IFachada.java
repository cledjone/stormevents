package projeto.stormevents.fachada;

import java.util.List;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.seguranca.LoginInvalidoException;

public interface IFachada {
	
	//Usuário
	
	public void inserirUsuario(Usuario usuario) throws Exception;

	public List<Usuario> consultarTodosUsuarios();

	public List<Usuario> consultarPorNome(String nome);
	
	public void removerUsuario(Usuario usuario);

	public void alterarUsuario(Usuario usuario);

	void logarUsuario(Usuario usuario) throws LoginInvalidoException;

}
