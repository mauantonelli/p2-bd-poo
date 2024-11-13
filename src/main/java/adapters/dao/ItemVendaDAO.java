package adapters.dao;

import domain.entity.ItemVenda;
import domain.entity.Venda;

import java.util.List;

public interface ItemVendaDAO extends DAO<ItemVenda> {
    List<ItemVenda> buscarItemVenda(Venda venda);
}
