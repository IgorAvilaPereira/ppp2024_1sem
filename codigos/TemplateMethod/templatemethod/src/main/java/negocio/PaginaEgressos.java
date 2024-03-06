package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import persistencia.ConexaoPostgreSQL;

public class PaginaEgressos extends Pagina {

    private ConexaoPostgreSQL conexao;

    public PaginaEgressos(String title) {
        super(title);
        this.conexao = new ConexaoPostgreSQL();
    }

    @Override
    protected String renderizarConteudo() {
        String html = "";
        try (Connection connection = this.conexao.getConexao()) {
            String sql = "SELECT * FROM egressos;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                html += rs.getInt("ano")+"/"+rs.getInt("semestre")+" "+rs.getString("nome")+"<br>";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return html;
        

    }
    
}
