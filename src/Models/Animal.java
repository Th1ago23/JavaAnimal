package Models;

public class Animal {
    private String nome;
    private double peso;
    private String raça;

    public Animal(String nome, double peso, String raça) {
        this.nome = nome;
        this.peso = peso;
        this.raça = raça;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void emitirSom(){
        System.out.println("Emitindo som...");
    }
}
