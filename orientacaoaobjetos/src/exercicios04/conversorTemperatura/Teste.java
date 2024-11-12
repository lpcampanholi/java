package exercicios04.conversorTemperatura;

public class Teste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(23);
        conversor.fahrenheitParaCelsius(120);
    }
}
