package br.com.rpriolo.estadios.model;

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
