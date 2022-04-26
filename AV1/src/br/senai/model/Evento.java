package br.senai.model;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private double data;
    private ArrayList<Cliente> clientes;

    public Evento(String nome, double data) {
        this.nome = nome;
        this.data = data;
    }

    public Evento(String nome, double data, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.data = data;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getData() {
        return data;
    }
    public void setData(double data) {
        this.data = data;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void imprimirEvento(){
        System.out.println("\n" + nome + ", data: " + data + "\nClientes: ");

        for (int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }

}
