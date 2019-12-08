package Entendis;

/* 5) A estrutura estática da classe playlist */

public class Playlist {
	public String nomePlaylist;
	public Musica[] playlist = new Musica[0];
	
	public Playlist (String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	
	public String getNomePlaylist() {
		return this.nomePlaylist;
	}
	
/* 6) Um método de acesso que retorne a lista de músicas 
	da playlist.*/

	public Musica[] getPlaylist () {
		return playlist;
	}	
	
/* 7) Um método que permita adicionar uma música a playlist */
	
	public void adicionarMusica (Musica musica) {
		Musica[] aux = new Musica[playlist.length+1];	
		
		for (int i=0; i<playlist.length; i++) {
			aux[i] = playlist[i];
		}
		
		aux[playlist.length] = musica;
		playlist = aux;
	}
	
	public String toString () {
		 String str = "";
		 
		 for(Musica m : this.playlist)
	          str+= m.toString() + "\n" + "\n";
		 
	     return str;  
	}
	
}
