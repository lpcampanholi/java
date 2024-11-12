package exercicios03.Carro;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano1: " + precoAno1);
        System.out.println("Preço Ano2: " + precoAno2);
        System.out.println("Preço Ano3: " + precoAno3);
        System.out.println("Maior Preço: " + obterMaiorPreco());
        System.out.println("Menor Preço: " + obterMenorPreco());
    }

    private double obterMaiorPreco() {
        double maiorPreco = precoAno1;
        if (precoAno2 > precoAno1) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > precoAno2) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    private double obterMenorPreco() {
        double menorPreco = precoAno1;
        if (precoAno2 < precoAno1) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < precoAno2) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

}
