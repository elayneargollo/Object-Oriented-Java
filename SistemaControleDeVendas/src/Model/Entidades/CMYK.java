package Model.Entidades;

public class CMYK extends Cor{

	private double C;
	private double M;
	private double Y;
	private double k;
	
	@Override
	public void setCor(String hex) {
		
		String base = hex;		
		
		double minCMY;
		int RR = Integer.parseInt ((String) base.subSequence(0, 2), 16);
		int GG = Integer.parseInt ((String) base.subSequence(2, 4), 16);	
		int BB = Integer.parseInt ((String) base.subSequence(4, 6), 16);
		
		C=(1.0 - (RR/255.0));
		M=(1.0 - (GG/255.0));
		Y=(1.0 - (BB/255.0));
		
		minCMY = Math.min(C,Math.min(M,Y));
				  
		C = (C - minCMY) / (1.0-minCMY) ; 
		M = (M - minCMY) / (1.0-minCMY) ; 
		Y = (Y - minCMY) / (1.0-minCMY) ;
		k = minCMY;	
		
	}
	
	@Override
	public double distanciaEuclidiana(RGB cor) {
		
		double qtrBlue= (((int) (255 * (1-Y) * (1-k))) - cor.getBlue());
		double qtrGreen= (((int) (255 * (1-M) * (1-k))) - cor.getGreen());
		double qtrRed= (((int) (255 * (1-C) * (1-k))) - cor.getRed());		
		
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
	public String toString() {
		return "\nCyano:"
				+C
				+"\nMargenta:"
				+M
				+"\nYeloow:"
				+Y
				+"\nBlack:"
				+k;
	}

	@Override
	public int setQuantidade(int quantidade) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
