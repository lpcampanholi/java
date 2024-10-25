import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] arg) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa = 0;

        System.out.println("Bem-vindo ao jogo do número secreto! São válidos números entre 0 e 100.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Escreva um número: ");
            int numeroChutado = leitura.nextInt();

            if (numeroChutado == numeroAleatorio) {
                System.out.println("Você acertou, parabéns!!! O número secreto é: " + numeroAleatorio);
                break;
            } else if (numeroChutado > numeroAleatorio) {
                System.out.println("O número secreto é menor! Tente novamente.");
            } else {
                System.out.println("O número secreto é maior! Tente novamente.");
            }

            System.out.println("Você tem mais " + (5 - i) + " tentativa(s).");

            if (i == 5) {
                System.out.println("Você não conseguiu acertar em 5 tentativas! O número secreta era: " + numeroAleatorio);
            }
        }
    }
}
