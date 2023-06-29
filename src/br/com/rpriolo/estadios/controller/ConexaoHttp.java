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

    public String getUrl() {
        return url;
    }
}
