package br.senai.model;

import java.util.Date;

public class Pedido {
    private String descricao;
    private Date data;
    private double total;
    private ItensDoPedido ItensDoPedido;

    public Pedido(String descricao, Date data, double total, br.senai.model.ItensDoPedido itensDoPedido) {
        this.descricao = descricao;
        this.data = data;
        this.total = total;
        ItensDoPedido = itensDoPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public br.senai.model.ItensDoPedido getItensDoPedido() {
        return ItensDoPedido;
    }

    public void setItensDoPedido(br.senai.model.ItensDoPedido itensDoPedido) {
        ItensDoPedido = itensDoPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", total=" + total +
                ", ItensDoPedido=" + ItensDoPedido +
                '}';
    }
}
