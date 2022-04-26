package br.senai;

import br.senai.model.Cliente;
import br.senai.model.Evento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> nomeEvento1ArrayList = new ArrayList<Cliente>();
        nomeEvento1ArrayList.add(new Cliente("Rafael Leivas",123, 123, "@gmail.com"));
        nomeEvento1ArrayList.add(new Cliente("Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento1ArrayList.add(new Cliente("Rafael Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento1ArrayList.add(new Cliente("Bortnik Rafael",123, 123, "@gmail.com"));
        nomeEvento1ArrayList.add(new Cliente("Leivas Bortnik Rafael",123, 123, "@gmail.com"));

        Evento nomeEvento1 = new Evento("Nome Evento 1", 04.12, nomeEvento1ArrayList);
        nomeEvento1.imprimirEvento();

        ArrayList<Cliente> nomeEvento2ArrayList = new ArrayList<Cliente>();
        nomeEvento2ArrayList.add(new Cliente("Rafael Leivas",123, 123, "@gmail.com"));
        nomeEvento2ArrayList.add(new Cliente("Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento2ArrayList.add(new Cliente("Rafael Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento2ArrayList.add(new Cliente("Bortnik Rafael",123, 123, "@gmail.com"));
        nomeEvento2ArrayList.add(new Cliente("Leivas Bortnik Rafael",123, 123, "@gmail.com"));

        Evento nomeEvento2 = new Evento("\nNome Evento 2", 03.12, nomeEvento2ArrayList);
        nomeEvento2.imprimirEvento();

        ArrayList<Cliente> nomeEvento3ArrayList = new ArrayList<Cliente>();
        nomeEvento3ArrayList.add(new Cliente("Rafael Leivas",123, 123, "@gmail.com"));
        nomeEvento3ArrayList.add(new Cliente("Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento3ArrayList.add(new Cliente("Rafael Bortnik Leivas",123, 123, "@gmail.com"));
        nomeEvento3ArrayList.add(new Cliente("Bortnik Rafael",123, 123, "@gmail.com"));
        nomeEvento3ArrayList.add(new Cliente("Leivas Bortnik Rafael",123, 123, "@gmail.com"));

        Evento nomeEvento3 = new Evento("\nNome Evento 3", 02.12, nomeEvento3ArrayList);
        nomeEvento3.imprimirEvento();

    }
}
