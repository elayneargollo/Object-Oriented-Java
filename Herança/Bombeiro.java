package Classes;

 class Bombeiro extends Pessoa {
	private int num;
	
	/* Construtor Default */
	public Bombeiro () {
		super();
	}
	
	/* Construtor com Padrão */
	public Bombeiro (String nome, int idade, int num) {
		super(nome, idade);
		this.num = num;
	}	
	
	/* Método herdado da superClasse */
	@Override
	public String getCargo() {
		return "Bombeiro";		
	}
}
