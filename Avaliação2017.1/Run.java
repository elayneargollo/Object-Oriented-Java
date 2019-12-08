
public class Run {

	public static void main(String[] args) {
		Gene gene = new Gene(7);
		Gene gene2 = new Gene(2);
		
		gene.setValor(5);
		
		System.out.println("São iguais ? " +gene.saoIguais(gene2));
		System.out.println("Clonar: " +gene.clonar().getValor());
		
		Cromossomo cromo = new Cromossomo(0);
		
		cromo.adicionarGene(gene);
		cromo.adicionarGene(gene2);
		
		System.out.println("Buscar: " +cromo.buscar(1).getValor());
		
	}

}
