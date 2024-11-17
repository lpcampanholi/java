package exercicio01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.setNome("Luis");
        eu.setIdade(30);

        Pessoa joao = new Pessoa();
        joao.setNome("João");
        joao.setIdade(38);

        Pessoa ana = new Pessoa();
        ana.setNome("Ana");
        ana.setIdade(27);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(eu);
        listaDePessoas.add(joao);
        listaDePessoas.add(ana);
        System.out.println("Tamanho da Array: " + listaDePessoas.size());
        System.out.println("Lista completa: " + listaDePessoas);
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).toString());

    }
}
