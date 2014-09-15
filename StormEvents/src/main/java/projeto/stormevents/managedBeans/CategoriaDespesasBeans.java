package projeto.stormevents.managedBeans;

import java.util.List;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
import projeto.stormevents.basicas.CategoriaDespesas;
import projeto.stormevents.basicas.Usuario;
import projeto.stormevents.fachada.Fachada;
import projeto.stormevents.fachada.IFachada;

@ManagedBean
@SessionScoped
public class CategoriaDespesasBeans {
	private IFachada fachada = Fachada.getInstancia();
	private CategoriaDespesas categoriadespesas = new CategoriaDespesas();
	
	
	public void novaCategoria(){
		this.categoriadespesas = new CategoriaDespesas();
	}
	
	
	
	public String inserirCategoriaDespesas(){
		try{
			categoriadespesas.setId(null);
			fachada.inserirCategoriaDespesas(categoriadespesas);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Categoria de Despesas cadastrado com sucesso!"));
		}catch (Exception e){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro ao cadastrar Categoria de Despesas!"));
		}
		return "categoriadespesasCIndex.xhtml";
	}
	
	public String alterarCategoriaDespesas() {
		try {
			fachada.alterarCategoriaDespesas(categoriadespesas);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Categoria de Despesas alterada com sucesso!"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Erro ao alterar Categoria De Despesas!"));
		}
		return "categoriadespesasCIndex.xhtml";
	}
	
	public String removerCategoriaDespesas(CategoriaDespesas categoriadespesas) {
		try {
			fachada.removerCategoriaDespesas(categoriadespesas);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Excluir", "Categoria excluída com Sucesso!");
			FacesContext.getCurrentInstance().getExternalContext().redirect("categoriadespesasCIndex.xhtml");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (Exception ex) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Erro ao excluir Categoria!"));
		}
		return "categoriadespesasCIndex.xhtml";
	}
	
	public List<CategoriaDespesas> getConsultarTodasCategoriaDespesas() {
		return fachada.consultarTodasCategoriasDespesas();
	}

	
	public CategoriaDespesas getCategoriadespesas() {
		return categoriadespesas;
	}

	public void setCategoriadespesas(CategoriaDespesas categoriadespesas) {
		this.categoriadespesas = categoriadespesas;
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
