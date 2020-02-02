public abstract class Empregado extends Pessoa{

	private double salario;
	private String matricula;
	private double valorInss;
	
	public Empregado (String nome, int idade, String sexo, double salario, String matricula) {
		super (nome, idade, sexo);
		this.matricula = matricula;
		this.salario = salario;
		this.setValorInss(getSalario());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getValorInss() {
		return this.valorInss;
	}
	
	public void setValorInss(double salario) {
		this.valorInss = this.getSalario()*0.11;
	}
	
}
