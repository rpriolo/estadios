package br.com.rpriolo.estadios.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoHttp {
    private String url = "https://649d7b029bac4a8e669dd151.mockapi.io/estadios";
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public HttpResponse<String> montarConexao(String url) {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            this.response = this.client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public String buscarTodosOsEstadios() {
        HttpResponse<String> response = montarConexao(this.url);
        return response.body();
    }

    public String buscarEstadiosPorNome(String nome) {
        String nomeUrl = nome.replace(' ', '+');
        String novaUrl = this.url + "?nome=" + nomeUrl;
        HttpResponse<String> response = montarConexao(novaUrl);
        return response.body();
    }

    public String buscarEstadiosPorTime(String time) {
        String timeUrl = time.replace(' ', '+');
        String novaUrl = this.url + "?time=" + timeUrl;
        HttpResponse<String> response = montarConexao(novaUrl);
        return response.body();
    }
}
