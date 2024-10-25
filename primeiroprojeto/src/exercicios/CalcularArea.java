package exercicios;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Lado do quadrado: ");
                    double lado = leitura.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("A área do quadrado é igual a " + areaQuadrado);
                    break;
                case 2:
                    System.out.println("Raio do círculo: ");
                    double raio = leitura.nextDouble();
                    double areaCirculo = raio * raio * Math.PI;
                    System.out.println("A área do círculo é igual a " + areaCirculo);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    opcao = leitura.nextInt();
            }
        } while (opcao != 3);
    }
}
