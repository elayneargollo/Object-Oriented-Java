
public class Salame extends Sabor {

	private static String[] ingredientes = {"Frango", "queijo"};
	
	private Salame(double preco, String nome, String[] ingredientes) {
		super(preco, nome, ingredientes);		
	}
	
	public Salame(double preco, String nome) {
		this(preco, nome, ingredientes);		
	}

}
