import java.util.Scanner;

public class For {
    public static void main(String[] arg) {
        Scanner Leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Avaliação " + i + 1 + " :");
            nota = Leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.print("Média de avaliações: " + mediaAvaliacao / 3);
    }
}