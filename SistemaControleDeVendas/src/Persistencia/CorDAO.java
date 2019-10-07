package Persistencia;

import java.sql.SQLException;
import Model.Entidades.Cor;
import Model.Entidades.Pigmento;

public interface CorDAO {
	
	public void save(Cor cor, Pigmento pigmento) throws ClassNotFoundException, SQLException, IllegalAccessException;

}
