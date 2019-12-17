
public class Run {

	public static void main(String[] args) {
		
		ElementoQuimico elemento = new ElementoQuimico (8, 16.0, "Oxigenio");
		ElementoQuimico elemento2 = new ElementoQuimico(9, 17.5, "Carbono");
	
		Molecula molecula = new Molecula();
		Molecula molecula2 = new Molecula();
		
		molecula2.addElemento(elemento);
		molecula2.addElemento(elemento2);
		
		molecula.addElemento(elemento);
		molecula.addElemento(elemento2);

		
	}

}
