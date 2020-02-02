public class Cliente extends Pessoa {

	private double valorDivida;
	private int anoNasc;
	
	public Cliente (String nome, int idade, String sexo, double valorDivida, int anoNasc) {
		super (nome, idade, sexo);
		this.anoNasc = anoNasc;
		this.valorDivida = valorDivida;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public String toString () {
		return "Nome: "
				+this.getNome()
				+"\nIdade: "
				+this.getIdade()
				+"\nSexo: "
				+this.getSexo()
				+"\nAno Nascimento: "
				+this.getAnoNasc()
				+"\nValor Divida: R$ : "
				+this.getValorDivida();			
	}
}
