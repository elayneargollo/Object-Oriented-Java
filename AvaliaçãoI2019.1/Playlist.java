package Entendis;

public class Playlist {
	public String nomePlaylist;
	public Musica[] playlist = new Musica[0];
	
	public Playlist (String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	
	public String getNomePlaylist() {
		return this.nomePlaylist;
	}
	
	public double getDuracao () {
		double duracao = 0;
		
		for (Musica m: this.playlist) {
			duracao += m.getDuracaoEmSegundos();
		}
		
		return duracao;
	}
	
	public void adicionarMusica (Musica musica) {
		Musica[] aux = new Musica[playlist.length+1];	
		
		for (int i=0; i<playlist.length; i++) {
			aux[i] = playlist[i];
		}
		
		aux[playlist.length] = musica;
		playlist = aux;
	}	
	
	public double getProximidade(Musica musica){
	     double proximidade = 0;
	     
	      for(Musica m : this.playlist)
	         if(m.getAproximidadeMusical(musica) > proximidade)
	            proximidade = m.getAproximidadeMusical(musica);
	       return proximidade;    
	 }
	
	public String toString () {
		 String str = "";
		 
		 for(Musica m : this.playlist)
	          str+= m.toString() + "\n" + "\n";
		 
	     return str;  
	}
	
}
