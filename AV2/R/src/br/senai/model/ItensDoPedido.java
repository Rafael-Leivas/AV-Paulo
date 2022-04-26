package br.senai.model;

public class ItensDoPedido {
    private String produtos;
    private int quantidade;

    public ItensDoPedido(String produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }

    public String getProdutos() {
        return produtos;
    }
    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "produtos=" + produtos +
                ", quantidade=" + quantidade +
                '}';
    }
}
