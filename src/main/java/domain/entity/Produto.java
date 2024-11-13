package domain.entity;

public class Produto {
    private int idProduto;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(int idProduto, String descricao, double precoUnitario, int quantidadeEstoque) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        if (quantidade < 0 && Math.abs(quantidade) > quantidadeEstoque) {
            System.out.println("Erro: Não é possível remover mais do que o estoque disponível.");
        } else {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque atualizado. Quantidade atual: " + quantidadeEstoque);
        }
    }
}
