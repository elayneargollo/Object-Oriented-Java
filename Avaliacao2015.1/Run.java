
public class Run {

	public static void main(String[] args) {
		NoSensor sensor = new NoSensor ("Teste", 1.2, 2.5, 1.61);
		NoSensor outro = new NoSensor ("TestE", 1.2, 2.5, 1.61);
		
		sensor.setTemperatura(5.0);
		
		System.out.println("Temperatura: "+sensor.getTemperatura());
		System.out.println("Distancia: " +sensor.diferencaEntreSensor(outro));
		System.out.println("São iguais ? " +sensor.equals(outro));
	}

}
