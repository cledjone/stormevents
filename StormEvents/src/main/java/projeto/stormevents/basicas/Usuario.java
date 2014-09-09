package projeto.stormevents.basicas;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAB_USU")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="ID_USU")
	private int id;
	
	@Column(name="NOME_USU")
	private String nome;

	@Column(name="CPF_USU")
	private String cpf;

	@Column(name="CNPJ_USU")
	private String cnpj;

	@Column(name="RAZAO_USU")
	private String razaoSocial;

	@Column(name="FANTASIA_USU")
	private String nomeFantasia;

	@Column(name="TEL_USU")
	private String telefone;

	@Column(name="EMAIL_USU")
	private String email;

	@Column(name="LOGIN_USU")
	private String login;

	@Column(name="SENHA_USU")
	private String senha;

	@Column(name="ID_PERF_USU")
	private int idPerfil;

	@Column(name="PERF_USU")
	private String perfil;
	
	@Embedded
	private Endereco endereco;
	
	//GET and SET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
