public class Desconto {
    public static void main(String[] arg) {
        double precoOriginal = 125.30;
        double percentualDesconto = 10;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("O preço com desconto: R$" + novoPreco);
    }
}