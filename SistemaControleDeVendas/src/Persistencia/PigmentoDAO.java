package Persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.Entidades.Pigmento;

public interface PigmentoDAO {

	public void update(Pigmento p) throws ClassNotFoundException, SQLException; 
	public void save(Pigmento p) throws ClassNotFoundException, SQLException, IllegalAccessException;
	public ArrayList<Pigmento> searchByQuantity(int quantidade) throws ClassNotFoundException, SQLException, IllegalAccessException;
	public Pigmento searchForRequest(String pigmento ,ArrayList<Pigmento> p) throws ClassNotFoundException, SQLException, ArrayIndexOutOfBoundsException;
	public Pigmento search(int quantidade, String pigmento) throws ClassNotFoundException, SQLException, IllegalAccessException, ArrayIndexOutOfBoundsException;
}
