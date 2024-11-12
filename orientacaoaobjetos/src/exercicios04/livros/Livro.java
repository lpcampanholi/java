package exercicios04.livros;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
