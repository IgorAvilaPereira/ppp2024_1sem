package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.*;

public class EncurtadorDAO {

    public boolean salvaUrl(Encurtador encurtador) throws SQLException{
        String sql = "INSERT INTO links (url_original, url_encurtada) values (?, ?);";
        Connection conexao = ConexaoPostgreSQL.getInstance();
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, encurtador.getUrlOriginal());
        statement.setString(2, encurtador.getUrlEncurtada());
        return statement.executeUpdate() == 1;
    }

    public String obterUrlOriginal(String urlEncurtada) throws SQLException, IllegalAccessException{
        String urlOriginal = null;
        String sql = "SELECT url_original FROM links WHERE url_encurtada = ?;";
        Connection conexao = ConexaoPostgreSQL.getInstance();
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, urlEncurtada);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            urlOriginal = rs.getString("url_original");
        } else {
            throw new IllegalAccessException("Deu xabum! Precisa encurtar antes!!");
        }    
        return urlOriginal;

    }
    
}
