public class ConversaoMoeda {
    public static void main(String[] arg) {
        double valorEmDolares = 2.85;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor de " + valorEmDolares + " dolares em reais é " + valorEmReais);
    }
}
