package projeto.stormevents.basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_CATEGORIA_DESPESAS")
public class CategoriaDespesas {

	@Id
	@GeneratedValue
	@Column(name = "ID_CATEGORIA_DESPESAS")
	private int id;

	@Column(name = "DESCRICAO_CATEGORIA_DESPESAS")
	private String Descricao_Categoria;

	
	
	
	// get and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao_Categoria() {
		return Descricao_Categoria;
	}

	public void setDescricao_Categoria(String descricao_Categoria) {
		Descricao_Categoria = descricao_Categoria;
	}

}
