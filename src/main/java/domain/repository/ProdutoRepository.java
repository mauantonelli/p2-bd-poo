package domain.repository;
import domain.entity.Produto;

public interface ProdutoRepository extends Repository<Produto> {
    @Override
    void update(Produto type);

    @Override
    void save(Produto type);
    @Override
    void delete(Produto type);

}
