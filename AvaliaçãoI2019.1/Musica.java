package Entendis;
// 1) A estrutura estática da classe Músic

public class Musica {
	public String titulo;
	public String[] nomeArtista = new String[0];
	public Double duracaoEmSegundos;
	public String genero;
	public CampoHarmonicoEnum campoHarmonico;
	public String nomeGravadora;
	
/* 2) Um membro que inicialize a Música. 
 * Este membro deve garantir que todos os valores da música sejam
   inicializados.Nenhum dos valores pode ser posteriormente alterado.*/
	
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
	
/* 3) Um membro que verifique se duas músicas são iguais. 
 * Músicas são iguais se seus nomes são iguais e 
 * a lista de nome de seus artistas é coincidente.*/
	
	public boolean equals (Musica musica) {
		return this.tituloIgual(musica) && 
			   this.artistaCoincidente(musica);
	}
	
	public boolean artistaCoincidente (Musica musica) {

		for (int i=0; i<nomeArtista.length; i++) {
			for (int j=0; j<musica.nomeArtista.length; j++) {
				if (this.nomeArtista[i].equals(musica.nomeArtista[j])){
					return true;					
				}
			}
		}
		
		return false;
	}
	
	public float quantidadeArtistaCoincidente (Musica musica) {
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

/* 4) (2.0) um membro que calcule a proximidade de duas músicas. 
 * A proximidade duas músicas é um valor de 0 a 4,
 * calculado da forma que se segue: +1, 
 * quando o campo harmônico da faixa da música é coincidente; +1, 
 * quando agravadora é a mesma; +1 quando as músicas são do mesmo gênero 
 * e percentualmente um valor entre [0-1] que mostra a quantidade de artistas 
 * que coincidem nas duas faixas.*/
	
	public float aproximidadeMusical (Musica musica) {
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
		
		valor += quantidadeArtistaCoincidente(musica);
		
		return valor;
	}
	
	
	public String toString() {
		return "Titulo: "
				+this.getTitulo()
				+"\nCampo Harmonico: "
				+this.getCampoHarmonico()
				+"\nGenero: "
				+this.getGenero()
				+"\nDuracao Em Segundos: "
				+this.getDuracaoEmSegundos()
				+"\nNome Gravadora: "
				+this.getNomeGravadora();
	}

}
