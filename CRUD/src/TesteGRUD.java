
public class TesteGRUD {

	public static void main(String[] args) throws Exception {
		JogadorDAO jogadorDAO = new JogadorDAO();
	
		Jogador jogador = new Jogador("1", "82");
		Jogador jogador2 = new Jogador("2", "85");
		Jogador jogador3 = new Jogador("3", "70");

		// jogadorDAO.inserir(jogador);
		// jogadorDAO.inserir(jogador2);
		// jogadorDAO.inserir(jogador3);
		
		// teste de update
		jogador3.setPontuacao("83");
		jogadorDAO.update(jogador3);
		
		// exibe todo documento da coleção
		jogadorDAO.mostrar();

	}

}
