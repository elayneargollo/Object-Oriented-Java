public enum CampoHarmonicoEnum {
	C("Do"), D("Re"), E("MiMaior"), F("FaMaior"), G("SolMaior"), A("LaMaior"), B("SiMaior");
	
	private String faixa;
	
	CampoHarmonicoEnum(String faixa){
		this.faixa = faixa;
	}
	
	public String getFaixa() {
		return faixa;
	}	
	
}
