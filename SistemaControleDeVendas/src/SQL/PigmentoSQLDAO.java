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
	
	private static final String UPDATE_QUANTIDADE = 
			"UPDATE pigmento " + 
			"SET quantidade = ? " +
			"WHERE nomefantasia = ?";
	
	private static final String INSERT_PIGMENTO = 
			"INSERT INTO pigmento(preco, quantidade, id_pigmento, NomeFantasia) " +
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
			
			pigmento.setNomeFantasia(rSetRgb.getString("NomeFantasia"));
			pigmento.setPreco(rSetRgb.getFloat("preco"));
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
			
			pigmento.setNomeFantasia(rSetCmyk.getString("id_pigmento"));
			pigmento.setPreco(rSetCmyk.getFloat("preco"));
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
	
		double[] distancia = new double[p.size()];
		double menor = distancia[0];
		int j=0;

		RGB c = new RGB();		
		((RGB)c).setCor(pigmento);	

		for (int i=0; i< p.size(); i++) {

			distancia[i] = p.get(i).getCor().getdistanciaEuclidiana(c);

			if (distancia[i]<=menor) {
				menor = distancia[i];
				j = i;
			}
		}
		
		pigmento = p.get(j).getid_pigmento();
		return p.get(j);
	}

	@Override
	public Pigmento search(int quantidade, String pigmento) throws ClassNotFoundException, SQLException {
	
		ArrayList<Pigmento> p = searchByQuantity(quantidade);
		Pigmento resultado = searchForRequest(pigmento, p);
	
		System.out.println("Cor: " +resultado.getNomeFantasia() +"\nQuantidade Pedida: " +quantidade);
		
		/*se ele comprar ... */
		System.out.println("Preco a pagar: R$ " +resultado.valor(quantidade));
		/*eu debito do estoque*/
		resultado.debitar(quantidade);
		
		update(resultado);
		
	//	System.out.println("\nQuantidade atualizada: " +resultado.getQuantidade());
		
		return resultado;
	}

	@Override
	public void update(Pigmento p) throws ClassNotFoundException, SQLException {
	
		PreparedStatement stmt = this.getConnection().prepareStatement(PigmentoSQLDAO.UPDATE_QUANTIDADE);
		
		stmt.setFloat(1, p.getQuantidade());
		stmt.setString(2, p.getNomeFantasia());
		stmt.executeUpdate();		
		stmt.close();
		
	}
	

}
