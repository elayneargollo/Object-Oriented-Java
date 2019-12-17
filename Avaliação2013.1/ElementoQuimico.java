
public class ElementoQuimico {

	public int numeroAtomico;
	public double numeroMassa;
	public String nomeElemento;
	public Camada camada;
	
	public ElementoQuimico (int numeroAtomico,double numeroMassa,String nomeElemento) {
		this.numeroAtomico = numeroAtomico;
		this.numeroMassa = numeroMassa;
		this.nomeElemento = nomeElemento;
	}
	
	public String getNomeElemento () {
		return this.nomeElemento;
	}
	
	public int getNumeroAtomico() {
		return this.numeroAtomico;
	}
	
	public boolean equals (ElementoQuimico elemento) {
		return this.getNumeroAtomico() == elemento.getNumeroAtomico();
	}
	
}
