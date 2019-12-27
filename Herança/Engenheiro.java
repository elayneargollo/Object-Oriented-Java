package Classes;

public class Engenheiro extends Pessoa {
	private int CREA;
	
	/* Construtor Default */
	public Engenheiro () {
		super();
	}
	
	/* Construtor com Padrão */
	public Engenheiro(String nome, int idade, int CREA) {
		super(nome, idade); 
		this.CREA = CREA;
	}
	
	/* Método herdado da superClasse */
	@Override
	public String getCargo() {
		return "Engenheiro";		
	}
}
