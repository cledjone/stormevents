package projeto.stormevents.fachada;

import java.util.List;

import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.controlador.UsuarioControlador;
import projeto.stormevents.seguranca.LoginInvalidoException;

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
	public void inserirUsuario(Usuario usuario) throws Exception{
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
	
	@Override
	public void logarUsuario (Usuario usuario) throws LoginInvalidoException{
		usuarioControlador.logarUsuario(usuario);
	}

	
}
