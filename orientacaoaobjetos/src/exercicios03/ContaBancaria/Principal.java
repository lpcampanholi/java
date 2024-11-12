package exercicios03.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.depositar(1000);
        minhaConta.depositar(250);
        minhaConta.depositar(-200);
        minhaConta.consultarSaldo();
        minhaConta.sacar(1220);
        minhaConta.sacar(250);
        minhaConta.cobrarTarifaMensal();
    }
}
