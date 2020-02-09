
public class BalancoContabil {
	
	private Conta[] contas;	
	
	public Conta findConta (String nome) {
		
		for (int i=0; i<contas.length; i++) {
			if (contas[i].getNome().equals(nome)) {
				return contas[i];
			}
		}
		
		return null;
	}
	
	public void ajustarConta (String debito, String credito, double valor) {
		this.findConta(credito).creditar(valor);
		this.findConta(debito).debitar(valor);
	}
	
}
