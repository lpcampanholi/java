package exercicios04.livros;

public class ProdutoFisico extends Produto implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
