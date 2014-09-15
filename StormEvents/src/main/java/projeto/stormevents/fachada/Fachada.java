package projeto.stormevents.fachada;

import java.util.List;

import projeto.stormevents.basicas.CategoriaDespesas;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.controlador.CategoriaDespesasControlador;
import projeto.stormevents.controlador.UsuarioControlador;
import projeto.stormevents.seguranca.LoginInvalidoException;

public class Fachada implements IFachada {

	private static IFachada fachada;
	private UsuarioControlador usuarioControlador;
	private CategoriaDespesasControlador categoriadespesasControlador;

	private Fachada() {
		this.usuarioControlador = new UsuarioControlador();
		this.categoriadespesasControlador = new CategoriaDespesasControlador();
	}

	public static IFachada getInstancia() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}

	// USUARIO
	@Override
	public void inserirUsuario(Usuario usuario) {
		usuarioControlador.inserirUsuario(usuario);
	}

	@Override
	public List<Usuario> consultarTodosUsuarios() {
		return usuarioControlador.consultarTodos();
	}

	@Override
	public void removerUsuario(Usuario usuario) {
		usuarioControlador.removerUsuario(usuario);
	}

	@Override
	public void alterarUsuario(Usuario usuario) throws Exception {
		usuarioControlador.alterarUsuario(usuario);
	}
	
	@Override
	public void logarUsuario (Usuario usuario) throws LoginInvalidoException{
		usuarioControlador.logarUsuario(usuario);
	}
 
	// CATEGORIA DE DESPESAS 
	@Override
	public void inserirCategoriaDespesas(CategoriaDespesas categoriaDespesas) {
		categoriadespesasControlador.inserirCategoriaDespesas(categoriaDespesas);
	}

	@Override
	public List<CategoriaDespesas> consultarTodasCategoriasDespesas() {
		return categoriadespesasControlador.consultarTodos();
	}

	@Override
	public void removerCategoriaDespesas(CategoriaDespesas categoriaDespesas) {
		categoriadespesasControlador.removerCategoriaDespesas(categoriaDespesas);
	}

	@Override
	public void alterarCategoriaDespesas(CategoriaDespesas categoriaDespesas) {
		categoriadespesasControlador.alterarCategoriaDespesas(categoriaDespesas);
	}

	@Override
	public CategoriaDespesas consultarPorIdCategoriaDespesas(Integer id) {
		return categoriadespesasControlador.consultarporIdCategoriaDespesas(id);
	}
}
