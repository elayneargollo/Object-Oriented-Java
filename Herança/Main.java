package Classes;

public class Main {

	public static void main(String[] args) {
		
		/* Uma classe abstrata JAMAIS será instanciada
		 * 	 Pessoa pessoa = new Pessoa ("Elayne", 28, 100);
		 * Por isso instanciamos as subClasses. */
		
		Pessoa pessoa = new Bombeiro ("Paul Neal", 28, 100);
		Pessoa people = new Professor ("Chicão Bueno", 85, 78);
		Pessoa outra = new Corretor ("José Alberto", 18, 78);
		Pessoa outher = new Engenheiro ("Thomas Gierlevsen", 5, 8547);		 

		System.out.println(pessoa.toString());
		System.out.println(outra.toString());
		System.out.println(outher.toString());
		System.out.println(people.toString());
		
	}
}
