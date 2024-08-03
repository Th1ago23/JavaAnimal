# Projeto de Animais

Este projeto demonstra um sistema de gerenciamento de animais em Java. Inclui classes para representar animais genéricos e subclasses específicas para Cachorro e Gato. Também contém métodos para emitir sons específicos para cada tipo de animal.

## Índice

- [Instalação](#instalação)
- [Uso](#uso)
- [Contribuindo](#contribuindo)
- [Licença](#licença)
- [Contato](#contato)

## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/usuario/nome-do-projeto.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd nome-do-projeto
    ```
3. Compile o projeto:
    ```bash
    javac -d bin src/Models/Animal.java src/Models/Cachorro.java src/Models/Gato.java src/Test/TestClass.java
    ```
4. Execute o projeto:
    ```bash
    java -cp bin Test.TestClass
    ```

## Uso

O projeto inclui as seguintes classes e métodos:

### Classes

- **Animal**: Representa um animal genérico.
  - Atributos: `nome`, `peso`, `raça`
  - Métodos: `getPeso`, `setPeso`, `getNome`, `setNome`, `getRaça`, `setRaça`, `emitirSom`

- **Cachorro**: Extende a classe Animal e representa um cachorro.
  - Métodos: `emitirSom` (sobrescrito para latido "Au au au...")

- **Gato**: Extende a classe Animal e representa um gato.
  - Métodos: `emitirSom` (sobrescrito para miado "Miau...")

### Exemplos

No arquivo `TestClass.java`, são criadas instâncias de `Cachorro` e `Gato` e são chamados métodos para obter informações e emitir sons.

```java
package Test;

import Models.Cachorro;
import Models.Gato;

public class TestClass {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Loki", 49.5d, "Golden Retrivier");
        System.out.println("Cachorro: ");
        System.out.println("Nome: " + cao.getNome());
        System.out.println("Peso: " + cao.getPeso());
        System.out.println("Raça: " + cao.getRaça());
        cao.emitirSom();
        System.out.println("\n");

        Gato cat = new Gato("Lucky", 5.3d, "Vira Lata");
        System.out.println("Gato: ");
        System.out.println("Nome: " + cat.getNome());
        System.out.println("Peso: " + cat.getPeso());
        System.out.println("Raça: " + cat.getRaça());
        cat.emitirSom();
    }
}
