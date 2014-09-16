package projeto.stormevents.basicas;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Evento {
	@Id
	@GeneratedValue
	@Column(name = "ID_EVENTO")
	private int id;
	
	@Column(name = "NOME_EVE")
	private String nome;
}
