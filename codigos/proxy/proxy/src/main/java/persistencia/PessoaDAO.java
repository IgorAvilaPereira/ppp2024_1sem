package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Pessoa;

public class PessoaDAO {

    // activeRecord
    private Connection conexao;

    public void salvar(Pessoa p) {
        System.out.println("Bah muito custoso! O que fazer? Vou ter que me salvar!!");
        this.conexao = new ConexaoPostgreSQL().getConnection();
        String sql = "INSERT INTO pessoa (nome) values (?)";
        try (PreparedStatement preparedStatement = this.conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, p.getNome());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            this.conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        System.out.println("Bah n eh tão custoso assim! Mas o que fazer? Vou ter que me deletar!!");
        this.conexao = new ConexaoPostgreSQL().getConnection();
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (PreparedStatement preparedStatement = this.conexao.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            this.conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void carregarPorId(Pessoa p) {
        this.conexao = new ConexaoPostgreSQL().getConnection();
        String sql = "select * from pessoa where id = ?";
        try (PreparedStatement preparedStatement = this.conexao.prepareStatement(sql)) {
            preparedStatement.setInt(1, p.getId());
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()){
                p.setNome(rs.getString("nome"));
            } 
            else {
                throw new IllegalStateException("n existe");
            }
            preparedStatement.close();
            this.conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

}