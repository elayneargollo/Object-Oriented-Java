
public enum Tamanho {

	PEQUENA(1), MEDIA(2), GRANDE(3);	

	public int qntPedaco;
	
    Tamanho(int pedaco) {
    	qntPedaco = pedaco;
    }
    
    public int getQuantidadeSabor(Tamanho tamanho) {
    	return qntPedaco;    	
    }
	
}


