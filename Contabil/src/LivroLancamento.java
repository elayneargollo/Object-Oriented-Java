
public class LivroLancamento {

	private Lancamento[] livroLancamento;
	
	public LivroLancamento (Lancamento livroLancamento) {
		this.livroLancamento = new Lancamento[0];
	}
	
	public void registrarLancamento(Lancamento lancamento) {
		
		Lancamento[] aux = new Lancamento[livroLancamento.length+1];
		
		for (int i=0; i<livroLancamento.length; i++) 
			aux[i]=livroLancamento[i];
				
		aux[aux.length] = lancamento;
		livroLancamento = aux;
	}
}
