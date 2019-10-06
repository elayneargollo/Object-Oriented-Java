package Model.Entidades;


public class Pigmento{
	
	private float preco;
	private float quantidade;
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

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + Float.floatToIntBits(quantidade);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pigmento other = (Pigmento) obj;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (Float.floatToIntBits(quantidade) != Float.floatToIntBits(other.quantidade))
			return false;
		return true;
	}


}

