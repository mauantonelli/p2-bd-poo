package domain.usecases;
import domain.entity.ItemVenda;
import domain.repository.ItemVendaRepository;

public class ItemVendaUseCase {
    private final ItemVendaRepository repository;

    public ItemVendaUseCase(ItemVendaRepository repository) {
        this.repository = repository;
    }


}
