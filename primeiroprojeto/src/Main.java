public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas da Jack, do Paulo e Suelen
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        /* Comentario em bloco */

        String sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        String textoParagrafo = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco
                laboris nisi ut aliquip ex ea commodo consequat. Duis aute
                irure dolor in reprehenderit in voluptate velit esse cillum 
                olore eu fugiat nulla pariatur.
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui
                officia deserunt mollit anim id est laborum.
                """;
        System.out.println(textoParagrafo);

        int classificacao;
        classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}
