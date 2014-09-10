package projeto.stormevents.dados;

import javax.persistence.TypedQuery;

import projeto.framework.persistence.GenericoDAO;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.seguranca.LoginInvalidoException;

public class UsuarioDAO extends GenericoDAO<Usuario> implements UsuarioIDAO  {
	
	public Usuario efetuarLogin(String login, String senha) throws LoginInvalidoException{
		try {
			TypedQuery<Usuario> query = getEntityManager().createNamedQuery("efetuarLogin", Usuario.class);
			query.setParameter("login", login);
			query.setParameter("senha", senha);
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new LoginInvalidoException();
		}
	}
}
