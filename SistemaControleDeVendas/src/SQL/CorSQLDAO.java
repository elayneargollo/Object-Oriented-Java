package SQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Entidades.CMYK;
import Model.Entidades.Cor;
import Model.Entidades.Pigmento;
import Model.Entidades.RGB;
import Persistencia.CorDAO;

public class CorSQLDAO extends AbstractSQLDAO implements CorDAO {

	private static String tipoCor;
	
	@Override
	public void save(Cor cor, Pigmento pigmento) throws ClassNotFoundException, SQLException {
	
		PreparedStatement stmt = this.getConnection().prepareStatement(CorSQLDAO.getInsert(cor));
		
		if (cor instanceof RGB) {
			
			stmt.setInt(1, ((RGB)cor).getRed());
			stmt.setInt(2, ((RGB)cor).getGreen());
			stmt.setInt(3, ((RGB)cor).getBlue());
			stmt.setString(4, pigmento.getid_pigmento());
			
			stmt.executeUpdate();
			stmt.close();
		}
		else if (cor instanceof CMYK) {
			
			stmt.setFloat(1, (float) ((CMYK)cor).getK());
			stmt.setFloat(2, (float) ((CMYK)cor).getM());
			stmt.setFloat(3, (float) ((CMYK)cor).getY());
			stmt.setFloat(4, (float) ((CMYK)cor).getC());
			stmt.setString(5, pigmento.getid_pigmento());
			
			stmt.executeUpdate();
			stmt.close();
		}
		
	}
	
	private static String getInsert(Cor cor) {
		if (cor instanceof RGB) {
			tipoCor = "RGB";	
			return "INSERT INTO " + tipoCor + " (red, green, blue, id_pigmento) VALUES(?, ?, ?, ?)";
		}
		else if (cor instanceof CMYK) {
			tipoCor = "CMYK";
			return "INSERT INTO " + tipoCor + " (ciano, magenta, amarelo, preto, id_pigmento) VALUES(?, ?, ?, ?, ?)";
		}	
		
		return null;
	}

}
