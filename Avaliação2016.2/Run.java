
public class Run {

	public static void main(String[] args) {

		Palavra palavra = new Palavra ("Prova");
		Palavra palavra3 = new Palavra ("Avaliacao");
		Palavra palavra2 = new Palavra ("Prova", palavra3);
		
		System.out.println(palavra.equals(palavra3));
		System.out.println(palavra2.getNivel(palavra3));

	}

}
