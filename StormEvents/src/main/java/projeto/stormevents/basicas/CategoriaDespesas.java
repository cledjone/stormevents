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
	private Integer id;

	@Column(name = "DESCRICAO_CATEGORIA_DESPESAS")
	private String nome;
	

	
	
	// get and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
