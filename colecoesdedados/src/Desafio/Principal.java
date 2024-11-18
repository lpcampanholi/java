package Desafio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        // Loop de compra
        int sair = 1;
        while (sair != 0) {
            System.out.println("Descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        cartao.imprimirFatura();

    }
}
