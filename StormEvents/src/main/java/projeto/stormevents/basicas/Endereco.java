package projeto.stormevents.basicas;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="TAB_END")
public class Endereco {
	
	@Column(name="END_RUA")
	private String rua;
	@Column(name="END_COMPLEMENTO")
	private String complemento;
	@Column(name="END_BAIRRO")
	private String bairro;
	@Column(name="END_CIDADE")
	private String cidade;
	@Column(name="END_NUMERO")
	private int numero;

	public Endereco() {}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
	
}
