package persistencia;

import java.sql.*;

public class ConexaoPostgreSQL {
    private String username;
    private String password;
    private String host;
    private String port;
    private String dbname;

    public ConexaoPostgreSQL(){
        this.username = "postgres";
        this.password = "postgres";
        this.port = "5432";
        this.host = "localhost";
        this.dbname = "site_tads";
        
    }

    public Connection getConexao() throws SQLException{
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        return DriverManager.getConnection(url, username, password);
    }
   
}
