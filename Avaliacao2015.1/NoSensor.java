
public class NoSensor {
	
/* A. Forneça a	representação estática da classe que representa	o nó sensor.*/
	
	public String id;
	public Double latitude;
	public Double longitude;
	public Double altura;
	public double temperatura;
	
/* B. Escreva um construtor que inicialize o identificador, as coordenadas	
   e a altura de disponibilização do nó	sensor.*/
	
	public NoSensor (String id, Double latitude, Double longitude, Double altura) {
		this.altura =altura;
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

/* Método para setar a temperatura - Teste */
	public void setTemperatura (Double temperatura) {
		this.temperatura = temperatura;
	}
	
/* C. Métodos de acesso	para a temperatura lida pelo nó	sensor.*/
	
	public Double getTemperatura() {
		return this.temperatura;
	}
	
	public String getId() {
		return this.id;
	}
		
	public Double getAltura() {
		return this.altura;
	}
	
	public Double getLatitude() {
		return this.latitude;
	}
	
	public Double getLongitude() {
		return this.longitude;
	}
	
/* D. Um método	que retorne a distância	entre dois nós sensores, calculadas	
 como a	raiz quadrada da soma dos quadrados das diferenças entre as	coordenadas	
  e	as alturas dos nós.*/	
	
	public Double diferencaLatitude (NoSensor outro) {
		return Math.pow((this.getLatitude() - outro.getLatitude()),2);
	}
	
	public Double diferencaLongitude (NoSensor outro) {
		return Math.pow((this.getLongitude() - outro.getLongitude()),2);
	}
	
	public Double diferencaAltura (NoSensor outro) {
		return Math.pow((this.getAltura() - outro.getAltura()),2);
	}
	
	public Double diferencaEntreSensor (NoSensor outro) {
		return Math.sqrt(diferencaLatitude(outro) + diferencaAltura (outro) + diferencaAltura (outro) );
	}
	
/* E. Um método	que	indique	se o nó	sensor é igual a um	outro informado	(os	
 nós sensores serão o mesmo, se	possuírem o	mesmo identificador).*/
	
	public boolean equals (NoSensor outro) {
		return this.getId().equals(outro.getId());
	}
}
