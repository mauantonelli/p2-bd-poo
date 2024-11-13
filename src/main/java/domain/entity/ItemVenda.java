package domain.entity;

public class ItemVenda implements IMostrarDados {
    private int idItemVenda;
    private int quantidadeVendida;
    private double valorTotal;
    private Produto produto;
    private Venda venda;

    public ItemVenda(int idItemVenda, int quantidadeVendida, Produto produto, Venda venda) {
        this.idItemVenda = idItemVenda;
        this.quantidadeVendida = quantidadeVendida;
        this.produto = produto;
        this.venda = venda;
        calcularValorTotal();
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
        calcularValorTotal();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        calcularValorTotal();
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void calcularValorTotal() {
        if (produto != null) {
            this.valorTotal = this.quantidadeVendida * produto.getPrecoUnitario();
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public void mostrarDados() {
        System.out.println("ID do Item: " + idItemVenda);
        System.out.println("Quantidade Vendida: " + quantidadeVendida);
        System.out.println("Produto: " + (produto != null ? produto.getDescricao() : "N/A"));
        System.out.println("Valor Total: " + valorTotal);
    }
}
