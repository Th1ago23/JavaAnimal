package Models;

public class Gato extends Animal {
    public Gato(String nome, double peso, String raça) {
        super(nome, peso, raça);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau...");
    }
}
