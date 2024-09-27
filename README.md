# Pass Screm

Pass Screm é um aplicativo Android simples que demonstra a troca de dados entre atividades (telas) utilizando `Intents`. O projeto envolve o envio de uma idade inserida pelo usuário na tela principal para uma segunda tela, onde uma mensagem é exibida indicando se o usuário é maior ou menor de idade.

## Funcionalidades

- Permite ao usuário inserir a sua idade na tela principal.
- Envia a idade para uma segunda tela, onde uma mensagem é exibida com base no valor inserido.
- Se o usuário for menor de 18 anos, uma mensagem indicará que ele é menor de idade, e o contrário para maiores de idade.
- Tratamento de entradas inválidas: caso o usuário insira um valor não numérico, a idade será tratada como zero.
- UI imersiva, utilizando `WindowInsetsCompat` para ajustar o layout em telas completas.

## Demonstração

### Tela Principal

A tela principal contém:
- Um campo de texto para inserir a idade.
- Um botão "Enviar" que envia a idade para a próxima tela.

### Tela Secundária

A tela secundária:
- Exibe a idade recebida da tela principal.
- Exibe uma mensagem personalizada baseada na idade inserida (maior ou menor de idade).
- Contém um botão "Retornar" para voltar à tela principal.

## Como Funciona

### 1. MainActivity

Na `MainActivity`, o usuário insere sua idade e, ao pressionar o botão "Enviar", o valor é passado para a `SegundaActivity` através de um `Intent`. O código faz o tratamento para garantir que apenas números sejam aceitos, e se ocorrer uma inserção inválida, a idade será considerada zero.

### 2. SegundaActivity

Na `SegundaActivity`, a idade recebida é usada para exibir uma mensagem de maior ou menor de idade, dependendo do valor recebido. Há um botão para retornar à tela anterior.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para desenvolver o aplicativo.
- **Android SDK**: Conjunto de ferramentas usadas para desenvolver o aplicativo.
- **Intents**: Para comunicação entre atividades.
- **WindowInsetsCompat**: Para tratar barras do sistema e criar uma interface imersiva.
- **XML**: Para definir o layout das atividades.

## Como Executar o Projeto

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) instalado.
- Emulador Android ou dispositivo físico para testes.

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/pass-screm.git
