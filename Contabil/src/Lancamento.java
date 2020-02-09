
public class Lancamento {

	private String descricao;
	private double valor;
	private Conta debito;
	private Conta credito;
	
	public Lancamento(String descricao, double valor, Conta debito, Conta credito) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.debito = debito;
		this.credito = credito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Conta getDebito() {
		return debito;
	}

	public void setDebito(Conta debito) {
		this.debito = debito;
	}

	public Conta getCredito() {
		return credito;
	}

	public void setCredito(Conta credito) {
		this.credito = credito;
	}
		
	public String toString () {
		return "Descricao: "
				+this.getDescricao()
				+"\nDebitar: Caixa ........... "
				+this.getDebito()
				+"\nCreditar: Capital ......... "
				+this.getCredito();
	}
	
}
