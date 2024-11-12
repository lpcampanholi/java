package desafio.principal;

import desafio.modelos.MinhasPreferidas;
import desafio.modelos.Musica;
import desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for(int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for(int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for(int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for(int i= 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast);
        preferidas.incluir(minhaMusica);

    }
}
