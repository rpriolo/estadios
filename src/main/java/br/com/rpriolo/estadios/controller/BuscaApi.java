package br.com.rpriolo.estadios.controller;

import java.net.http.HttpResponse;

public class BuscaApi {
    public String buscarTodosOsEstadios() {
        ConexaoHttp conexao = new ConexaoHttp();
        HttpResponse<String> response = conexao.montarConexao(conexao.getUrl());
        return response.body();
    }

    public String buscarEstadiosPorNome(String nome) {
        ConexaoHttp conexao = new ConexaoHttp();
        String nomeNaUrl = nome.replace(' ', '+');
        String novaUrl = conexao.getUrl() + "?nome=" + nomeNaUrl;
        HttpResponse<String> response = conexao.montarConexao(novaUrl);
        return response.body();
    }

    public String buscarEstadiosPorTime(String time) {
        ConexaoHttp conexao = new ConexaoHttp();
        String timeNaUrl = time.replace(' ', '+');
        String novaUrl = conexao.getUrl() + "?time=" + timeNaUrl;
        HttpResponse<String> response = conexao.montarConexao(novaUrl);
        return response.body();
    }
}
