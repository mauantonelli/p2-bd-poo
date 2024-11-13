package domain.repository;

import domain.entity.Venda;

import java.util.Optional;

public interface VendaRepository extends Repository<Venda> {
    @Override
    void delete(Venda type);

    @Override
    void save(Venda type);

    @Override
    void update(Venda type);

    @Override
    Optional<Venda> findById(int id);
}
