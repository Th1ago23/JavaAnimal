package Models;

public class Cachorro extends Animal{
    public Cachorro(String nome, double peso, String raça) {
        super(nome, peso, raça);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au...");
    }
}
