package Model.Entidades;

public abstract class Cor {
	private Cor RGB;
	private Cor CMYK;
	protected String hex;
	
	public Cor() {
	}
	
	public void setRGB(Cor rGB) {
		RGB = rGB;
	}

	public void setCMYK(Cor cMYK) {
		CMYK = cMYK;
	}

	public Cor getRGB() {
		return RGB;
	}
	
	public Cor getCMYK() {
		return CMYK;
	}
		
	public String getHex() {
		return hex;
	}
	
	public void setHex(String hex) {
		this.hex = hex;
	}
	
	public abstract String toString();	
	public abstract int setQuantidade(int quantidade);
	public abstract void setCor(String hex);
	public abstract double distanciaEuclidiana(RGB cor);
	
}
