package br.com.rpriolo.estadios.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Estadio {
    private String nome;
    private String time;
    private int capacidade;
    private int id;

    public Estadio(String nome, String time, int capacidade, int id) {
        this.nome = nome;
        this.time = time;
        this.capacidade = capacidade;
        this.id = id;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getInstance(new Locale("pt", "BR"));
        String capacidadeFormat = format.format(capacidade);
        return  "Nome: " + nome + "\n" +
                "Time: " + time + "\n" +
                "Capacidade: " + capacidadeFormat + "\n" +
                "ID: " + id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
