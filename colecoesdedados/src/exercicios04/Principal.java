package exercicios04;

import java.util.ArrayList;
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

        System.out.println("Títulos: " + titulos);
        System.out.println("Ordenando... ");
        titulos.

    }
}
