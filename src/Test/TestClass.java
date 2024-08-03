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
