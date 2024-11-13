package adapters.repository;

import adapters.dao.ItemVendaDAO;
import domain.entity.ItemVenda;
import domain.repository.ItemVendaRepository;

import java.util.List;
import java.util.Optional;

public class ItemVendaRepositoryImpl implements ItemVendaRepository {
    private final ItemVendaDAO dao;

    public ItemVendaRepositoryImpl(ItemVendaDAO dao) {
        this.dao = dao;
    }

    @Override
    public void save(ItemVenda itemVenda) {

    }

    @Override
    public void update(ItemVenda itemVenda) {

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
    public void delete(ItemVenda itemVenda) {

    }
}
