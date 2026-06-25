# 🤖 Chatbot de Atendimento (WhatsApp)

## 🎯 Objetivo
Desenvolver uma API em Java para atuar como webhook de um bot de WhatsApp, automatizando o atendimento, a triagem de setores (Jurídico, Clube, Social) e as respostas aos usuários.

## 🏗️ Arquitetura do Projeto
O projeto foi estruturado utilizando o padrão de Arquitetura em Camadas, garantindo que cada classe tenha uma responsabilidade única, facilitando a manutenção e a escalabilidade.

### Camadas e Classes Atuais:

*   📦 **Model (`br.com.iran.model`)**
    *   Objetivo: Armazenar e transportar os dados puros dentro do sistema.
    *   **`MensagemUsuario.java`**: Representa a requisição limpa. Recebe e guarda apenas o número do celular do remetente e o texto da mensagem recebida.

*   🧠 **Service (`br.com.iran.service`)**
    *   *A ser implementado.* Conterá toda a lógica de negócio, menus e regras de decisão do bot.

*   🚦 **Controller (`br.com.iran.controller`)**
    *   *A ser implementado.* Será o ponto de entrada (Webhook) para receber o JSON da API da Meta.

*   ✉️ **Client (`br.com.iran.client`)**
    *   *A ser implementado.* Fará a comunicação HTTP de saída, empacotando e enviando a resposta de volta ao WhatsApp.