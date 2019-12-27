package Classes;

public class Professor extends Pessoa{
	public int formacao;
	
	/* Construtor Default */
	public Professor() {
		super();
	}
	
	/* Construtor com Padrão */
	public Professor (String nome, int idade, int formacao ) {
		super(nome, idade);
		this.formacao = formacao;
	}

	/* Método herdado da superClasse */
	@Override
	public String getCargo() {
		return "Professor";		
	}
}
