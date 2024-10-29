package exercicios03.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 0.1;

    public void cobrarTarifaMensal() {
        saldo = saldo - (saldo * tarifaMensal);
        System.out.println("Tarifa mensal de " + (tarifaMensal * 100) + "%" + " cobrada. Saldo atual: " + saldo);
    }
}
