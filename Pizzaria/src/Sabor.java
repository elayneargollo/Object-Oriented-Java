
public abstract class Sabor {

	private double preco;
	private String nome;
	private String[] ingredientes;

	public Sabor(double preco, String nome, String[] ingredientes) {
		this.preco = preco;
		this.nome = nome;
		this.ingredientes = ingredientes;
	}

	public double getPreco() {
		return this.preco;
	}

	public String getNome() {
		return this.nome;
	}

	public String toString() {

		String str = "";

		for (int i = 0; i < ingredientes.length; i++) {
			if (i + 1 < ingredientes.length) {
				str += ingredientes[i] + ",";
			} else if (i + 1 == ingredientes.length) {
				str += ingredientes[i];
			}
		}

		return  this.getNome() + " -----> R$ " + this.getPreco() + "\n" + " Ingredientes: " + str;
	}

}
