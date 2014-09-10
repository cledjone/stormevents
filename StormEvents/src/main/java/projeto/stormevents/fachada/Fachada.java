package projeto.stormevents.fachada;

import java.util.List;

import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.controlador.UsuarioControlador;

public class Fachada implements IFachada {

	private static IFachada fachada;
	private UsuarioControlador usuarioControlador;

	private Fachada() {
		this.usuarioControlador = new UsuarioControlador();
	}

	public static IFachada getInstancia() {
		if (fachada == null) {
			fachada = new Fachada();
		}
		return fachada;
	}

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
	public void alterarUsuario(Usuario usuario) {
		usuarioControlador.alterarUsuario(usuario);
	}

	
}
