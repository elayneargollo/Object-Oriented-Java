
public class ContaPassiva extends Conta {

	public ContaPassiva (String nome, double saldo) {
		super (nome, saldo);
	}
	
	public void debitar(double valor) {	
		this.setSaldo(valor - this.getSaldo());		
	}
	
	public void creditar(double valor) {
		this.setSaldo(valor + this.getSaldo());	
	}

}
