
public class Palavra {
	public String conteudo;
	public Palavra[] similares;
	
	public Palavra (String conteudo) {
		this.conteudo = conteudo;
		this.similares = new Palavra[0];
	}
	
	public Palavra (String conteudo, Palavra palavra) {					
		this(conteudo);
		this.addPalavra(palavra);
	}
	
	public void addPalavra(Palavra palavra) {
		Palavra[] aux = new Palavra[similares.length+1];
		
		for (int i=0; i<similares.length; i++) {
			aux[i] = similares[i];
		}
		
		aux[similares.length] = palavra;
		similares = aux;
	}
	
	private String getConteudo() {
		return this.conteudo;
	}
	
	public boolean equals (Palavra palavra) {
		return this.getConteudo().equals(palavra.getConteudo());
	}
	
	public boolean hasSimilar (Palavra palavra) {
	
		for (int i=0; i<similares.length; i++) {	
			if (similares[i].getConteudo().equals(palavra.similares[i].getConteudo())) {
				return true;
			}
		}
		return false;
	}
		
	
	public double getNivel (Palavra palavra) {
		double nivel = 0.0;
		
		if (palavra.equals(this)) {
			nivel++;
		}
		
		if (this.hasSimilar(palavra)) {
			nivel += 0.5;
		}		
		
		return nivel + (this.contarSimilar(palavra) / 2*(palavra.contarSimilar(this))) ;
	}
	
	public double contarSimilar (Palavra palavras) {
		double soma=0;		

		for (int i=0; i<this.similares.length; i++) {
			for (int j=0; j<palavras.similares.length; j++) {
				if (this.similares[i].equals(palavras.similares[j])) {
					soma++;
				}
			}	
		}
		
		return soma;
	
	}
}
