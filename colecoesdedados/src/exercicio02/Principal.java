package exercicio02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 10.55, 5);
        Produto produto2 = new Produto("Boné", 21.50, 12);
        Produto produto3 = new Produto("Taco de golfe", 45.00, 2);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 2.50, 10, "2025-12-31");
        System.out.println("Produto perecível: " + produtoPerecivel);

        produtos.add(produtoPerecivel);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Primeiro produto: " + produtos.get(0));

        System.out.println(produtos);
    }
}
