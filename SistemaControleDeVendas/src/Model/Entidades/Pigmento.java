package Model.Entidades;


public class Pigmento{
	
	private float preco;
	protected float quantidade;
	private String id_pigmento;
	private String nomeFantasia;
	private Cor cor;
	
	public Pigmento() {	
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float valor (float quantidade) {
		return quantidade*this.preco;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;		
	}
	
	public void debitar (float pedido) {
		this.quantidade = quantidade - pedido;
	}
	

	public String getid_pigmento() {
		return id_pigmento;
	}

	public void setid_pigmento(String id_pigmento) {
		this.id_pigmento = id_pigmento;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	

}

