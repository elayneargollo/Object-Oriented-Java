import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		Scanner dadosSabor = new Scanner(System.in);

		System.out.println("Qual o tamanho da Pizza?");
		System.out.println("Pequena, Média ou Grande ? ");
		System.out.println("\nCliente responde: ");
		String tamanho = dados.next();

		Pizza pizza;

		if (tamanho.equalsIgnoreCase("Pequena")) {

			pizza = new PizzaPequena(Tamanho.PEQUENA);

			int i = 0;

			while (i < pizza.verificaQuantidadeMaximaSabor(Tamanho.PEQUENA)) {

				System.out.println("\nQual sabor? ");
				String sabor = dadosSabor.next();

				if (sabor.equalsIgnoreCase("frango")) {

					Sabor frango = new Frango(20, "Frango");
					pizza.addSabor(frango);

				}

				if (sabor.equalsIgnoreCase("carne")) {

					Sabor carne = new Carne(35, "Carne");
					pizza.addSabor(carne);

				}

				if (sabor.equalsIgnoreCase("salame")) {

					Sabor salame = new Salame(45, "Salame");
					pizza.addSabor(salame);

				}

				i++;
			}

		} else if (tamanho.equalsIgnoreCase("Media")) {
			
			pizza = new PIzzaMedia(Tamanho.MEDIA);

			int i = 0;

			while (i < pizza.verificaQuantidadeMaximaSabor(Tamanho.MEDIA)) {

				System.out.println("\nQual sabor? ");
				String sabor = dadosSabor.next();

				if (sabor.equalsIgnoreCase("frango")) {
					
					Sabor frango = new Frango(20, "Frango");
					pizza.addSabor(frango);
				}

				if (sabor.equalsIgnoreCase("carne")) {
					
					Sabor carne = new Carne(35, "Carne");
					pizza.addSabor(carne);
				}

				if (sabor.equalsIgnoreCase("salame")) {
					
					Sabor salame = new Salame(45, "Salame");
					pizza.addSabor(salame);
				}

				i++;
			}

		} else {
			pizza = new PizzaGrande(Tamanho.GRANDE);
			
			int i = 0;

			while (i < pizza.verificaQuantidadeMaximaSabor(Tamanho.GRANDE)) {

				System.out.println("\nQual sabor? ");
				String sabor = dadosSabor.next();

				if (sabor.equalsIgnoreCase("frango")) {
					
					Sabor frango = new Frango(20, "Frango");
					pizza.addSabor(frango);
				}

				if (sabor.equalsIgnoreCase("carne")) {
					
					Sabor carne = new Carne(35, "Carne");
					pizza.addSabor(carne);
				}

				if (sabor.equalsIgnoreCase("salame")) {
					
					Sabor salame = new Salame(45, "Salame");
					pizza.addSabor(salame);
				}

				i++;
			}
		}

		System.out.println(pizza.toString());
	}

}
