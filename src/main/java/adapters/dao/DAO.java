package adapters.dao;

import java.util.List;
import java.util.Optional;

public interface DAO <T>{
    void save(T type);
    void delete(T type);
    void update(T type);
    Optional<T> findById(int id);
    List<T> findAll();

}