package projeto.stormevents.managedBeans;

import java.util.List;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import projeto.stormevents.basicas.Endereco;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.fachada.Fachada;
import projeto.stormevents.fachada.IFachada;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private IFachada fachada = Fachada.getInstancia();
	private Endereco endereco = new Endereco();
	private Usuario usuario = new Usuario();

	public String inserirUsuario() {
		try {
			usuario.setEndereco(endereco);
			fachada.inserirUsuario(usuario);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Usuário cadastrado com sucesso!"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Erro ao cadastrar Usuário!"));
		}
		return "usuarioCAD.xthml";
	}

	public String alterarUsuario() {
		try {
			fachada.alterarUsuario(usuario);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Usuario alterado com sucesso!"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Erro ao alterar usuario!"));
		}
		return "usuarioLIST.xhtml";
	}

	public String removerUsuario(Usuario usuario) {
		try {
			fachada.removerUsuario(usuario);;
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("usuarioLIST.xhtml");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Excluir", "Usuário excluído com Sucesso!.");

			FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Erro ao excluir Usuário!"));
		}
		return "";
	}

	public List<Usuario> getConsultarTodosUsuarios() {
		return fachada.consultarTodosUsuarios();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// ------------------------------------------------------------
	private boolean skip;

	private static Logger logger = Logger
			.getLogger(Usuario.class.getName());

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String onFlowProcess(FlowEvent event) {
		logger.info("Current wizard step:" + event.getOldStep());
		logger.info("Next step:" + event.getNewStep());

		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}
}
