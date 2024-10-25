package exercicios;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] arg) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = leitura.nextInt();
        if (number >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo");
        }
    }
}



