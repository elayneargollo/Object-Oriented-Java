package Model.Entidades;

public class RGB extends Cor {

	protected int red;
	protected int green;
	protected int blue;

	public RGB() {
	
	}
	
	public String toString() {
		return "red: " +getRed() 
				+"\nblue: " +getBlue()
				+"\ngreen: " +getGreen()
				+"\n-----------";
	}

	public RGB(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}

	public void setCor(String hex){
		
		String base = hex;
		
		red = Integer.parseInt ((String) base.subSequence(0, 2), 16);
		green = Integer.parseInt ((String) base.subSequence(2, 4), 16);	
		blue = Integer.parseInt ((String) base.subSequence(4, 6), 16);
	}
	
	@Override
	public double distanciaEuclidiana(RGB cor) {
		
		double qtrBlue= (this.blue - cor.getBlue());
		double qtrGreen= (this.green - cor.getGreen());
		double qtrRed= (this.red - cor.getRed());
		
		if (qtrBlue < 0) {
			qtrBlue = (-1)*qtrBlue;
		} if (qtrGreen < 0) {
			qtrGreen = (-1)*qtrGreen;
		} if (qtrRed <0) {
			qtrRed = (-1)*qtrRed;
		}

		return Math.sqrt(Math.pow(qtrRed, 2) + Math.pow(qtrGreen, 2) + Math.pow(qtrBlue, 2));
	}

	@Override
	public int setQuantidade(int quantidade) {
		// TODO Auto-generated method stub
		return 0;
	}


}
