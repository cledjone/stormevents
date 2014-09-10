package projeto.stormevents.dados;

import projeto.framework.persistence.GenericoIDAO;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.seguranca.LoginInvalidoException;

public interface UsuarioIDAO  extends GenericoIDAO<Usuario> {

	public Usuario efetuarLogin(String login, String senha) throws LoginInvalidoException;
}
