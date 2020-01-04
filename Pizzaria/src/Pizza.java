public abstract class Pizza {

	private Tamanho tamanho;
	private Sabor[] sabores= new Sabor[0];
	
	public Pizza(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	
	public void addSabor(Sabor sabor) {	

			Sabor[] aux = new Sabor[this.sabores.length+1];
			
			for(int j=0; j<sabores.length; j++) {
				aux[j]=sabores[j];
			}
			
			aux[aux.length-1] = sabor;
			sabores = aux;		
	}
	
	public int verificaQuantidadeMaximaSabor(Tamanho tamanho) {		
		return tamanho.getQuantidadeSabor(tamanho);		
	}
	
	public String toString() {
		
		String str="";
		
		for (int i = 0; i < sabores.length; i++) {
			if (i + 1 < sabores.length) {
				str += sabores[i].getNome() + ",";
			} else if (i + 1 == sabores.length) {
				str += sabores[i].getNome();
			}
		}
		
		return "\n"
				+"Pizza "
				+this.tamanho
				+"\n"
				+"Sabor: "
				+str
				+"\n"
				+"Preco a Pagar: R$ ";
		
	}
	
	public double getValorPiza() {
		
		return 0;
	}
	
	
}
