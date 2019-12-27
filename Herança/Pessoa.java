package Classes;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	
	/* Construtor Default */
	protected Pessoa () {
	}
	
	/* Construtor com Padrão */
	protected Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}	
	
	protected String getNome() {
		return this.nome;
	}
	
	protected int getIdade() {
		return this.idade;
	}
	
	public boolean obterValidacao() {
		return this.idade>=18;
	}
	
	public String toString() {
		return  "\nNome: " +this.nome 
				+"\nValidacao: " + this.obterValidacao()
				+"\nCargo: " + this.getCargo();
	}
	
	/* Cada um fará seu próprio implemento.*/
	public abstract String getCargo();
}
