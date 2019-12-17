
public class Molecula {
	public ElementoQuimico[] atomos;
	
	public Molecula() {
		this.atomos = new ElementoQuimico[0];
	}
	
	public void addElemento (ElementoQuimico elemento) {
		ElementoQuimico[] aux = new ElementoQuimico[atomos.length+1];
		
		for (int i=0; i<atomos.length; i++) {
			aux[i] = atomos[i];
		}
		
		aux[atomos.length] = elemento;
		atomos = aux;		
	}
	
	public ElementoQuimico getMenorNumeroAtomico () {
		int menor=0, j=0;
		
		for (int i=0; i < atomos.length; i++) {
			if (i==0) {
				menor = atomos[i].getNumeroAtomico();
			}
			if (menor > atomos[i].getNumeroAtomico()) {
				menor = atomos[i].getNumeroAtomico();
				j = i;
			}
		}
		
		return atomos[j];
	}
	
	public int getQuantidadeDeAtomo (ElementoQuimico elemento) {
		int quantidade = 0;
		
		for (int i=0; i<atomos.length; i++) {
			if (atomos[i].getNomeElemento().equals(elemento.getNomeElemento())){
				quantidade++;
			}
		}
		
		return quantidade;
	}
	

	public boolean hasEquivalente (Molecula molecula) {
		
		for (int i =0; i<atomos.length; i++) {
			if (!atomos[i].getNomeElemento().equals(molecula.atomos[i].getNomeElemento())) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
