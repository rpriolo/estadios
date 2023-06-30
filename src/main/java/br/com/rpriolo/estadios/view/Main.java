package br.com.rpriolo.estadios.view;

import br.com.rpriolo.estadios.controller.BuscaApi;

public class Main {
    public static void main(String[] args) {
        BuscaApi busca = new BuscaApi();
        System.out.println(busca.buscarTodosOsEstadios());
        System.out.println("-----");
        String resultado = busca.buscarEstadiosPorNome("Vila Belmiro");
        System.out.println(resultado);
        System.out.println("-----");
        System.out.println(busca.buscarEstadiosPorTime("São Paulo"));
    }
}