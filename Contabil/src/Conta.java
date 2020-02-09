
public class Conta {

	private String nome;
	private double saldo; 
	
	public Conta (String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}	
	
	public boolean equals (Conta conta) {
		return this.getNome().equals(conta.getNome());
	}
	
	public void debitar(double valor) {	
	}
	
	public void creditar(double valor) {
	}
}
