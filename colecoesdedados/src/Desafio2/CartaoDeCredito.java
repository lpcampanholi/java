package Desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(Compra compra) {
        if (compra.getValor() < this.saldo) {
            compras.add(compra);
            this.saldo -= compra.getValor();
            return true;
        }
        return false;
    }

    public void imprimirFatura() {
        System.out.println("*******************\n");

        Collections.sort(compras);

        for (Compra compra : compras) {
            System.out.println(compra.toString());
        }

        System.out.println("\n*******************");
        System.out.println("Saldo disponível: " + this.saldo);
    }
}
