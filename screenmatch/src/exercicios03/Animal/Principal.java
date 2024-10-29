package exercicios03.Animal;

public class Principal {
    public static void main(String[] args) {
        Animal jacare = new Animal();
        jacare.emitirSom();

        Cachorro teddy = new Cachorro();
        teddy.emitirSom();
        teddy.abanarRabo();

        Gato mingau = new Gato();
        mingau.emitirSom();
        mingau.arranharMoveis();
    }
}
