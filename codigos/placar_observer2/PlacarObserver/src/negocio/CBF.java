package negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CBF implements Observer {



    @Override
    public void update(String mensagem) {
        System.out.println("cbf cadastrando placar");
        
        String host = "localhost";
        String dbname = "cbf";
        String username = "postgres";
        String password = "postgres";
        String port = "5432";

        String sql = "INSERT INTO placar (mensagem) VALUES ('"+mensagem+"');";

        String url = "jdbc:postgresql://"+host+":"+port+"/"+dbname;
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.prepareStatement(sql).execute();
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    
}
