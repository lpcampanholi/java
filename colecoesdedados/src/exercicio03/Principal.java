package exercicio03;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Nomes

        String nome1 = "José";
        String nome2 = "João";
        String nome3 = "Andrade";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);

        System.out.println(nomes);

        for (String elemento : nomes) {
            System.out.println(elemento);
        }

        // Casting

       Animal animal = new Animal();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro");
        }

        // Produtos

        Produto bone = new Produto("Boné", 15.50);
        Produto camiseta = new Produto("Camiseta", 89.90);
        Produto tenis = new Produto ("Tênis Lacoste", 590.90);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(bone);
        produtos.add(camiseta);
        produtos.add(tenis);

        double somaDosPrecos = 0;
        for (Produto item : produtos) {
            somaDosPrecos += item.getPreco();
        }
        System.out.println("Soma dos preços: " + somaDosPrecos);

        double precoMedioDosProdutos = somaDosPrecos / produtos.size();
        System.out.println("Preço médio dos produtos: " + precoMedioDosProdutos);

        // Formas

        Quadrado quadrado1 = new Quadrado(1.5);
        Quadrado quadrado2 = new Quadrado(2.7);
        Quadrado quadrado3 = new Quadrado(4.2);
        Circulo circulo1 = new Circulo(2.8);
        Circulo circulo2 = new Circulo(1.9);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(quadrado3);
        formas.add(circulo1);
        formas.add(circulo2);

        for (Forma item : formas) {
            System.out.println("Área: " + item.calcularArea());
        }

        // Contas Bancárias

        ContaBancaria conta1 = new ContaBancaria(1, 10.50);
        ContaBancaria conta2 = new ContaBancaria(2, 20.20);
        ContaBancaria conta3 = new ContaBancaria(3, 13.10);
        ContaBancaria conta4 = new ContaBancaria(4, 100.00);
        ContaBancaria conta5 = new ContaBancaria(5, 145.10);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        ContaBancaria contaComMaiorSaldo = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaComMaiorSaldo.getSaldo()) {
                contaComMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo: " + contaComMaiorSaldo);
    }
}
