package domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int idVenda;
    private String dataVenda;
    private double valorTotalVenda;
    private List<ItemVenda> itemVendaList = new ArrayList<>();

    public Venda(int idVenda, String dataVenda, List<ItemVenda> itemVendaList) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.itemVendaList = itemVendaList;
        calcularValorTotalVenda();
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<ItemVenda> getItemVendaList() {
        return itemVendaList;
    }

    public void setItemVendaList(List<ItemVenda> itemVendaList) {
        this.itemVendaList = itemVendaList;
        calcularValorTotalVenda();
    }

    public void calcularValorTotalVenda() {
        valorTotalVenda = 0;
        for (ItemVenda item : itemVendaList) {
            valorTotalVenda += item.getValorTotal();
        }
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }
}
