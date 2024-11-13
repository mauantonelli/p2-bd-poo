package domain.repository;
import domain.entity.ItemVenda;

public interface ItemVendaRepository extends Repository<ItemVenda> {
    void save(ItemVenda itemVenda);
    void update(ItemVenda itemVenda);
    void delete(ItemVenda itemVenda);

}
