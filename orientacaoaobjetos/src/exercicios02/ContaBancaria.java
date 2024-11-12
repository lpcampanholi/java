package exercicios02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int setNumeroConta(int numeroConta) {
        return this.numeroConta = numeroConta;
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }
}
