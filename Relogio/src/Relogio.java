public class Relogio {
	int hora;
	int minuto;
	int segundo;
	
	/*CONSTRUTORES*/	
	public Relogio() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public Relogio(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Relogio Inicializa(Relogio relogio) {
		Relogio atual = new Relogio(relogio.getHora(),relogio.getMinuto(),relogio.getSegundo());		
		return atual;
	}
	
	/* INCREMENTE QUANTIDADE DE SEGUNDO EM +1*/
	public void IncrementSegundo(Relogio relogio) {
		if (relogio.getSegundo() <= 59) {
			relogio.setSegundo(relogio.getSegundo() + 1);
		}
		if (relogio.getSegundo() == 60) {
			relogio.setMinuto(relogio.getMinuto() + 1);
			relogio.setSegundo(0);
		}
	}

	/* ALTERA SEGUNDOS PARA UM VALOR REQUISITADO*/
	public void RequestSegundo(Relogio relogio, int segundo) {
		if (relogio.getSegundo() <= 59) {
			relogio.setSegundo(relogio.getSegundo() + segundo);
		}
		if (relogio.getSegundo() == 60) {
			relogio.setMinuto(relogio.getMinuto() + segundo);
			relogio.setSegundo(0);
		}
	}
	
	 public String toString(){
		return  this.getHora() 
			+ ":" + this.getMinuto() 
			+ ":" + this.getSegundo();
	    }    
	
	/*MÉTODOS DE ACESSO*/
	public int getHora() {
		return this.hora;
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public int getSegundo() {
		return this.segundo;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
}
