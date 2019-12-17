
public class Run {

	public static void main(String[] args) {

		Palavra outra = new Palavra ("Avaliacao");
		Palavra palavra = new Palavra ("Prova",outra);
		Palavra palavra2 = new Palavra ("Prova",outra);

		
		System.out.println("Palavra é igual a outra ? " +palavra.equals(outra));
		System.out.println("Similaridade: " +palavra.getNivel(palavra2));

	}

}
