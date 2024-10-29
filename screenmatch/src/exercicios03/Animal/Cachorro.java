package exercicios03.Animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Latindo: late, late, late");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
