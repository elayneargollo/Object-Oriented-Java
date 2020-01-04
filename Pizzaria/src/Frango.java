
public class Frango extends Sabor {

	private static String[] ingredientes = {"Salame", "queijo"};
	
	private Frango(double preco, String nome, String[] ingredientes) {
		super(preco, nome, ingredientes);		
	}
	
	public Frango(double preco, String nome) {
		this(preco, nome, ingredientes);		
	}

}
