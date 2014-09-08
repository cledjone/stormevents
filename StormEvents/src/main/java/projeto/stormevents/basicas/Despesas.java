package projeto.stormevents.basicas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_USU")
public class Despesas {

	@Id
	@GeneratedValue
	@Column(name = "ID_DESPESAS")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_DESPESAS")
	private CategoriaDespesas categoriadespesas;

	@Column(name = "VALOR_DESPESAS")
	private double valor;

	@ManyToOne
	@JoinColumn(name = "USUARIO_DESPESAS")
	private Usuario usuario;
	
	
	//GET AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoriaDespesas getCategoriadespesas() {
		return categoriadespesas;
	}

	public void setCategoriadespesas(CategoriaDespesas categoriadespesas) {
		this.categoriadespesas = categoriadespesas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}
