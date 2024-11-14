package adapters.dao;

import adapters.ConnectionFactory;
import domain.entity.ItemVenda;
import domain.entity.Produto;
import domain.entity.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ItemVendaDAOimpl implements ItemVendaDAO {

    @Override
    public void save(ItemVenda itemVenda) {
        String sql = "INSERT INTO ItemVenda (idItemVenda, quantidadeVendida, valorTotal, produto_id, venda_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, itemVenda.getIdItemVenda());
            pstmt.setInt(2, itemVenda.getQuantidadeVendida());
            pstmt.setDouble(3, itemVenda.getValorTotal());
            pstmt.setInt(4, itemVenda.getProduto().getIdProduto());
            pstmt.setInt(5, itemVenda.getVenda().getIdVenda());

            pstmt.executeUpdate();
            System.out.println("ItemVenda salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao salvar ItemVenda: " + e.getMessage());
            e.printStackTrace(); // Para rastrear detalhes do erro
        }
    }

    @Override
    public void delete(ItemVenda type) {

    }

    @Override
    public void update(ItemVenda type) {

    }

    @Override
    public Optional<ItemVenda> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<ItemVenda> findAll() {
        return null;
    }

    @Override
    public List<ItemVenda> buscarItemVenda(Venda venda) {
        return null;
    }
}
