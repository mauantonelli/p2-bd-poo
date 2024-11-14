package domain.repository;
import domain.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends Repository<Produto> {
    @Override
    void update(Produto type);

    @Override
    void save(Produto type);
    @Override
    void delete(Produto type);

    @Override
    Optional<Produto> findById(int id);

    @Override
    List<Produto> findAll();
}
