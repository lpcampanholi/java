public class Temperatura {
    public static void main(String[] arg) {
        double temperaturaCelsius = 38;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);

    }
}