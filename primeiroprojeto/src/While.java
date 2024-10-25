import java.util.Scanner;

public class While {
    public static void main(String[] arg) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacoes = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Avaliação para o filme: ");
            System.out.println("Digite -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacoes += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Média das avaliações: " + mediaAvaliacoes / totalDeNotas);
    }
}


