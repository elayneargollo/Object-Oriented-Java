
public class RegistroContabil {

	private String nomeEmpresa;
	private BalancoContabil balanco;
	private LivroLancamento livro;
	private String CGC;
	
	public void registroFato(String descricao, String nomedebito, String nomecredito, double valor) {
		Conta debito = balanco.findConta(nomedebito);
		Conta credito = balanco.findConta(nomecredito);		
		
		Lancamento lancamento = new Lancamento(descricao, valor, credito, debito);
		this.livro.registrarLancamento(lancamento);		
		this.balanco.ajustarConta(nomedebito, nomecredito, valor);
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public BalancoContabil getBalanco() {
		return balanco;
	}

	public void setBalanco(BalancoContabil balanco) {
		this.balanco = balanco;
	}

	public String getCGC() {
		return CGC;
	}

	public void setCGC(String cGC) {
		CGC = cGC;
	}
	
}
