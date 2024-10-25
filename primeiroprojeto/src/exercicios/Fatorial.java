package exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("FATORIAL");
        System.out.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
    }
}
