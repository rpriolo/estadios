package br.com.rpriolo.estadios.view;

import br.com.rpriolo.estadios.controller.BuscaApi;
import br.com.rpriolo.estadios.controller.FormatadorJson;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static BuscaApi busca = new BuscaApi();

    public static void main(String[] args) {
        exibirMenu();
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("""
                \n--- MENU ---
                Selecione uma opção:
                1 - Buscar todos os estádios
                2 - Buscar estádios por nome
                3 - Buscar estádios por time
                4 - Sair""");
        System.out.print("OPÇÃO: ");
        escolherOpcao();
    }

    public static void escolherOpcao() {
        int opcao = scanner.nextInt();

        String json;
        switch (opcao) {
            case 1:
                json = busca.buscarTodosOsEstadios();
                FormatadorJson.formatarJson(json);
                break;
            case 2:
                System.out.print("Digite o nome do estádio que deseja buscar: ");
                scanner.nextLine();
                String estadioPesquisado = scanner.nextLine();
                json = busca.buscarEstadiosPorNome(estadioPesquisado);
                FormatadorJson.formatarJson(json);
                break;
            case 3:
                System.out.print("Digite o nome do time que deseja buscar: ");
                scanner.nextLine();
                String timePesquisado = scanner.nextLine();
                json = busca.buscarEstadiosPorTime(timePesquisado);
                FormatadorJson.formatarJson(json);
                break;
            case 4:
                return;
            default:
                System.out.println("A opção digitada não é válida. Tente novamente.");
                break;
        }
        exibirMenu();
    }
}