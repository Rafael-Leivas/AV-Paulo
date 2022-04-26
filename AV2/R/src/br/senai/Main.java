package br.senai;

import br.senai.model.Pedido;
import br.senai.model.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        produtos nomeProduto1 = new produtos();
        nomeProduto1.add(new produtos("Rafael Leivas",123, 123, "@gmail.com"));
        nomeProduto1.add(new produtos("Bortnik Leivas",123, 123, "@gmail.com"));
        nomeProduto1.add(new produtos("Rafael Bortnik Leivas",123, 123, "@gmail.com"));
        nomeProduto1.add(new produtos("Bortnik Rafael",123, 123, "@gmail.com"));
        nomeProduto1.add(new produtos("Leivas Bortnik Rafael",123, 123, "@gmail.com"));

        Produto nomeEvento1 = new Produto("Nome Evento 1", 04.12, nomeProduto1);
        nomeEvento1.imprimirprodutos();

    }
}
