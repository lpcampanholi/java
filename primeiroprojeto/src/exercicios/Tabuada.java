package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("TABUADA");
        System.out.println("Digite um número: ");
        double numero = leitura.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
