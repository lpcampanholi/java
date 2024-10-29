package exercicios;

public class Principal {
    public static void main(String[] args) {

        // Pessoa
        Pessoa rogerio = new Pessoa();
        rogerio.saudacao();

        // Calculadora
        Calculadora casio = new Calculadora();
        double resultado = casio.dobrar(2.4);
        System.out.println(resultado);

        // Musica
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Sunshine";
        minhaMusica.artista = "LP";
        minhaMusica.anoLancamento = 2024;
        minhaMusica.exibirFichaTecnica();

        minhaMusica.avaliar(8.5);
        minhaMusica.avaliar(5.2);
        minhaMusica.avaliar(8.9);
        minhaMusica.avaliar(6.2);

        double mediaAvaliacoes = minhaMusica.calcularMediaAvaliacoes();
        System.out.println("Média das Avaliações: " + mediaAvaliacoes);
        System.out.println("Total de avaliações: " + minhaMusica.numeroDeAvaliacoes);

        // Carro
        Carro meuCarro = new Carro();
        meuCarro.ano = 1978;
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";
        meuCarro.exibirFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calcularIdade() + " anos");

        // Aluno
        Aluno lucas = new Aluno();
        lucas.nome = "Rogério";
        lucas.idade = 16;
        lucas.exibirInformacoes();
    }
}
