package domain.usecases;
import domain.entity.ItemVenda;
import domain.repository.ItemVendaRepository;

public class ItemVendaUseCase {
    private final ItemVendaRepository repository;

    public ItemVendaUseCase(ItemVendaRepository repository) {
        this.repository = repository;
    }

    public void save(ItemVenda itemVenda){
        repository.save(itemVenda);
    }

    public void update(ItemVenda itemVenda){
        repository.update(itemVenda);
    }

    public void delete(ItemVenda itemVenda){
        repository.delete(itemVenda);
    }


}
