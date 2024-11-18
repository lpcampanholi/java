package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public double getSaldo() {
        return this.saldo;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }

    }

    public void imprimirFatura() {
        System.out.println("************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(compras);

        for (Compra item : compras) {
            System.out.println(item.toString());
        }

        System.out.println("\n ************************");
        System.out.println("\nSaldo disponível: " + getSaldo());
    }
}
