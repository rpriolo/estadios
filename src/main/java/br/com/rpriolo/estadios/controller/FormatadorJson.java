package br.com.rpriolo.estadios.controller;

import br.com.rpriolo.estadios.model.Estadio;
import com.google.gson.Gson;

public class FormatadorJson {

    public static void formatarJson(String json){
        Gson gson = new Gson();
        Estadio[] listaEstadios = gson.fromJson(json, Estadio[].class);

        for (Estadio estadio : listaEstadios) {
            System.out.println();
            System.out.println(estadio);
        }
    }

}
