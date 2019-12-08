/*6)A estrutura estática da classe Cromossomo.*/

public class Cromossomo {
	public Gene[] cromossomo;
	public int numeroDeGenes;
	
/*7)Um construtor para a classe Cromossomo.*/
	
	public Cromossomo (int numeroDeGenes) {
		this.numeroDeGenes = numeroDeGenes;
		this.cromossomo = new Gene[numeroDeGenes];
	}
	
/*8)Um método que possibilite buscar um gene, informado o valor 
 * do alelo*/	
	
	public void adicionarGene (Gene gene) {
		Gene[] aux = new Gene[cromossomo.length+1];
		
		for (int i=0; i<cromossomo.length; i++) {
			aux[i] = cromossomo[i];
		}
		
		aux[aux.length-1] = gene;
		cromossomo = aux;
	}
	
	public Gene buscar(int alelo) {
		
		for (int i=0; i<cromossomo.length; i++) {
			if (i==alelo) {
				return cromossomo[i];
			}
		}
		
		return null;
	}
	
/*9)Um método clonar que gere e retorne um cromossomo idêntico 
 * àquele que recebeu a mensagem. Em um clone, o valor dos genes 
 * dos cromossomos deve ser o mesmo, as identidades, entretanto, 
 * devem ser diferentes,tanto para o cromossomo, como para cada 
 * um dos genes.*/
	
	
	
}
