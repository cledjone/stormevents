package projeto.stormevents.controlador;


import java.util.List;
import projeto.stormevents.dados.CategoriaDespesasDAO;
import projeto.stormevents.dados.CategoriaDespesasIDAO;
import projeto.stormevents.basicas.CategoriaDespesas;

public class CategoriaDespesasControlador {
	private CategoriaDespesasIDAO categoriaDespesasDAO;
		
	public CategoriaDespesasControlador(){
		categoriaDespesasDAO = new CategoriaDespesasDAO();
	}
	
	public void inserirCategoriaDespesas(CategoriaDespesas categoriadespesas) {
		categoriaDespesasDAO.inserir(categoriadespesas);
	}

	public List<CategoriaDespesas> consultarTodos() {
		return categoriaDespesasDAO.consultarTodos();
	}

	public void alterarCategoriaDespesas(CategoriaDespesas categoriadespesas) {
		categoriaDespesasDAO.alterar(categoriadespesas);
	}

	public void removerCategoriaDespesas(CategoriaDespesas categoriadespesas) {
		categoriaDespesasDAO.remover(categoriadespesas);
	}
	
	public CategoriaDespesas consultarporIdCategoriaDespesas(Integer id){
		return categoriaDespesasDAO.consultarPorId(id);
	}
}
