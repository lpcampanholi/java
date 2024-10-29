package ProjetoContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = leitura.nextLine();

        System.out.println("Tipo de conta: ");
        String tipoConta = leitura.nextLine();

        System.out.println("Saldo inicial: ");
        double saldo = leitura.nextDouble();

        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo : " + saldo);
        System.out.println("*********************************");

        int opcao = 0;
        String Menu = """
                    Operações:
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;

        while (opcao != 4) {

            System.out.println(Menu);
            System.out.println("Digite a opcao desejada: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor a ser recebido: ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.println("Valor a ser transferido: ");
                    double saque = leitura.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Não é possível transferir, você não tem saldo suficiente!");
                    } else {
                        saldo -= saque;
                    }
                    System.out.println("Saldo: " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo. Obrigado pela preferência!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
