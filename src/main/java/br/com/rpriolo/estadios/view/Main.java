package br.com.rpriolo.estadios.view;

import br.com.rpriolo.estadios.controller.BuscaApi;
import br.com.rpriolo.estadios.model.Estadio;
import com.google.gson.Gson;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuscaApi busca = new BuscaApi();
//        System.out.println(busca.buscarTodosOsEstadios());
//        System.out.println("-----");
        String resultado = busca.buscarEstadiosPorNome("parque");
        System.out.println(resultado);
//        System.out.println("-----");
//        System.out.println(busca.buscarEstadiosPorTime("São Paulo"));

        Gson gson = new Gson();
        Estadio[] listaEstadios = gson.fromJson(resultado, Estadio[].class);

        for (Estadio estadio : listaEstadios) {
            System.out.println(estadio);
        }
    }
}