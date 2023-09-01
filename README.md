# Estádios API
![Status: Em desenvolvimento](https://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=f2eb72&style=for-the-badge)

Este projeto visa demonstrar o consumo via Java de uma API REST criada no mockAPI.

A aplicação desenvolvida faz requisições GET ao endpoint hospedado no mockAPI, formata o JSON recebido e imprime as informações no console.

A API criada é composta pelas informações dos estádios dos principais times de futebol de SP e RJ. Cada registro da API é composto das seguintes informações:

| Parâmetro    | Descrição                              |
|--------------|----------------------------------------|
| `nome`       | Nome popular do estádio                |
| `time`       | Time mandante do estádio               |
| `capacidade` | Capacidade de público em dias de jogos |
| `id`         | Identificador do registro              |

Endpoint:
`
https://649d7b029bac4a8e669dd151.mockapi.io/estadios
`

## Como rodar a aplicação:
1. Baixe o projeto em sua máquina;
2. Abra-o com o IntelliJ (ou outra IDE Java);
3. Execute a classe Main.

## Funcionalidades:
- Buscar todos os estádios cadastrados na API: <br>
![estadios_buscar-todos](https://github.com/rpriolo/estadios/assets/85913476/eb56d540-4574-4987-83c1-364cf640f48c)

- Buscar estádios por nome: <br>
![estadios_buscar-por-nome](https://github.com/rpriolo/estadios/assets/85913476/caab7376-f349-45cb-a3cb-e762573f88d9)

- Buscar estádios por time mandante: <br>
![estadios_buscar-por-time](https://github.com/rpriolo/estadios/assets/85913476/3b5ec9ce-f6dc-48ed-8b97-c6467cfc70f7)

## Desenvolvido usando...
- Java
- Gson
- Maven
- mockAPI

## Melhorias futuras:
- Apresentação de erros ao buscar registro inexistente;
- Criação de exceções.
