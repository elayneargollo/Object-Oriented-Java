public class Gerente extends Empregado{

	private String nomeGerencia;
	
	public Gerente(String nome, int idade, String sexo, double salario, String matricula,String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
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
				+"\nNome Gerencia: "
				+this.getNomeGerencia();
	}
}
