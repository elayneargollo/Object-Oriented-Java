package Entendis;

public class Musica {
	public String titulo;
	public String[] nomeArtista = new String[0];
	public Double duracaoEmSegundos;
	public String genero;
	public CampoHarmonicoEnum campoHarmonico;
	public String nomeGravadora;
	
	public Musica (String titulo, Double duracaoEmSegundos, 
			String genero, CampoHarmonicoEnum campoHarmonico, 
			String nomeGravadora){
		
		this.titulo = titulo;
		this.campoHarmonico = campoHarmonico;
		this.genero = genero;
		this.duracaoEmSegundos = duracaoEmSegundos;
		this.nomeGravadora = nomeGravadora;
		
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	
	public CampoHarmonicoEnum getCampoHarmonico () {
		return this.campoHarmonico;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public Double getDuracaoEmSegundos() {
		return this.duracaoEmSegundos;
	}
	
	public String getNomeGravadora() {
		return this.nomeGravadora;
	}
	
	public void adicionarNomeArtista(String nomeDoArtista) {
		String[] aux = new String[nomeArtista.length + 1];
		int i;
		
		for (i=0; i<nomeArtista.length; i++) {
			aux[i] = nomeArtista[i];
		}
		
		aux[aux.length - 1]=nomeDoArtista;
		nomeArtista = aux;				
	}
	
	public boolean equals (Musica musica) {
		return this.tituloIgual(musica) && 
			   this.getArtistaCoincidente(musica);
	}
	
	public boolean getArtistaCoincidente (Musica musica) {

		for (int i=0; i<nomeArtista.length; i++) {
			for (int j=0; j<musica.nomeArtista.length; j++) {
				if (this.nomeArtista[i].equals(musica.nomeArtista[j])){
					return true;					
				}
			}
		}
		
		return false;
	}
	
	public float getQuantidadeArtistaCoincidente (Musica musica) {
		float quantidade = 0;
		
		for (int i=0; i<nomeArtista.length; i++) {
			for (int j=0; j<musica.nomeArtista.length; j++) {
				if (this.nomeArtista[i].equals(musica.nomeArtista[j])){
					quantidade ++;			
				}
			}
		}
	
		return quantidade/nomeArtista.length;
	}
	
	public boolean tituloIgual (Musica musica) {
		return this.getTitulo().equals(musica.getTitulo());
	}

	public float getAproximidadeMusical (Musica musica) {
		float valor = 0;
		
		if (this.getCampoHarmonico().equals(musica.getCampoHarmonico())) {
			valor++;
		}
		if (this.getNomeGravadora().equals(musica.getNomeGravadora())) {
			valor++;
		}
		if (this.getGenero().equals(musica.getGenero())) {
			valor++;
		}
		
		valor += getQuantidadeArtistaCoincidente(musica);
		
		return valor;
	}
	
	
	public String toString() {
		String str = "";
		
		 for(String n : this.nomeArtista)
	          str+= n.toString() + "\n" ;		
		 
		return "Titulo: "
				+this.getTitulo()
				+"\nCampo Harmonico: "
				+this.getCampoHarmonico()
				+"\nGenero: "
				+this.getGenero()
				+"\nDuracao Em Segundos: "
				+this.getDuracaoEmSegundos()
				+"\nNome Gravadora: "
				+this.getNomeGravadora()
				+"\nArtista: "
				+str;
	}
	

}
