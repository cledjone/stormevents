package projeto.stormevents.controlador;

import java.util.List;
import projeto.stormevents.dados.CategoriaDespesasDAO;
import projeto.stormevents.basicas.CategoriaDespesas;

public class CategoriaDespesasControlador {
	private CategoriaDespesasDAO categoriaDespesasDAO;

	
	
	public void inserirCategoriaDespesas(CategoriaDespesas cd) {
		categoriaDespesasDAO.inserir(cd);
	}

	public List<CategoriaDespesas> consultarTodos() {
		return categoriaDespesasDAO.consultarTodos();
	}

	public void alterarCategoriaDespesas(CategoriaDespesas cd) {
		categoriaDespesasDAO.alterar(cd);
	}

	public void removerCategoriaDespesas(CategoriaDespesas cd) {
		categoriaDespesasDAO.remover(cd);
	}
	
	public CategoriaDespesas consultarporIdCategoriaDespesas(Integer id){
		return categoriaDespesasDAO.consultarPorId(id);
	}
}
