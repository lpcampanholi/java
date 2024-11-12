package exercicios04.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        double temperaturaEmFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + temperaturaEmFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFarenheit) {
        double temperaturaEmCelsius = (5.0 / 9.0) * (temperaturaFarenheit - 32);
        System.out.println("Temperatura em Celsius: " + temperaturaEmCelsius);
    }

}
