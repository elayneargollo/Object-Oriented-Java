package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractSQLDAO {
	
	private static final String JDBC_DRIVER = "org.postgresql.Driver";
	private static final String URI = "jdbc:postgresql://localhost:5432/SistemaDeCores";
	private static final String USER = "postgres";
	private static final String PWD = "elayne";
	

	public Connection getConnection() throws ClassNotFoundException {
		
		try {
		
			Class.forName(AbstractSQLDAO.JDBC_DRIVER);
			System.out.println("Conexao estabelecida com sucesso");
			return DriverManager.getConnection(AbstractSQLDAO.URI, AbstractSQLDAO.USER,AbstractSQLDAO.PWD );
			
		} catch (SQLException e ) {
			throw new RuntimeException (e);
		}
	
	}

}
