
public class Jogador {
	public String nomeJogador;
	private String pontuacao;
	
	public Jogador(String nomeJogador, String pontuacao) {
		this.nomeJogador = nomeJogador;
		this.pontuacao = pontuacao;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}
	

}
