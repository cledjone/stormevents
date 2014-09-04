package projeto.stormevents.presentation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import projeto.stormevents.business.Usuario;
import projeto.stormevents.facade.Fachada;
import projeto.stormevents.facade.IFachada;

@ManagedBean
@SessionScoped
public class UsuarioBean {
	
	private IFachada fachada = Fachada.getInstancia();	
	private Usuario usuario = new Usuario();
	
	public String inserirCliente(){
		try{
			fachada.inserirUsuario(usuario);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário cadastrado com sucesso!"));
		}catch (Exception e){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro ao cadastrar Usuário!"));
		}
		return "usuarioCAD.xthml";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
