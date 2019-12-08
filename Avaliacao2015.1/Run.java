public class Run {

	public static void main(String[] args) {
		NoSensor sensor = new NoSensor ("Teste", 1.2, 2.5, 1.61);
		NoSensor outro = new NoSensor ("TestE", 1.2, 2.5, 1.81);
		NoSensor outher = new NoSensor ("TestE", 1.2, 2.5, 1.62);
		
		sensor.setTemperatura(5.0);
		outro.setTemperatura(8.5);
		outher.setTemperatura(2.1);
		
		System.out.println("Temperatura: "+sensor.getTemperatura());
		System.out.println("\nDistancia: " +sensor.diferencaEntreSensor(outro));
		System.out.println("\nSão iguais ? " +sensor.equals(outro));
		
		AreaMonitorada area = new AreaMonitorada();
		
		area.adicionarSensor(sensor);
		area.adicionarSensor(outro);
		area.adicionarSensor(outher);
		
		System.out.println("\nAmplitude Térmica: " +area.amplitudeTermica());;
		System.out.println("\nAmplitude Térmica: " +area.amplitudeTermica(1.70));
		System.out.println("\nAmplitude Térmica: " +area.amplitudeTermicaEntrePar());
	}

}
