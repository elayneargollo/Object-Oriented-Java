/* 1) A estrutura estática da classe Gene.*/

public class Gene {
	public int valor;
	
/*2) Um membro que tenha como parâmetro o valor do gene que está 
 * sendo criado e o inicialize com o valor informado.*/
	
	public Gene (int valor) {
		this.valor = valor;
	}

/*3) Métodos de acesso (leitura e alteração) da propriedade valor 
 * do gene.*/
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor (int valor) {
		this.valor = valor;
	}

/*4) Um método que verifique se o gene é igual a outro. 
 * Dois genes são iguais se seus valores são iguais.*/
	
	public boolean saoIguais (Gene gene) {
		return this.getValor() == gene.getValor();
	}
	
/*5) Um método clonar que gere e retorne um gene, que seja igual 
 * ao gene que recebe a mensagem. Em um clone,o valor do gene 
 * criado deve ser o mesmo do gene original, mas as identidades 
 * dos genes devem ser diferentes.*/
	
	public Gene clonar() {
		Gene gene1 = new Gene(this.getValor());
		
		return gene1;
	}
	
	
}
