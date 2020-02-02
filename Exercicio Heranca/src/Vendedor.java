public class Vendedor extends Empregado{

	private double valorVendas;
	private int qntVendas;
	
	public Vendedor(String nome, int idade, String sexo, double salario, String matricula,	
					double valorVendas, int qntVendas) {
		super(nome, idade, sexo, salario, matricula);
		this.qntVendas = qntVendas;
		this.valorVendas = valorVendas;		
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
	
	public String toString () {
		return "Nome: "
				+this.getNome()
				+"\nIdade: "
				+this.getIdade()
				+"\nSexo: "
				+this.getSexo()
				+"\nSalario: R$ "
				+this.getSalario()
				+"\nMatricula: "
				+this.getMatricula()
				+"\nValor Inss: "
				+this.getValorInss()
				+"\nQnt Vendas: "
				+this.getQntVendas()
				+"\nValor das vendas: R$ "
				+this.getValorVendas();
	}
}

