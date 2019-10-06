package SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Model.Entidades.CMYK;
import Model.Entidades.Cor;
import Model.Entidades.Pigmento;
import Model.Entidades.RGB;
import Persistencia.PigmentoDAO;

public class PigmentoSQLDAO extends AbstractSQLDAO implements PigmentoDAO{

	ArrayList<Pigmento> pigmentos = new ArrayList();
	CorSQLDAO corsql = new CorSQLDAO();
	
	/*private static final String UPDATE_QUANTIDADE = 
			"UPDATE Pigmento " + 
			"SET quantidade = ? " +
			"WHERE nome = ?";*/
	
	private static final String INSERT_PIGMENTO = 
			"INSERT INTO pigmento(preco, quantidade, id_pigmento, nome) " +
			"VALUES(?, ?, ?, ?)";
	
	private static final String SELECT_QUANTIDADECMYK=
			" SELECT * FROM pigmento as pi " +
			" INNER JOIN CMYK as cm " +
			" ON pi.id_pigmento = cm.id_pigmento " +
			" WHERE quantidade >= ? ";
	

	private static final String SELECT_QUANTIDADERGB=
			" SELECT * FROM pigmento as pi " +
			" INNER JOIN RGB as rgb " +
			" ON pi.id_pigmento = rgb.id_pigmento " +
			" WHERE quantidade >= ? ";
	
	@Override
	public void  save(Pigmento p) throws ClassNotFoundException, SQLException {
		
		
		PreparedStatement stmt = this.getConnection().prepareStatement(PigmentoSQLDAO.INSERT_PIGMENTO);
		stmt.setFloat(1, p.getPreco());
		stmt.setFloat(2, p.getQuantidade());
		stmt.setString(3, p.getid_pigmento());
		stmt.setString(4, p.getNomeFantasia());
		
		stmt.executeUpdate();
		
		corsql.save(p.getCor(), p);
		
		stmt.close();
		
	}

	@Override
	public ArrayList<Pigmento> searchByQuantity(int quantidade) throws ClassNotFoundException, SQLException {

		Pigmento pigmento = null;
	
		PreparedStatement stmtRgb = this.getConnection().prepareStatement(PigmentoSQLDAO.SELECT_QUANTIDADERGB);
		stmtRgb.setInt(1, quantidade);		
		
		ResultSet rSetRgb = stmtRgb.executeQuery();
		
		PreparedStatement stmtCmyk = this.getConnection().prepareStatement(PigmentoSQLDAO.SELECT_QUANTIDADECMYK);
		stmtCmyk.setInt(1, quantidade);		
		
		ResultSet rSetCmyk = stmtCmyk.executeQuery();

		while (rSetRgb.next()) {
			pigmento = new Pigmento();
			RGB rgb;
			
			pigmento.setid_pigmento(rSetRgb.getString("id_pigmento"));
			pigmento.setQuantidade(rSetRgb.getFloat("quantidade"));
					
			rgb = new RGB(	rSetRgb.getInt("red"),
							rSetRgb.getInt("green"),
							rSetRgb.getInt("blue"));

			pigmento.setCor(rgb);
			pigmentos.add(pigmento);
		}

		while (rSetCmyk.next()) {
			pigmento = new Pigmento();
			CMYK cmyk;
			
			pigmento.setid_pigmento(rSetCmyk.getString("id_pigmento"));
			pigmento.setQuantidade(rSetCmyk.getFloat("quantidade"));
					
			cmyk = new CMYK(rSetCmyk.getDouble("ciano"),
							rSetCmyk.getDouble("magenta"),
							rSetCmyk.getDouble("amarelo"),
							rSetCmyk.getDouble("preto"));

			pigmento.setCor(cmyk);
			pigmentos.add(pigmento);
		}

		
		return pigmentos;
		
	}

	@Override
	public Pigmento searchForRequest(String pigmento, ArrayList<Pigmento> p) throws ClassNotFoundException, SQLException {
		double menor = 0;
		
		return null;
	}

	@Override
	public Pigmento search(int quantidade, String pigmento) throws ClassNotFoundException, SQLException {
	
		ArrayList<Pigmento> p = searchByQuantity(quantidade);
		Pigmento resultado = searchForRequest(pigmento, p);
		
		for (Pigmento a : p) {
			System.out.println(a.getCor());
		}
		
		return resultado;
	}

	
	
}

