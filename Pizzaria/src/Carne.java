
public class Carne extends Sabor {

	private static String[] ingredientes = {"Frango", "queijo"};
	
	private Carne(double preco, String nome, String[] ingredientes) {
		super(preco, nome, ingredientes);		
	}
	
	public Carne(double preco, String nome) {
		this(preco, nome, ingredientes);		
	}

}
