
public class AreaMonitorada {
	
/*A. Forneça a representação estática da classe que representa	
   a área monitorada.*/	
	
	public NoSensor[] area = new NoSensor[0];
	
/*B. Escreva um método que retorne a amplitude térmica (maior	
   temperatura lida subtraído da menor temperatura lida).*/
	
	public double amplitudeTermica () {
		return maiorTemperatura() - menorTemperatura();
	}
	
	public void adicionarSensor(NoSensor sensor) {
		
		NoSensor[] aux = new NoSensor[area.length + 1];
		
		for (int i=0; i<area.length; i++) {
			aux[i]=area[i];
		}
		
		aux[aux.length - 1] = sensor;
		area = aux;		
	}
	
	public double maiorTemperatura () {
		double maior = 0;
		
		for (int i=0; i<area.length; i++) {
			if (area[i].getTemperatura()>maior) {
				maior = area[i].getTemperatura();
			}
		}
		
		return maior;
	}
	
	public double menorTemperatura () {
		double menor=0;
		
		for (int i=0; i<area.length; i++) {
			if (i==0) {
				menor = area[i].getTemperatura();
			}else 
				if (menor > area[i].getTemperatura()) {
					menor = area[i].getTemperatura();
				}			
		}
		
		return menor;
	}

/* C. Sobrecarregue	o método anterior para que retorne	
  a	amplitude térmica,abaixo de uma	altitude fornecida*/
	
	public double amplitudeTermica (double altura) {
		return maiorTemperatura(altura) - menorTemperatura(altura);
	}
	
	public double maiorTemperatura (double altura) {
		double maior = 0;
		
		for (int i=0; i<area.length; i++) {
			if ((area[i].getTemperatura()>maior) && (area[i].getAltura()<altura)) {
				maior = area[i].getTemperatura();
			}
		}
		
		return maior;
	}
	
	
	public double menorTemperatura (double altura) {
		double menor=0;
		
		for (int i=0; i<area.length; i++) {
			if ((area[i].getAltura()<altura) && (menor==0)) {
				menor = area[i].getTemperatura();
			}else 
				if ((menor > area[i].getTemperatura()) && (area[i].getAltura()<altura)) {
					menor = area[i].getTemperatura();
				}			
		}

		return menor;
	}
	
/*D. Retorne a amplitude térmica entre o par de nós sensores	
  separados pela maior distância.*/
	
	public double amplitudeTermicaEntrePar () {
		int posicao = maiorDistancia();
		
		if (area[posicao].getTemperatura() > area[posicao+1].getTemperatura()) {
			return area[posicao].getTemperatura() - area[posicao+1].getTemperatura();
		} return area[posicao+1].getTemperatura() - area[posicao].getTemperatura();
		
	}
	
	public int maiorDistancia () {
		double maior = 0;
		int posicao = 0;
		
		for (int i=0; i<area.length; i++) {
			for (int j=i+1; j<area.length; j++) {
				if(area[i].diferencaEntreSensor(area[j]) > maior){
					maior = area[i].diferencaEntreSensor(area[i+1]);
					posicao = i;
				}
			}		
		}
		
		return posicao;
	}
}
