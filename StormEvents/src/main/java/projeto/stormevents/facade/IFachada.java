package projeto.stormevents.facade;

import java.util.List;

import projeto.stormevents.business.Usuario;

public interface IFachada {
	
	//Usuário
	
	public void inserirUsuario(Usuario usuario);

	public List<Usuario> consultarTodosUsuarios();

	public void removerUsuario(Usuario usuario);

	public void alterarUsuario(Usuario usuario);

}
