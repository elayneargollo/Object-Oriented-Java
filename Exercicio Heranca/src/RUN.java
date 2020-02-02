
public class RUN {

	public static void main(String[] args) {
		
		Pessoa vendedor = new Vendedor ("Nino", 35, "Masculino", 1500, "202197542", 25.00, 5);
		Pessoa empregado = new Gerente ("Alison", 30, "Masculino", 5000.00, "212797540", "Elayne");
		Pessoa cliente = new Cliente ("Elayne", 28, "Feminino", 288, 1991);
		
		System.out.println(vendedor.toString());
		System.out.println();
		System.out.println(empregado.toString());
		System.out.println();
		System.out.println(cliente.toString());
	}
}
