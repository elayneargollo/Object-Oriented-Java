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
	private int quantidade;
	private String cor;

	public SeedPigmento(){
	
	}
	
	public void seed() {
		quantidade = 2;
		cor = "63B8FF";
			try {
				pigmentoDAO.search(quantidade,"63B8FF");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
