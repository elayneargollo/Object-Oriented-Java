
public class Palavra {
	public String conteudo;
	public Palavra[] similares;
	
	public Palavra (String conteudo) {
		this.conteudo = conteudo;
		this.similares = new Palavra[0];
	}
	
	public Palavra (String conteudo, Palavra palavra) {				
		/*this.conteudo = conteudo;
		this.similares = new Palavra[0];*/
		
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
			if (similares[i].equals(palavra)) {
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
		
		return nivel + ((this.contarSimilar(palavra)/2*(palavra.contarSimilar(this))));
	}
	
	public int contarSimilar (Palavra palavras) {
		
		int soma=0;
		
		for (int i=0; i<similares.length; i++) {
			if (!(similares.length > palavras.similares.length)) {
				if (this.hasSimilar(palavras.similares[i])){
					soma++;
				}
			}					
		}	
		
		return soma;
	}
	
}
