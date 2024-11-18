package exercicios04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        // Comparação de inteiros

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(42);
        numeros.add(34);
        numeros.add(78);
        numeros.add(21);

        System.out.println(numeros);
        System.out.println("Ordenando a lista...");
        Collections.sort(numeros);
        System.out.println(numeros);

        // Ordenar classe Título

        Titulo titulo1 = new Titulo("The girl next door");
        Titulo titulo2 = new Titulo("Doggville");
        Titulo titulo3 = new Titulo("Barbie");

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);

        System.out.println(titulos);
        System.out.println("Ordenando... ");
        Collections.sort(titulos);

        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());
        }

        // ArrayList & LinkedList

        List<String> lista = new LinkedList<>();
        String nome1 = "Joao";
        String nome2 = "Antonio";
        String nome3 = "Jose";
        String nome4 = "Maria";
        String nome5 = "Eliana";

        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);
        lista.add(nome4);
        lista.add(nome5);

        System.out.println(lista);
        System.out.println("Ordenando...");
        Collections.sort(lista);
        System.out.println(lista);


    }
}
