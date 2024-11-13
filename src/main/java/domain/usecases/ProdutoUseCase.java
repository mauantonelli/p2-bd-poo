package domain.usecases;

import domain.repository.ProdutoRepository;

public class ProdutoUseCase {
    private final ProdutoRepository repository;

    public ProdutoUseCase(ProdutoRepository repository) {
        this.repository = repository;
    }
}
