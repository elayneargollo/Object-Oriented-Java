package Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.Entidades.Pigmento;

public interface PigmentoDAO {

	/* ele vai atualizar o estoque da cor - ok */
	public void update(Pigmento p) throws ClassNotFoundException, SQLException; 
	public void save(Pigmento p) throws ClassNotFoundException, SQLException;
	public ArrayList<Pigmento> searchByQuantity(int quantidade) throws ClassNotFoundException, SQLException;
	public Pigmento searchForRequest(String pigmento ,ArrayList<Pigmento> p) throws ClassNotFoundException, SQLException;
	public Pigmento search(int quantidade, String pigmento) throws ClassNotFoundException, SQLException;
}
