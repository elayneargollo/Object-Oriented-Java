package Entendis;

public class BaseDeDados {
	private Musica[] musicas = new Musica[0];
	
	public void adicionarMusica (Musica musica) {
		Musica[] aux = new Musica[musicas.length+1];	
		
		for (int i=0; i<musicas.length; i++) {
			aux[i] = musicas[i];
		}
		
		aux[musicas.length] = musica;
		musicas = aux;
	}			
	
	public Playlist adicionarPlaylist (String nomePlaylist, double duracao, Playlist base) {
		Playlist similiar = new Playlist(nomePlaylist);
		int cont = 0;
		
		this.ordenar(base);
		
		while (similiar.getDuracao() < duracao && cont < this.musicas.length) {
			base.adicionarMusica(musicas[cont]);
			cont++;
		}
		
		return similiar;	
		
	}
	
	public void ordenar (Playlist base) {
		for (int i=0; i< this.musicas.length-1; i++) {
			for (int j = i+1; j < this.musicas.length; j++) {
				if (base.getProximidade(this.musicas[i]) < base.getProximidade(this.musicas[j])) {
					Musica aux = this.musicas[i];
					this.musicas[i] = this.musicas[j];
					this.musicas[j] = aux;
				}
			}
		}
	}


}
