package exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numeroDeAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliar(double novaAvaliacao) {
        somaAvaliacoes += novaAvaliacao;
        numeroDeAvaliacoes++;
    }

    double calcularMediaAvaliacoes() {
        return somaAvaliacoes / numeroDeAvaliacoes;
    }

}
