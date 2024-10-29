package exercicios03.ContaBancaria;

public class ContaBancaria {
    protected double saldo;

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Insira um valor positivo!");
        } else {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
        }
    }

    public void sacar(double valor) {
        if (valor >= saldo) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        }
    }
}
