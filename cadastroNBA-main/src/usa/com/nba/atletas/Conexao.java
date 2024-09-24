package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	    private static final String URL = "jdbc:mysql://localhost:3306/nba_db";
	    private static final String USUARIO = "root";
	    private static final String SENHA = "etec";

	    public static Connection conectar() throws SQLException {
	        return DriverManager.getConnection(URL, USUARIO, SENHA);
	    }

	    public static void fechar(Connection conexao) {
	        if (conexao != null) {
	            try {
	                conexao.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	  }
}
