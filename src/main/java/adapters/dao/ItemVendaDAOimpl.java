package adapters.dao;
import adapters.ConnectionFactory;
import domain.entity.ItemVenda;
import domain.entity.Venda;

import java.util.List;
import java.util.Optional;

public class ItemVendaDAOimpl implements ItemVendaDAO {

    @Override
    public void save(ItemVenda type) {

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
