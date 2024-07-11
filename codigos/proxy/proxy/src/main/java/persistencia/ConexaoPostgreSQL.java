package persistencia;

import java.sql.*;

public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String username;
    private String dbname;
    private String password;

    public ConexaoPostgreSQL(){
        this.host = "localhost";
        this.port = "5432";
        this.username = "postgres";
        this.dbname = "proxy";
        this.password = "postgres";
    }

    public Connection getConnection(){
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Nops! Conexão!");
        }
        return null;
    }

}
