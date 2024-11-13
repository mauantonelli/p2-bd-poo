package domain.usecases;

import domain.repository.VendaRepository;

public class VendaUseCase {
    private final VendaRepository repository;

    public VendaUseCase(VendaRepository repository) {
        this.repository = repository;
    }
}
