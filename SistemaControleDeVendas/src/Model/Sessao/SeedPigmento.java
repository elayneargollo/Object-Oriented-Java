package Model.Sessao;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Entidades.CMYK;
import Model.Entidades.Cor;
import Model.Entidades.Pigmento;
import Model.Entidades.RGB;
import Persistencia.PigmentoDAO;
import SQL.PigmentoSQLDAO;

public class SeedPigmento {

	private PigmentoDAO pigmentoDAO = new PigmentoSQLDAO();
	//private Pigmento pigmento = new Pigmento();
	private int quantidade = 45;
	private String cor = "008B8B";

	public SeedPigmento(){
	
	}
	
	public void seed() {
		//pigmento.setid_pigmento("SteelBlue1");
		//pigmento.setNomeFantasia("Aço azul");
	//	pigmento.setPreco(25);
		//pigmento.setQuantidade(15);
		
		/*Cor corrbb1 = new RGB();
		Cor corcmyk1 = new CMYK();
		
		((RGB)corrbb1).setCor("008B8B");		
		((CMYK)corcmyk1).setCor("63B8FF");		
		
		pigmento.setCor(corcmyk1);
		pigmento.setCor(corrbb1);*/
		
		
		//pigmentoDAO.save(pigmento);
		try {
			pigmentoDAO.search(quantidade,"008B8B");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	pigmentoDAO.serachForRequest("008B8B", p);
	}

	
	
}
