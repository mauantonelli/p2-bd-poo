package adapters.dao;
import adapters.ConnectionFactory;
import domain.entity.Produto;

import java.util.List;
import java.util.Optional;

public class ProdutoDAOimpl implements ProdutoDAO {


    @Override
    public void save(Produto type) {

    }

    @Override
    public void delete(Produto type) {

    }

    @Override
    public void update(Produto type) {

    }

    @Override
    public Optional<Produto> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Produto> findAll() {
        return null;
    }
}
