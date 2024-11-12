package exercicios03.Carro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Audi Q6");
        meuCarro.definirPrecos(559990, 729990, 287990);
        meuCarro.exibirInfo();
    }
}
