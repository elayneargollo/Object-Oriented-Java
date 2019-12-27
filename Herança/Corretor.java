package Classes;

public class Corretor extends Pessoa{
	private int licenca;
	
	/* Construtor Default */
	public Corretor () {
		super();
	}
	
	/* Construtor com Padrão */
	public Corretor (String nome, int idade, int licenca) {
		super (nome, idade);
		this.licenca = licenca;
	}
	
	/* Método herdado da superClasse */
	@Override
	public String getCargo() {
		return "Corretor";		
	}
}
