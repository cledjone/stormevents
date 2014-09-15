package projeto.stormevents.fachada;

import java.util.List;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.basicas.CategoriaDespesas;
import projeto.stormevents.seguranca.LoginInvalidoException;

public interface IFachada {
	
	//Usuário
	
	public void inserirUsuario(Usuario usuario);

	public List<Usuario> consultarTodosUsuarios();

	public void removerUsuario(Usuario usuario);

	public void alterarUsuario(Usuario usuario) throws Exception;

	void logarUsuario(Usuario usuario) throws LoginInvalidoException;
	
	//categoria de Despesas
	
	public void inserirCategoriaDespesas(CategoriaDespesas categoriaDespesas);
	
	public List<CategoriaDespesas> consultarTodasCategoriasDespesas();

	public void removerCategoriaDespesas(CategoriaDespesas categoriaDespesas);

	public void alterarCategoriaDespesas(CategoriaDespesas categoriaDespesas);
	
	public CategoriaDespesas consultarPorIdCategoriaDespesas(Integer id);

}
