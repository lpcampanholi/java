package exercicios03.Animal;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miando de saudade. Miau, miau, miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando os móveis");
    }
}
