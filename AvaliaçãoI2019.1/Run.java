package Aplicação;

import Entendis.CampoHarmonicoEnum;
import Entendis.Musica;
import Entendis.Playlist;

public class Run {

	public static void main(String[] args) {
		Musica musica = new Musica ("O Sol Nascera", 120.5, "Pop", CampoHarmonicoEnum.B, "Lestas.mus");
		Musica musica2 = new Musica ("Brisa", 102.5, "Pop", CampoHarmonicoEnum.A, "Lestas.mus");
		Musica musica3 = new Musica ("Um Certo Alguém", 150.8, "Pop", CampoHarmonicoEnum.E, "Lestas.mus");
	
		musica.adicionarNomeArtista("Zeca Pagodinho");
		musica2.adicionarNomeArtista("Iza");
		musica3.adicionarNomeArtista("Lulu Santos");
		
		System.out.println("------- Músicas ----------\n");
		
		System.out.println(musica.toString());
		System.out.println(musica2.toString());			
		System.out.println(musica3.toString());
		
		Playlist playlist = new Playlist("Bom Sucesso");
		
		System.out.println("\n------- Playlist " +playlist.getNomePlaylist() + "------\n");		
		
		playlist.adicionarMusica(musica3);
		playlist.adicionarMusica(musica2);
		
		System.out.println(playlist.toString());	
	
	}

}
