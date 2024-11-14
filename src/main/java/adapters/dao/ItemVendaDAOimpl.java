package adapters.dao;

import adapters.ConnectionFactory;
import domain.entity.ItemVenda;
import domain.entity.Produto;
import domain.entity.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemVendaDAOimpl implements ItemVendaDAO {

    // esse aqui é o método que vai salvar um novo ItemVenda no banco
    @Override
    public void save(ItemVenda itemVenda) {
        // aqui a gente monta o sql pra inserir os dados na tabela ItemVenda
        String sql = "INSERT INTO ItemVenda (idItemVenda, quantidadeVendida, valorTotal, produto_id, venda_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection(); // pega a conexão com o banco
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // prepara o comando SQL pra execução

            // aqui a gente seta os valores que vão dentro dos "?" no sql, passando as informações do itemVenda
            pstmt.setInt(1, itemVenda.getIdItemVenda()); // coloca o idItemVenda no primeiro "?"
            pstmt.setInt(2, itemVenda.getQuantidadeVendida()); // coloca a quantidadeVendida no segundo "?"
            pstmt.setDouble(3, itemVenda.getValorTotal()); // coloca o valorTotal no terceiro "?"
            pstmt.setInt(4, itemVenda.getProduto().getIdProduto()); // coloca o idProduto no quarto "?"
            pstmt.setInt(5, itemVenda.getVenda().getIdVenda()); // coloca o idVenda no quinto "?"

            // agora a gente executa o sql e manda os dados pro banco
            pstmt.executeUpdate();
            System.out.println("ItemVenda salvo com sucesso!");

        } catch (SQLException e) {
            // caso dê erro no processo, a gente captura e imprime o erro
            System.out.println("Erro ao salvar ItemVenda: " + e.getMessage());
            e.printStackTrace(); // imprime detalhes do erro no console
        }
    }

    // método que vai deletar um ItemVenda do banco, mas ainda não implementado
    @Override
    public void delete(ItemVenda itemVenda) {
        // aqui vai o código pra deletar o itemVenda do banco, usando o idItemVenda
        String sql = "DELETE FROM ItemVenda WHERE idItemVenda = ?";

        try (Connection conn = ConnectionFactory.getConnection(); // pega a conexão com o banco
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // prepara o comando SQL

            // seta o idItemVenda que vai ser deletado no "?"
            pstmt.setInt(1, itemVenda.getIdItemVenda());

            // executa o comando de deletar
            pstmt.executeUpdate();
            System.out.println("ItemVenda deletado com sucesso!");

        } catch (SQLException e) {
            // caso dê erro no processo, a gente captura e imprime o erro
            System.out.println("Erro ao deletar ItemVenda: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // esse método vai atualizar os dados de um ItemVenda no banco
    @Override
    public void update(ItemVenda itemVenda) {
        // monta o sql pra atualizar os dados na tabela ItemVenda
        String sql = "UPDATE ItemVenda SET quantidadeVendida = ?, valorTotal = ?, produto_id = ?, venda_id = ? WHERE idItemVenda = ?";

        try (Connection conn = ConnectionFactory.getConnection(); // pega a conexão com o banco
             PreparedStatement pstmt = conn.prepareStatement(sql)) { // prepara o comando SQL

            // seta os novos valores no sql
            pstmt.setInt(1, itemVenda.getQuantidadeVendida()); // nova quantidadeVendida
            pstmt.setDouble(2, itemVenda.getValorTotal()); // novo valorTotal
            pstmt.setInt(3, itemVenda.getProduto().getIdProduto()); // novo produto_id
            pstmt.setInt(4, itemVenda.getVenda().getIdVenda()); // novo venda_id
            pstmt.setInt(5, itemVenda.getIdItemVenda()); // idItemVenda que a gente vai atualizar

            // executa a atualização no banco
            pstmt.executeUpdate();
            System.out.println("ItemVenda atualizado com sucesso!");

        } catch (SQLException e) {
            // caso dê erro, a gente captura e imprime o erro
            System.out.println("Erro ao atualizar ItemVenda: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // esse método vai buscar um ItemVenda pelo id
    @Override
    public Optional<ItemVenda> findById(int id) {
        return null;
    }


    // esse método vai buscar todos os ItemVendas no banco
    @Override
    public List<ItemVenda> findAll() {
        return null;
    }


    // esse método vai buscar todos os itens de uma venda específica
    @Override
    public List<ItemVenda> buscarItemVenda(Venda venda) {
        return null;
    }

}
