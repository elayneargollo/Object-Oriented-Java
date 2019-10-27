import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Relogio relogio = new Relogio(13, 40,58);
		
		Relogio atual = relogio.Inicializa(relogio);
		
		relogio.IncrementSegundo(relogio);
		relogio.RequestSegundo(relogio, 2);
		
		System.out.println(relogio.toString());
		

	   
	}

}
