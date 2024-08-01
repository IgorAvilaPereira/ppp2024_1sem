package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton com lazy loading + synchronized
public class ConexaoPostgreSQL {
    private static final Connection INSTANCE = null;


    private ConexaoPostgreSQL(){}

    public static synchronized Connection getInstance() throws SQLException{
        if (INSTANCE == null){
            String url = "jdbc:postgresql://localhost:5432/encurtador";
            String username = "postgres";
            String password = "postgres";
            return DriverManager.getConnection(url, username, password);
        }
        return INSTANCE;
    }
    
    
}
